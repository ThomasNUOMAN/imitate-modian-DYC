package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.exception.MyException;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public ResponseVo myExceptionHandler(MyException ex) {

        ResponseVo vo = new ResponseVo();
        vo.setCode(ex.getCode());
        vo.setMessage(ex.getMessage());

        return vo;
    }

}
