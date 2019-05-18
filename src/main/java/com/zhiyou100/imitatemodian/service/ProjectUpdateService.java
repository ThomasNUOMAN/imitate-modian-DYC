package com.zhiyou100.imitatemodian.service;

import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import com.zhiyou100.imitatemodian.entity.ProjectUpdate;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-15 19:08
 **/

public interface ProjectUpdateService {

    ProjectUpdate getById(Integer projectId);

    ProjectUpdate update(ProjectUpdate projectUpdate);

}
