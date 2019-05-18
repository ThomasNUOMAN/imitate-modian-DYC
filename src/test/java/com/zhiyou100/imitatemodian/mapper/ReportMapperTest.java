package com.zhiyou100.imitatemodian.mapper;

import com.zhiyou100.imitatemodian.entity.Report;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportMapperTest {

    @Autowired
    private ReportMapper reportMapper;

    @Test
    public void testReport() {

//        Report report = new Report();
//        report.setAstrict(-1);
//        report.setReportProjectBaseId(2);
//        report.setTitle("只要998,幸福带回家");
//        report.setPrice(250);
//        report.setDetail("~~~啦啦啦啦啦~~~");
//        report.setTime(new Date());
//        report.setReportType(1);
//
//        for (int i = 0; i <3 ; i++) {
//
//            reportMapper.insert(report);
//        }
//
//        reportMapper.selectById(5);

        reportMapper.deleteById(14);
    }

}