package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou100.imitatemodian.entity.ProjectBase;
import com.zhiyou100.imitatemodian.entity.ProjectDetail;
import com.zhiyou100.imitatemodian.entity.UserProjectBaseDTO;

/**
 * @author DingYC
 * @create 2019-05-15 21:26
 **/

public interface UserProjectBaseDTOMapper extends BaseMapper<UserProjectBaseDTO> {

    // 分页
    IPage<UserProjectBaseDTO> projectBases(Page<UserProjectBaseDTO> page);

    IPage<UserProjectBaseDTO> projectBasesById(Page<UserProjectBaseDTO> page,Integer userId);



}
