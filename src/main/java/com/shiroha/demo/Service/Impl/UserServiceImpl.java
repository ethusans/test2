package com.shiroha.demo.Service.Impl;

import com.shiroha.demo.Dao.Impl.UserDaoImpl;
import com.shiroha.demo.Dao.UserDao;
import com.shiroha.demo.Model.UserModel;
import com.shiroha.demo.Service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {

  private static UserDao dao = new UserDaoImpl();

  @Override
  public void create(UserModel user) {
    dao.create(user);
  }

  @Override
  public void delete(int id) {
    dao.delete(id);
  }

  @Override
  public void edit(int id, UserModel newUser) {
    dao.edit(id, newUser);
  }

  @Override
  public UserModel showById(int id) {
    return dao.showById(id);
  }

  @Override
  public UserModel showByName(String name) {
    return dao.showByName(name);
  }

  @Override
  public List<UserModel> showAll() {
    return dao.showAll();
  }
}
