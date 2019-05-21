package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.entity.User;
import com.zhiyou100.imitatemodian.service.AccountService;
import com.zhiyou100.imitatemodian.service.UserService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author DingYC
 * @create 2019-05-17 11:17
 **/
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    private ResponseVo vo = new ResponseVo();

    @PostMapping("/login")
    public ResponseVo login(@RequestBody Account account) {

        User loginUser = accountService.login(account);

        session.setAttribute("loginUser",loginUser);
        ResponseVo vo1 = new ResponseVo();
        vo1.setCode(200);
        vo1.setData(loginUser);

        return vo1;
    }

    @PostMapping("/register1")
    public ResponseVo register1 (@RequestBody Account account) {

        Account registerAccount = accountService.register1(account);

        vo.setCode(200);
        vo.setData(registerAccount);

        return vo;
    }

    @PostMapping("/register2")
    public ResponseVo register2 (@RequestBody Account account) {

        User registerUser = accountService.register2(account);

        vo.setCode(200);
        vo.setData(registerUser);

        return vo;
    }

    @PutMapping("/updateCode")
    public ResponseVo updateCode (@RequestParam("email") String email) {

        Account account = accountService.updateCode(email);

        vo.setCode(200);
        vo.setData(account);

        return vo;
    }

    @PutMapping("/account")
    public ResponseVo updateAccount (@RequestBody Account account) {

        accountService.update(account);

        vo.setCode(200);
        return vo;
    }




}
