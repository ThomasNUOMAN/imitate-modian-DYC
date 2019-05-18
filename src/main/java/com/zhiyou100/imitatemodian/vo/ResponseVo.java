package com.zhiyou100.imitatemodian.vo;

/**
 * @author DingYC
 * @create 2019-05-14 9:12
 **/

import lombok.Data;

/**
 * api 接口返回数据的统一包装类
 * @param <T>
 */
@Data
public class ResponseVo<T> {

    /**
     * 状态码: 正确结果:200 错误结果: 40 开头
     */
    private Integer code;

    /**
     * 对应错误结果状态码的解释说明
     */
    private String message;

    /**
     * 正确结果的返回数据
     */
    private T data;

}
