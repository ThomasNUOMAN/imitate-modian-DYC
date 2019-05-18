package com.zhiyou100.imitatemodian.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author DingYC
 * @create 2019-05-14 11:18
 **/
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod)
                || ((HandlerMethod) handler).getMethodAnnotation(NeedLogin.class) == null) {
            // 不是 controller 中的方法 或者 是 controller 中的方法但没有注解

            return true;
        }

        Account loginUser = (Account) request.getSession().getAttribute("loginUser");

        if (loginUser == null) {

            // 没有登录过

            // 1. 封装错误数据为 ResopnseVo
            ResponseVo vo = new ResponseVo();
            vo.setCode(403005);
            vo.setMessage("请先登录");

            // 2. 把 ResponseVo 转换为 json 字符串
            String json = new ObjectMapper().writeValueAsString(vo);

            // 3. 返回 json 字符串给前端
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().println(json);

            return false;
        }

        return true;
    }
}
