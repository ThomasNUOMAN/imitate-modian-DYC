package com.zhiyou100.imitatemodian.mapper;

import com.zhiyou100.imitatemodian.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testLogin() {

        Account account = new Account();
        account.setEmail("123456789@qq.com");
        accountMapper.findAccountByEmail(account);

    }




}