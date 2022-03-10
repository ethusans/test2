package com.shiroha.demo.Config;

import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class DataSourceConfig {
  public static DataSource dataSource() {
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setUsername("root");
    dataSource.setPassword("root");
    dataSource.setUrl(
        "jdbc:mysql://localhost:3306/test1?characterEncoding=utf-8&serverTimezone=GMT%2B8");
    return dataSource;
  }
}
