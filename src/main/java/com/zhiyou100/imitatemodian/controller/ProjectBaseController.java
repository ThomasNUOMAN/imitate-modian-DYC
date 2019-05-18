package com.zhiyou100.imitatemodian.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.ProjectBase;
import com.zhiyou100.imitatemodian.entity.ProjectDetail;
import com.zhiyou100.imitatemodian.entity.UserProjectBaseDTO;
import com.zhiyou100.imitatemodian.service.ProjectBaseService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-18 8:29
 **/
@RestController
public class ProjectBaseController {

    @Autowired
    private ProjectBaseService projectBaseService;

    private ResponseVo vo = new ResponseVo();

//    @GetMapping("/projectBase/{userId}")
//    public ResponseVo getById(@PathVariable("userId") Integer userId) {
//
//        List<UserProjectBaseDTO> byId = projectBaseService.getById(userId);
//        vo.setCode(200);
//        vo.setData(byId);
//        return vo;
//    }

    // @NeedLogin
    @GetMapping("/selectProjectBases")
    public ResponseVo selectProjectBases(Page<UserProjectBaseDTO> page) {

        IPage<UserProjectBaseDTO> selectProjectBasesIPage = projectBaseService.projectBases(page);
        vo.setCode(200);
        vo.setData(selectProjectBasesIPage);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/selectProjectUpdates")
    public ResponseVo selectProjectUpdates(Page<UserProjectBaseDTO> page,
                                           @RequestParam("userId") Integer userId) {

        IPage<UserProjectBaseDTO> selectProjectUpdatesIPage = projectBaseService.baseStars(page,userId);
        vo.setCode(200);
        vo.setData(selectProjectUpdatesIPage);
        return vo;
    }

    // @NeedLogin
    @DeleteMapping("/deleteProject/{userId}")
    public ResponseVo deleteProject(@RequestParam("userId") Integer userId) {

        projectBaseService.deleteById(userId);
        vo.setCode(200);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/projectDetail/{userId}")
    public ResponseVo projectDetail(@RequestParam("userId") Integer userId) {

        ProjectDetail detailById = projectBaseService.detailById(userId);
        vo.setCode(200);
        vo.setData(detailById);
        return vo;
    }

    @PutMapping("/updateProject")
    public ResponseVo updateProject(@RequestBody ProjectBase projectBase) {

        ProjectBase updateProjectBase = projectBaseService.update(projectBase);
        vo.setCode(200);
        vo.setData(updateProjectBase);
        return vo;
    }

    @PostMapping("/saveProject")
    public ResponseVo saveProject(@RequestBody ProjectBase projectBase) {

        projectBaseService.save(projectBase);
        vo.setCode(200);
        return vo;
    }

}
