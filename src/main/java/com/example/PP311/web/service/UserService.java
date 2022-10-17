package com.example.PP311.web.service;

import com.example.PP311.web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(String name, String lastName, String email);
    void removeUserById(long id);
    void updateUser(long id, User user);
    void add(User user);
    List<User> listUsers();

    User getUser(long id);

}
