package com.google.JDBCTest;

import java.sql.*;

public class JDBCDemo01 {

    // 配置文件
    public static final String URL = "jdbc:mysql://localhost:3306/student";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
    public static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;


    public static void main(String[] args) throws SQLException {
        selectALL();
    }

    public static void selectALL() {

        try {
            // 1.加载驱动
            Class.forName(DRIVER);

            // 2.获得数据库链接对象
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 3.获取数据库操作对象
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM info");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);

                System.out.println("id: " + id + " name: " + name + " age: " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
