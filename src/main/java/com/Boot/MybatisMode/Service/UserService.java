package com.Boot.MybatisMode.Service;

import com.Boot.MybatisMode.Entity.User;

import java.util.List;

public interface UserService {
    public String getName(int id);

    public User show(int id);

    public List<User> showList();

}
