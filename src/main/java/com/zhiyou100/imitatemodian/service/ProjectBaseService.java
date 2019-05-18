package com.zhiyou100.imitatemodian.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou100.imitatemodian.entity.CommentUserDTO;
import com.zhiyou100.imitatemodian.entity.ProjectBase;
import com.zhiyou100.imitatemodian.entity.ProjectDetail;
import com.zhiyou100.imitatemodian.entity.UserProjectBaseDTO;

import java.util.List;

/**
 * @author DingYC
 * @create 2019-05-15 19:07
 **/

public interface ProjectBaseService {

    List<UserProjectBaseDTO> getById(Integer userId);

    // 发现项目
    IPage<UserProjectBaseDTO> projectBases(Page<UserProjectBaseDTO> page);

    void deleteById(Integer userId);

    ProjectBase update(ProjectBase projectBase);

    void save(ProjectBase projectBase);

    // 展示详情
    ProjectDetail detailById(Integer projectDetailId);

    // 关注项目
    IPage<UserProjectBaseDTO> baseStars(Page<UserProjectBaseDTO> page, Integer userId);

}
