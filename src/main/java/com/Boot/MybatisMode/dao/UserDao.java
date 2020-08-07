package com.Boot.MybatisMode.dao;

import com.Boot.MybatisMode.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 24649
 */
@Mapper   //注册为spring的Bean
public interface UserDao {

    public String getUserById(int id);

    public User showUser(int id);

    public List<User> showList();

    public List<User> showNameLike(String name);

    public int addUser(User user);
}
