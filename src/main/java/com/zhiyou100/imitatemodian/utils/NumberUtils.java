package com.zhiyou100.imitatemodian.utils;

/**
 * @author DingYC
 * @create 2019-05-15 15:17
 **/

public class NumberUtils {

    /**
     * 生成指定位数的随机数
     * @param length 位数
     * @return 随机数
     */
    public static Integer randomNumber(int length) {

        int a = 9;
        int b = 1;
        for (int i = 0; i < length - 1; i++) {

            a*=10;
            b*=10;
        }

        return (int) (Math.random()*a+b);
    }
























}
