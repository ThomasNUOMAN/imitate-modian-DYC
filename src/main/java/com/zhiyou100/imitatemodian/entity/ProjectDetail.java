package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author DingYC
 * @create 2019-05-15 17:41
 **/
@Data
public class ProjectDetail {

    @TableId(value = "project_detail_id",type = IdType.AUTO)
    private Integer projectDetailId;

    private Integer detailProjectBaseId;

    private Integer detailUserId;

    private String videoUrl;

    private String detail;

}
