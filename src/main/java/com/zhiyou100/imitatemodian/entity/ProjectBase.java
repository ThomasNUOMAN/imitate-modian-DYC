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
public class ProjectBase {

    @TableId(value = "project_base_id",type = IdType.AUTO)
    private Integer projectBaseId;

    private Integer userId;

    private String title;

    private String subtitle;

    private String pcUrl;

    private String appUrl;

    private String projectItdc;

    private Date startTime;

    private Date endTime;

    private Integer targetAmount;

    private Integer raiseAmount;

    private Integer status;
}
