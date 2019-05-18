package com.zhiyou100.imitatemodian.controller;

import com.zhiyou100.imitatemodian.annotation.NeedLogin;
import com.zhiyou100.imitatemodian.entity.Comment;
import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import com.zhiyou100.imitatemodian.service.CommentService;
import com.zhiyou100.imitatemodian.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-18 8:29
 **/
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    private ResponseVo vo = new ResponseVo();

    // @NeedLogin
    @GetMapping("/baseComments")
    public ResponseVo selectBaseComment(@RequestParam("userId") Integer userId,
                                                  @RequestParam("projectBaseId") Integer projectBaseId) {
        List<CommentUserDTO> baseComments = commentService.baseComments(userId, projectBaseId);

//        CommentUserDTO selectBaseComment = null;
//        for (CommentUserDTO baseComment:
//             baseComments) {
//            selectBaseComment = baseComment;
//        }

        vo.setCode(200);
        vo.setData(baseComments);
        return vo;
    }

    // @NeedLogin
    @GetMapping("/updateComments")
    public ResponseVo selectUpdateComment(@RequestParam("userId") Integer userId,
                                        @RequestParam("projectUpdateId") Integer projectUpdateId) {
        List<CommentUserDTO> updateComments = commentService.updateComments(userId, projectUpdateId);

//        CommentUserDTO selectUpdateComment = null;
//        for (CommentUserDTO baseComment:
//                updateComments) {
//            selectUpdateComment = baseComment;
//        }

        vo.setCode(200);
        vo.setData(updateComments);
        return vo;
    }

    // @NeedLogin
    @DeleteMapping("/deleteComment")
    public ResponseVo deleteComment(@RequestParam("userCommentId") Integer commentId,
                                    @RequestParam("commentUserId") Integer userId) {
        commentService.deleteComment(commentId,userId);

        vo.setCode(200);
        return vo;
    }

    @PutMapping("/insertComment")
    public ResponseVo insertComment(@RequestBody Comment comment) {
        commentService.insertComment(comment);

        vo.setCode(200);
        return vo;
    }


}
