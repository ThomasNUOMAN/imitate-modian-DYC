package com.zhiyou100.imitatemodian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.entity.User;
import com.zhiyou100.imitatemodian.exception.MyException;
import com.zhiyou100.imitatemodian.mapper.AccountMapper;
import com.zhiyou100.imitatemodian.mapper.UserMapper;
import com.zhiyou100.imitatemodian.service.AccountService;
import com.zhiyou100.imitatemodian.utils.EmailUtils;
import com.zhiyou100.imitatemodian.utils.NumberUtils;
import com.zhiyou100.imitatemodian.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author DingYC
 * @create 2019-05-15 20:51
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public User login(Account account) {

        Account accountByEmail = accountMapper.findAccountByEmail(account);

        if (accountByEmail == null){

            // 邮箱错误
            throw new MyException(403004,"邮箱错误");
        }

        if (!accountByEmail.getPassword().equals(PasswordUtils.saltMd5(account.getPassword()))) {

            // 密码错误
            throw new MyException(403005,"密码错误");
        }

        account.setLastLoginTime(new Date());
        account.setLastLoginIp(request.getRemoteAddr());
        accountMapper.updateAccount(account);
        User user = userMapper.selectOne(new QueryWrapper<User>().eq(true,"account_id",account.getAccountId()));

        return user;
    }

    @Override
    public Account register1(Account account) {
        Account accountByEmail = accountMapper.findAccountByEmail(account);

        if (accountByEmail != null) {
            if (accountByEmail.getEmail().equals(account.getEmail())) {

                throw new MyException(403001,"账号已存在");
            }
        }

        Account saveAccount = new Account();
        // 保存注册信息 + 验证码
        Date date = new Date();

        saveAccount.setEmail(account.getEmail());
        // 加盐
        saveAccount.setPassword(PasswordUtils.saltMd5(account.getPassword()));
        // 随机验证码
        Integer ranNumber = NumberUtils.randomNumber(6);
        emailUtils.setMail(account.getEmail(),"您的验证码为: " + ranNumber + " ,请注意查收!有效时间30分钟,请及时使用!");
        saveAccount.setCode(ranNumber + "");
        saveAccount.setLastLoginTime(date);
        saveAccount.setLastLoginIp(request.getRemoteAddr());
        saveAccount.setCodeSendTime(date);

        accountMapper.insert(saveAccount);
        return saveAccount;
    }

    @Override
    public User register2(Account account) {

        Account saveAccountById = accountMapper.findAccountByEmail(account);

        // 发送验证码并对比验证码
        if (!saveAccountById.getCode().equals(account.getCode())) {

            throw new MyException(403002,"验证码错误");
        }

        Date codeSendTimeBegin = saveAccountById.getCodeSendTime();
        account.setCodeSendTime(new Date());
        Date codeSendTimeEnd = account.getCodeSendTime();

        // 分钟 暂时 先1分钟吧 方便测试
        System.out.println("验证码时间"+(((codeSendTimeEnd.getTime()- codeSendTimeBegin.getTime()) / 1000) % 60));
        if ( (((codeSendTimeEnd.getTime()- codeSendTimeBegin.getTime()) / 1000) % 60) > 60 ) {

            throw new MyException(403003,"验证码已过期");
        }

        System.out.println("恭喜您注册成功!");

        // 创建 User 对象
        User user = new User();
        user.setAccountId(saveAccountById.getAccountId());
        user.setNickName("mo" + NumberUtils.randomNumber(8));
        userMapper.insert(user);
        System.out.println("新注册的User --> " + user);
        return user;
    }

    @Override
    public Account updateCode(String email) {
        Account upCodeByEmail = accountMapper.selectOne(new QueryWrapper<Account>().eq(true,"email",email));

        // 随机验证码
        Integer randomCode = NumberUtils.randomNumber(6);
        emailUtils.setMail(email,"您的验证码为: " + randomCode + " ,请注意查收!有效时间30分钟,请及时使用!");
        upCodeByEmail.setCode(randomCode + "");
        accountMapper.update(upCodeByEmail,new QueryWrapper<Account>().eq(true,"email",email));
        System.out.println("更新验证码成功...");

        // 重新存
        new AccountServiceImpl().register2(upCodeByEmail);
        return upCodeByEmail;
    }

    @Override
    public Account update(Account account) {

        Account upAccountByEmail = accountMapper.findAccountByEmail(account);
        Date date = new Date();
        // 加盐
        upAccountByEmail.setPassword(PasswordUtils.saltMd5(account.getPassword()));
        upAccountByEmail.setLastLoginTime(date);
        upAccountByEmail.setLastLoginIp(request.getRemoteAddr());
        upAccountByEmail.setCodeSendTime(date);

        accountMapper.update(upAccountByEmail,new QueryWrapper<Account>().eq(true,"email",upAccountByEmail.getEmail()));

        return upAccountByEmail;
    }
}
