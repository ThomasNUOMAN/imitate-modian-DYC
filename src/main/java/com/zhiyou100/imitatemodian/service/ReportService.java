package com.zhiyou100.imitatemodian.service;

import com.zhiyou100.imitatemodian.entity.Report;

/**
 * @author DingYC
 * @create 2019-05-15 19:07
 **/

public interface ReportService {

    Report save(Report report);

    Report getById(Integer reportId);

    void removeById(Integer reportId);
}
