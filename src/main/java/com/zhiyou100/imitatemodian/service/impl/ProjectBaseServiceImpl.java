package com.zhiyou100.imitatemodian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou100.imitatemodian.entity.ProjectBase;
import com.zhiyou100.imitatemodian.entity.ProjectDetail;
import com.zhiyou100.imitatemodian.entity.UserProjectBaseDTO;
import com.zhiyou100.imitatemodian.mapper.ProjectBaseMapper;
import com.zhiyou100.imitatemodian.mapper.ProjectDetailMapper;
import com.zhiyou100.imitatemodian.mapper.UserProjectBaseDTOMapper;
import com.zhiyou100.imitatemodian.service.ProjectBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-15 20:52
 **/
@Service
public class ProjectBaseServiceImpl implements ProjectBaseService {

    @Autowired
    private UserProjectBaseDTOMapper userProjectBaseDTOMapper;

    @Autowired
    private ProjectBaseMapper projectBaseMapper;

    @Autowired
    private ProjectDetailMapper projectDetailMapper;


    @Override
    public List<UserProjectBaseDTO> getById(Integer userId) {

        List<UserProjectBaseDTO> UserProjectBaseById = userProjectBaseDTOMapper.selectList(new QueryWrapper<UserProjectBaseDTO>().eq(true, "user_id", userId));
        return UserProjectBaseById;
    }

    @Override
    public IPage<UserProjectBaseDTO> projectBases(Page<UserProjectBaseDTO> page) {

        page = new Page<>(1,3);

        IPage<UserProjectBaseDTO> userProjectBaseIPage = userProjectBaseDTOMapper.projectBases(page);
        return userProjectBaseIPage;
    }

    @Override
    public void deleteById(Integer userId) {

        projectBaseMapper.delete(new QueryWrapper<ProjectBase>().eq(true,"user_id",userId));
    }

    @Override
    public ProjectBase update(ProjectBase projectBase) {

        ProjectBase projectBaseUp = new ProjectBase();
        projectBaseUp.setTitle(projectBase.getTitle());
        projectBaseUp.setSubtitle(projectBase.getSubtitle());
        projectBaseUp.setPcUrl(projectBase.getPcUrl());
        projectBaseUp.setAppUrl(projectBase.getAppUrl());
        projectBaseUp.setProjectItdc(projectBase.getProjectItdc());
        projectBaseUp.setStartTime(projectBase.getStartTime());
        projectBaseUp.setEndTime(projectBase.getEndTime());
        projectBaseUp.setTargetAmount(projectBase.getTargetAmount());
        projectBaseUp.setRaiseAmount(projectBase.getRaiseAmount());
        projectBaseUp.setStatus(projectBase.getStatus());

        projectBaseMapper.updateById(projectBaseUp);
        return projectBaseUp;
    }

    @Override
    public void save(ProjectBase projectBase) {

        projectBaseMapper.insert(projectBase);
    }

    @Override
    public ProjectDetail detailById(Integer projectDetailId) {

        return projectDetailMapper.selectById(projectDetailId);
    }

    @Override
    public IPage<UserProjectBaseDTO> baseStars(Page<UserProjectBaseDTO> page,Integer userId) {

        page = new Page<>(1,3);
        IPage<UserProjectBaseDTO> userProjectBaseById = userProjectBaseDTOMapper.projectBasesById(page, userId);
        return userProjectBaseById;
    }


}
