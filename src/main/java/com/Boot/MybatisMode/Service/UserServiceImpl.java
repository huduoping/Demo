package com.Boot.MybatisMode.Service;

import com.Boot.MybatisMode.Entity.User;
import com.Boot.MybatisMode.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 24649
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public String getName(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User show(int id) {
        return userDao.showUser(id);
    }

    @Override
    public List<User> showList() {
        return userDao.showList();
    }

}
