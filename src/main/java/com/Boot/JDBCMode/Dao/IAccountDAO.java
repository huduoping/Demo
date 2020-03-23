package com.Boot.JDBCMode.Dao;

import com.Boot.JDBCMode.Entity.Account;

import java.util.List;

/**
 * @author 24649
 */
public interface IAccountDAO {
    /**
     * @param account
     * @return int
     * 接口方法都需要注释作用
     */
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}



