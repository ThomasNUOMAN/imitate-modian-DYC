package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.imitatemodian.entity.Comment;
import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-16 14:22
 **/

public interface CommentMapper extends BaseMapper<CommentUserDTO> {

    void insertComment(Comment comment);
    void deleteComment(@Param("userCommentId") Integer commentId,@Param("commentUserId") Integer userId);
    List<CommentUserDTO> findBaseCommentsById(@Param("userId") Integer userId, @Param("projectBaseId") Integer projectBaseId);
    List<CommentUserDTO> findUpdateCommentsById(@Param("userId") Integer userId, @Param("projectUpdateId") Integer projectUpdateId);


}
