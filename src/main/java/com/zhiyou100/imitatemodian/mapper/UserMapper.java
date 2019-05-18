package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.entity.User;

/**
 * @author DingYC
 * @create 2019-05-15 17:36
 **/

public interface UserMapper extends BaseMapper<User> {

    User saveUser(User user);

    void updateUser(User user);


}
