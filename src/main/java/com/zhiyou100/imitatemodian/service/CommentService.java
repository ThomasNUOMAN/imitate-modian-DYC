package com.zhiyou100.imitatemodian.service;

import com.zhiyou100.imitatemodian.entity.Comment;
import com.zhiyou100.imitatemodian.entity.CommentUserDTO;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-16 8:32
 **/

public interface CommentService {

    void insertComment(Comment comment);

    // 删除一条评论
    void deleteComment(Integer commentId, Integer userId);

    // 查询评论
    List<CommentUserDTO> baseComments(Integer userId, Integer projectBaseId);

    // 查询更新评论
    List<CommentUserDTO> updateComments(Integer userId, Integer projectUpdateId);

}
