package com.zhiyou100.imitatemodian.exception;

/**
 * @author DingYC
 * @create 2019-05-13 16:33
 **/

public class MyException extends RuntimeException{
    // RuntimeException 中已经有 message 属性,自定义异常只需添加 code 即可
    private Integer code;

    public MyException(Integer code, String message) {

        // message 参数赋值给父类的 message 属性
        super(message);

        // code 参数赋值给当前类的属性
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }
}
