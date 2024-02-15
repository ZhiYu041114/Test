//import com.google.JDBCTest.util.JDBCUtils;
//import org.junit.Test;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBCUDemo01 {
//
//    public Connection connection;
//    public Statement statement;
//    public ResultSet res;
//
//    @Test
//    public void insertTest() {
//        try {
//            connection = JDBCUtils.getConnection();
//            statement = connection.createStatement();
//
//            String sql = "INSERT INTO info (name,age) VALUES ('中文',16)";
//
//            int res = statement.executeUpdate(sql);
//
//            if(res > 0){
//                System.out.println("insert success!");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
////                JDBCUtils.close(connection,statement);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Test
//    public void updateTest() {
//        try {
//            connection = JDBCUtils.getConnection();
//            statement = connection.createStatement();
//
//            String sql = "update info set name = 'UU' where id = 4";
//
//            int res = statement.executeUpdate(sql);
//
//            if(res > 0){
//                System.out.println("update success!");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
////                JDBCUtils.close(connection,statement);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Test
//    public void deleteTest() {
//        try {
//            connection = JDBCUtils.getConnection();
//            statement = connection.createStatement();
//
//            String sql = "delete from info where id = 4";
//
//            int res = statement.executeUpdate(sql);
//
//            if(res > 0){
//                System.out.println("delete success!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
////                JDBCUtils.close(connection,statement);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Test
//    public void readTest(){
//        try {
//            connection = JDBCUtils.getConnection();
//            statement = connection.createStatement();
//
//            String sql = "SELECT * FROM info";
//
//             ResultSet res = statement.executeQuery(sql);
//
//            while (res.next()) {
//                int id = res.getInt(1);
//                String name = res.getString(2);
//                int age = res.getInt(3);
//                System.out.println("id: " + id + ",name: " + name + ",age: " + age);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
////                JDBCUtils.close(connection,statement,res);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
