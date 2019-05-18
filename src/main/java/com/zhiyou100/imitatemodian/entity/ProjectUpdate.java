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
public class ProjectUpdate {

    @TableId(value = "project_update_id",type = IdType.AUTO)
    private Integer projectUpdateId;

    private Integer updateProjectBaseId;

    private Integer updateUserId;

    private String updateTitle;

    private String detail;

    private Date time;
}
