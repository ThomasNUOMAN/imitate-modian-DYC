package com.zhiyou100.imitatemodian.mapper;

import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void testCommentUserDTO() {


        List<CommentUserDTO> baseCommentsById = commentMapper.findBaseCommentsById(1, 2);

        List<CommentUserDTO> updateCommentsById = commentMapper.findUpdateCommentsById(2, 1);

        for (int i = 0; i < baseCommentsById.size(); i++) {
            System.out.println("第" + (i+1) + "个:  " + baseCommentsById);
        }

        for (int i = 0; i < updateCommentsById.size(); i++) {
            System.out.println("第" + (i+1) + "个:  " + updateCommentsById);
        }

    }



}