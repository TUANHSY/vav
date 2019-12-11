package com.chinasoftware.cinema.dao;

import com.chinasoftware.cinema.jdbc.JdbcConn;

import java.sql.*;

/**
 * @author: DX
 * @date: 2019/12/2 19:46
 */
public class PlayDao {
    /**
     * 增加单条播放清单
     * @param playId listId
     * @param hallId hallId
     * @param movieId movieId
     * @param date date
     * @param price price
     * @throws SQLException 创建statement出错
     */
    public void add(String playId, String hallId, String movieId, Date date,double price) throws SQLException {
        Connection connection = JdbcConn.getConn();
        Statement statement = connection.createStatement();
        String sql = "insert into tb_play (play_id, movie_id, hall_id, play_time, play_price) VALUES ("+playId+movieId+hallId+date+price+")";
        statement.execute(sql);
    }

    public void findAll() throws SQLException {
        Connection connection = JdbcConn.getConn();
        Statement statement = connection.createStatement();
        String sql = "select * from tb_play";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(
                    resultSet.getString(1)+" "
                    +resultSet.getString(2)+" "
                    +resultSet.getString(3)+" "
                    +resultSet.getTimestamp(4).getMonth()+" "
                    +resultSet.getDouble(6)+" "
            );
        }
    }


}
