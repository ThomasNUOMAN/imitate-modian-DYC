package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author DingYC
 * @create 2019-05-15 15:06
 **/

@Data
public class Account {

    @TableId(value = "account_id",type = IdType.AUTO)
    private Integer accountId;

    private String email;

    private String password;

    private String code;

    private Date codeSendTime;

    private Date lastLoginTime;

    private String lastLoginIp;

}
