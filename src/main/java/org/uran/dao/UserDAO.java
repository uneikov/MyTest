package org.uran.dao;

import org.uran.model.User;

import java.util.List;


public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    User getUser(int id);
    void deleteUser(int id);
    List<User> getUsers();
}
