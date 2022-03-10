package com.shiroha.demo.Dao.Impl;

import com.shiroha.demo.Config.DataSourceConfig;
import com.shiroha.demo.Dao.UserDao;
import com.shiroha.demo.Model.UserModel;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

  private JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceConfig.dataSource());

  @Override
  public void create(UserModel user) {}

  @Override
  public void delete(int id) {}

  @Override
  public void edit(int id, UserModel newUser) {}

  @Override
  public UserModel showById(int id) {
    String sql = "select * from User where id = " + id;
    UserModel userModel =
        jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserModel.class));
    return userModel;
  }

  @Override
  public List<UserModel> showAll() {
    String sql = "select * from User";
    List<UserModel> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserModel.class));
    return query;
  }

  @Override
  public UserModel showByName(String name) {
    // 请查看示例 https://gist.github.com/retanoj/5fd369524a18ab68a4fe7ac5e0d121e8
    String sql = "select * from User where name = '" + name + "'";
    UserModel userModel =
        jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserModel.class));
    return userModel;
  }
}
