package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.Star;
import com.zhiyou100.imitatemodian.entity.User;
import com.zhiyou100.imitatemodian.service.UserService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author DingYC
 * @create 2019-05-17 15:57
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    @Autowired
    private HttpServletRequest request;

    private ResponseVo vo = new ResponseVo();

    @PutMapping("/user")
    public ResponseVo updateAccount (@RequestBody User user) {

        User updateUser = userService.update(user);

        vo.setCode(200);
        vo.setData(updateUser);
        return vo;
    }

    // @NeedLogin
    @DeleteMapping("/user/{id}")
    public ResponseVo updateAccount (@PathVariable("id") Integer id) {

        userService.removeById(id);

        vo.setCode(200);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/getStar")
    public ResponseVo getStar (@RequestBody Star star) {

        User loginUser = (User) request.getSession().getAttribute("loginUser");
        star.setStarUserId(loginUser.getUserId());
        session.setAttribute("userId",star.getStarUserId());
        userService.getStar(star);
        vo.setCode(200);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/deleteStar")
    public ResponseVo deleteStar (@RequestBody Star star) {

        session.removeAttribute("userId");
        userService.deleteStar(star);
        vo.setCode(200);
        return vo;
    }

}
