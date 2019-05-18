package com.zhiyou100.imitatemodian.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailUtilsTest {

    @Autowired
    private EmailUtils emailUtils;

    @Test
    public void setMail() {

        emailUtils.setMail("1812734016@qq.com","你好啊~~~");

    }
}