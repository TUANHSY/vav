package com.chinasoftware.cinema.jdbc;

import java.sql.*;

/**
 * @author: DX
 * @date: 2019/12/2 13:53
 */
public class JdbcConn {

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


}
