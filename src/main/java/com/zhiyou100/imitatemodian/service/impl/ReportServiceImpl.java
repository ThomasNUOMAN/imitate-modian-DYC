package com.zhiyou100.imitatemodian.service.impl;

import com.zhiyou100.imitatemodian.entity.Report;
import com.zhiyou100.imitatemodian.mapper.ReportMapper;
import com.zhiyou100.imitatemodian.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DingYC
 * @create 2019-05-15 20:52
 **/
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public Report save(Report report) {

        Report saveReport = new Report();
        saveReport.setReportProjectBaseId(report.getReportProjectBaseId());
        saveReport.setTitle(report.getTitle());
        saveReport.setAstrict(report.getAstrict());
        saveReport.setPrice(report.getPrice());
        saveReport.setTime(report.getTime());
        saveReport.setDetail(report.getDetail());
        saveReport.setReportType(report.getReportType());
        saveReport.setIsRemark(report.getIsRemark());
        saveReport.setReportRemark(report.getReportRemark());

        reportMapper.updateById(saveReport);
        return saveReport;
    }

    @Override
    public Report getById(Integer reportId) {

        return reportMapper.selectById(reportId);
    }

    @Override
    public void removeById(Integer reportId) {

        reportMapper.deleteById(reportId);
    }
}
