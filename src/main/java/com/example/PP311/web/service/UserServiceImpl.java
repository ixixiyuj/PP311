package com.example.PP311.web.service;

import com.example.PP311.web.dao.UserDao;
import com.example.PP311.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void saveUser(String name, String lastName, String email) {
        userDao.saveUser(name, lastName, email);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(long id, User user) {
        userDao.updateUser(id, user.getFirstName(), user.getLastName(), user.getEmail());
    }


    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }
}
