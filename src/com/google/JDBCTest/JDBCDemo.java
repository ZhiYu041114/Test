package com.google.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    public static final String URL = "jdbc:mysql://localhost:3306/student";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        // 1.加载驱动程序 -> 给布料厂商打电话，我缺布料，你得给我送过来，我是MySQL公司的
        Class.forName("com.mysql.jdbc.Driver");

        // 2.获得数据库的连接 —> 告诉送货员，具体走什么路线才能送货
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        // 3.获取数据库操作对象 -> 送货送到了，然后卸货
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM info");

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            System.out.println("id: " + id + ",name: " + name + ",age: " + age);
        }

        statement.close();
        connection.close();

    }
}
