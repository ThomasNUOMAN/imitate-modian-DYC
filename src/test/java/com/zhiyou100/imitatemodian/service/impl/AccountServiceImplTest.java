package com.zhiyou100.imitatemodian.service.impl;

import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceImplTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void login() {

        Account account = new Account();
        account.setEmail("123456789@qq.com");
        Account dbAccount = accountMapper.findAccountByEmail(account);
        System.out.println("数据库返回的 dbAccount --> " + dbAccount);
    }
}