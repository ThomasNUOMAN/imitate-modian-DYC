package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.ProjectUpdate;
import com.zhiyou100.imitatemodian.service.ProjectUpdateService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DingYC
 * @create 2019-05-18 8:29
 **/
@RestController
public class ProjectUpdateController {

    @Autowired
    private ProjectUpdateService projectUpdateService;

    private ResponseVo vo = new ResponseVo();

    // @NeedLogin
    @GetMapping("/projectUpdate/{projectUpdateId}")
    public ResponseVo getById(@PathVariable("projectUpdateId") Integer projectUpdateId) {

        ProjectUpdate projectUpdateById = projectUpdateService.getById(projectUpdateId);

        vo.setCode(200);
        vo.setData(projectUpdateById);
        return vo;
    }

    @PutMapping("/projectUpdate")
    public ResponseVo update(@RequestBody ProjectUpdate projectUpdate) {

        ProjectUpdate updateProjectUpdate = projectUpdateService.update(projectUpdate);

        vo.setCode(200);
        vo.setData(updateProjectUpdate);
        return vo;
    }








}
