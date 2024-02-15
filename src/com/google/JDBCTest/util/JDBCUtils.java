package com.google.JDBCTest.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    // 通过静态代码块，来预先执行读取配置文件的配置项，做预处理
    static {
        try {
            // JDBCUtils.class.getClassLoader();
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("db.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void init(){
        System.out.println("使用！");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(Connection connection, PreparedStatement preparedStatement,ResultSet resultSet) throws SQLException {
        if (resultSet != null){
            resultSet.close();
        }

        if(preparedStatement != null){
            preparedStatement.close();
        }

        if (connection != null){
            connection.close();
        }
    }

    public static void close(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        if(preparedStatement != null){
            preparedStatement.close();
        }

        if (connection != null){
            connection.close();
        }
    }
}
