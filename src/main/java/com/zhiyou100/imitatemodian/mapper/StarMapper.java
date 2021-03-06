package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.imitatemodian.entity.Star;
import org.apache.ibatis.annotations.Param;

/**
 * @author DingYC
 * @create 2019-05-16 14:22
 **/

public interface StarMapper extends BaseMapper<Star> {

    void deleteByTwoId(@Param("userId") Integer userId, @Param("projectId") Integer projectId);
}
