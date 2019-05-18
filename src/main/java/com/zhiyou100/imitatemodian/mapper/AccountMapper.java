package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.imitatemodian.entity.Account;

/**
 * @author DingYC
 * @create 2019-05-16 9:53
 **/

public interface AccountMapper extends BaseMapper<Account> {

    Account findAccountByEmail(Account account);

    Account saveAccount(Account account);

    void updateAccount(Account account);

}
