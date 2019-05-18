package com.zhiyou100.imitatemodian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhiyou100.imitatemodian.entity.Star;
import com.zhiyou100.imitatemodian.entity.User;
import com.zhiyou100.imitatemodian.mapper.StarMapper;
import com.zhiyou100.imitatemodian.mapper.UserMapper;
import com.zhiyou100.imitatemodian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DingYC
 * @create 2019-05-15 20:52
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StarMapper starMapper;


    @Override
    public void removeById(Integer id) {

        userMapper.deleteById(id);
    }

    @Override
    public User update(User user) {

        User upUser = new User();
        upUser.setNickName(user.getNickName());
        upUser.setGender(user.getGender());
        upUser.setBirthday(user.getBirthday());
        upUser.setHeadPortrait(user.getHeadPortrait());
        upUser.setIntroduction(user.getIntroduction());

        userMapper.update(user,new QueryWrapper<User>().eq(true,"account_id",user.getAccountId()));
        return upUser;
    }

    @Override
    public User getById(Integer accountId) {

        return userMapper.selectOne(new QueryWrapper<User>().eq(true,"account_id",accountId));
    }

    @Override
    public void getStar(Star star) {

        starMapper.insert(star);
    }

    @Override
    public void deleteStar(Integer userId, Integer projectId) {

        starMapper.deleteByTwoId(userId,projectId);
    }
}
