package com.zhiyou100.imitatemodian.service;

import com.zhiyou100.imitatemodian.entity.Star;
import com.zhiyou100.imitatemodian.entity.User;

/**
 * @author DingYC
 * @create 2019-05-15 19:05
 **/

public interface UserService {

    void removeById(Integer id);

    User update(User user);

    User getById(Integer id);

    void getStar(Star star);

    void deleteStar(Star star);

}
