package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author DingYC
 * @create 2019-05-15 17:40
 **/
@Data
public class Star {

    @TableId(value = "star_id",type = IdType.AUTO)
    private Integer starId;

    private Integer starUserId;

    private Integer starProjectBaseId;

}
