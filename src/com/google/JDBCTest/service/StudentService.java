package com.google.JDBCTest.service;

import com.google.JDBCTest.util.JDBCUtils;
import com.google.JDBCTest.util.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService {
    public static Connection connection;
    public static PreparedStatement preparedStatement;

    public static ArrayList<Student> selectALL() {
        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            connection = JDBCUtils.getConnection();

            String sql = "select * from info";

            preparedStatement = connection.prepareStatement(sql);

            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                arrayList.add(new Student(res.getInt(1), res.getString(2), res.getInt(3)));
            }

            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static Student selectById(int id) {
        try {
            Student student = new Student();
            connection = JDBCUtils.getConnection();

            String sql = "select * from info where id =?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                student.setId(res.getInt(1));
                student.setName(res.getString(2));
                student.setAge(res.getInt(3));
            }

            return student;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean deleteById(int id) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "delete from info where id =?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean updateById(int id,String name,int age) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "UPDATE info SET name = ?,age = ? WHERE id = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(3, id);

            preparedStatement.setString(1, name);

            preparedStatement.setInt(2, age);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean updateName(int id,String name) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "UPDATE info SET name = ?,WHERE id = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(2, id);

            preparedStatement.setString(1, name);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean updateAge(int id,int age) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "UPDATE info SET age = ? WHERE id = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(2, id);

            preparedStatement.setInt(1, age);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
