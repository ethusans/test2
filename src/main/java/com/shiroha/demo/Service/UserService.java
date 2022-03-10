package com.shiroha.demo.Service;

import com.shiroha.demo.Model.UserModel;
import java.util.List;

public interface UserService {

  void create(UserModel user);

  void delete(int id);

  void edit(int id, UserModel newUser);

  UserModel showById(int id);

  UserModel showByName(String name);

  List<UserModel> showAll();
}
