package com.zhiyou100.imitatemodian.service;

import com.zhiyou100.imitatemodian.entity.Account;
import com.zhiyou100.imitatemodian.entity.User;

/**
 * @author DingYC
 * @create 2019-05-15 19:06
 **/

public interface AccountService {

    User login(Account account);

    Account register1(Account account);

    User register2(Account account);

    Account updateCode(String email);

    void update(Account account);

}
