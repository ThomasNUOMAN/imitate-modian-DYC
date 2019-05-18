package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author DingYC
 * @create 2019-05-15 17:41
 **/
@Data
public class Report {

    @TableId(value = "report_id",type = IdType.AUTO)
    private Integer reportId;

    private Integer reportProjectBaseId;

    private Integer astrict;

    private Integer price;

    private String title;

    private String detail;

    private Date time;

    private Integer reportType;

    private String reportRemark;

    private Integer isRemark;


}
