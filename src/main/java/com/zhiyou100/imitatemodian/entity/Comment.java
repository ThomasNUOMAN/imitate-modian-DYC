package com.zhiyou100.imitatemodian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author DingYC
 * @create 2019-05-15 17:40
 **/
@Data
public class Comment {

    @TableId(value = "user_comment_id",type = IdType.AUTO)
    private Integer userCommentId;

    private Integer commentUserId;

    private Integer commentProjectBaseId;

    private Integer commentProjectUpdateId;
    
    private String commentDetail;
    
    private String img;
}
