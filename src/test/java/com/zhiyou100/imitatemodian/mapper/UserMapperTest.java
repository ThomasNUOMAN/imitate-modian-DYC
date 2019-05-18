package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper() {

//        Account account = new Account();
//        account.setEmail("1234567777@qq.com");
//        account.setPassword("123");
//        account.setCode("");
//        accountMapper.insert(account);
//
//        User user = new User();
//        user.setAccountId(3);
//        user.setNickName("葫芦小金刚");
//
//        for (int i = 0; i <5 ; i++) {
//
//            userMapper.insert(user);
//        }

//        user.setNickName("变形金刚葫芦娃");
////        userMapper.updateUserSelective(user);
//        userMapper.update(user,new QueryWrapper<User>().eq(true,"user_id",7));


        // 查询
//        userMapper.selectById(7);

        // 删除
//        userMapper.deleteById(8);


    }

}