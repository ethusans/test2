package com.shiroha.demo.Dao;

import com.shiroha.demo.Model.UserModel;

import java.util.List;

public interface UserDao {

    public void create(UserModel user);

    public void delete(int id);

    public void edit(int id, UserModel newUser);

    public UserModel showById(int id);

    public List<UserModel> showAll();

    UserModel showByName(String name);
}
