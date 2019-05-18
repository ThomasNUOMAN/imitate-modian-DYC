package com.zhiyou100.imitatemodian.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordUtilsTest {

    @Test
    public void saltMd5() {


        System.out.println(PasswordUtils.saltMd5("111222333444"));
    }
}