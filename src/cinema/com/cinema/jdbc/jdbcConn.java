package cinema.com.cinema.jdbc;

import java.sql.*;

/**
 * @author: DX
 * @date: 2019/12/2 13:53
 */
public class jdbcConn {

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://47.100.59.37:3306/xax?useSSL=false&serverTimezone=UTC","root","Dx.2014017");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection connection = getConn();

        try {
            Statement statement = connection.createStatement();
            String sql = "select * from tb_movie";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"："+resultSet.getString(2));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
