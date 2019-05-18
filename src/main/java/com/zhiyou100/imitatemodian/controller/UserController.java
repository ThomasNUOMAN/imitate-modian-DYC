package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.User;
import com.zhiyou100.imitatemodian.service.UserService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DingYC
 * @create 2019-05-17 15:57
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

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

}
