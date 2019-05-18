package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author DingYC
 * @create 2019-05-15 17:37
 **/
@Data
public class User {

    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;

    private Integer accountId;

    private String gender;

    private Date birthday;

    private String headPortrait;

    private String nickName;

    private String introduction;

    private Integer attentionCount;

}
