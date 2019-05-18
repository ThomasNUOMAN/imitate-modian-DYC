package com.zhiyou100.imitatemodian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhiyou100.imitatemodian.entity.ProjectUpdate;
import com.zhiyou100.imitatemodian.entity.UserProjectBaseDTO;
import com.zhiyou100.imitatemodian.mapper.ProjectUpdateMapper;
import com.zhiyou100.imitatemodian.service.ProjectUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-15 20:52
 **/
@Service
public class ProjectUpdateServiceImpl implements ProjectUpdateService {

    @Autowired
    private ProjectUpdateMapper projectUpdateMapper;

    @Override
    public ProjectUpdate getById(Integer projectId) {

        ProjectUpdate projectUpdate = projectUpdateMapper.selectById(projectId);
        return projectUpdate;
    }

    @Override
    public ProjectUpdate update(ProjectUpdate projectUpdate) {

        ProjectUpdate proUp = new ProjectUpdate();
        proUp.setUpdateUserId(projectUpdate.getUpdateUserId());
        proUp.setUpdateProjectBaseId(projectUpdate.getUpdateProjectBaseId());
        proUp.setUpdateTitle(projectUpdate.getUpdateTitle());
        proUp.setDetail(projectUpdate.getDetail());
        proUp.setTime(projectUpdate.getTime());

        projectUpdateMapper.update(proUp,new QueryWrapper<ProjectUpdate>().eq(true,"project_update_id",projectUpdate.getProjectUpdateId()));

        return proUp;
    }

}
