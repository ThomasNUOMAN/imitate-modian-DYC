package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.Report;
import com.zhiyou100.imitatemodian.service.ReportService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DingYC
 * @create 2019-05-18 8:30
 **/
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    private ResponseVo vo = new ResponseVo();

    @PostMapping("/report")
    public ResponseVo save(@RequestBody Report report) {

        Report saveReport = reportService.save(report);

        vo.setCode(200);
        vo.setData(saveReport);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/report/{id}")
    public ResponseVo getById(@PathVariable("id") Integer reportId) {

        Report reportById = reportService.getById(reportId);

        vo.setCode(200);
        vo.setData(reportById);
        return vo;
    }

    // @NeedLogin
    @DeleteMapping("/report/{id}")
    public ResponseVo removeById(@PathVariable("id") Integer reportId) {

        reportService.removeById(reportId);

        vo.setCode(200);
        return vo;
    }



}
