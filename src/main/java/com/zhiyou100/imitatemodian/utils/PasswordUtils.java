package com.zhiyou100.imitatemodian.utils;

import org.springframework.util.DigestUtils;

/**
 * @author DingYC
 * @create 2019-05-15 15:35
 **/

public class PasswordUtils {

    // 盐
    private static String salt = "ai*&b_6%";

    /**
     * 对密码进行加盐 md5
     * @param password 原始密码
     * @return 加密的结果
     */

    public static String saltMd5(String password) {

        // 把不可变字符串,转换为可变字符串
        StringBuffer stringBuffer = new StringBuffer(password);

        // 向索引为 2 的位置插入数据
        stringBuffer.insert(2,salt);

        // 向索引为 5 的位置插入数据
        stringBuffer.insert(5,salt);

        // 把可变字符串转换为不可变字符串
        String saltPassword = stringBuffer.toString();

        // 使用 spring 内置的 md5 算法对 saltPassword进行加密
        String md5Password = DigestUtils.md5DigestAsHex(saltPassword.getBytes());

        return md5Password;
    }
}
