package com.zhiyou100.imitatemodian.service.impl;

import com.zhiyou100.imitatemodian.entity.Comment;
import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import com.zhiyou100.imitatemodian.mapper.CommentMapper;
import com.zhiyou100.imitatemodian.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-16 8:32
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void insertComment(Comment comment) {

        commentMapper.insertComment(comment);
    }

    @Override
    public void deleteComment(Integer commentUserId, Integer userCommentId) {

        commentMapper.deleteComment(commentUserId,userCommentId);
    }

    // 查询普通的评论
    @Override
    public List<CommentUserDTO> baseComments(Integer userId, Integer projectBaseId) {

        List<CommentUserDTO> baseCommentsByIds = commentMapper.findBaseCommentsById(userId, projectBaseId);

        return baseCommentsByIds;
    }

    // 查询更新的评论
    @Override
    public List<CommentUserDTO> updateComments(Integer userId, Integer projectUpdateId) {

        List<CommentUserDTO> updateCommentsByIds = commentMapper.findUpdateCommentsById(userId, projectUpdateId);
        return updateCommentsByIds;
    }
}
