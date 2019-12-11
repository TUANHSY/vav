package com.chinasoftware.cinema.dao;

import com.chinasoftware.cinema.jdbc.JdbcConn;
import com.chinasoftware.cinema.util.IdHandle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author: DX
 * @date: 2019/12/2 15:12
 */
public class SeatDao {
    /**
     * 单条插入
     * @param seatId 座位号
     * @param hallId 厅号
     */
    public void add(String seatId, String hallId) throws SQLException {
       Connection connection = JdbcConn.getConn();
       String sql ="insert into tb_seat(seat_id,hall_id) values ("+seatId+","+hallId+")";
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * 为放映厅批量构造座位
     * @param n 座位数
     * @param hallId 大厅号
     */
    public void bulkInsert(int n,String hallId) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String seatId=null;
        for (int i=0;i<n;i++){
            if(i<9){
                seatId = hallId+"000000"+(i+1);
            }else if (i<99){
                seatId = hallId+"00000"+(i+1);
            }else if (i<160){
                seatId = hallId+"0000"+(i+1);
            }else {
                System.out.println("座位数量过多，请重新输入");
                n=sc.nextInt();
                bulkInsert(n,hallId);
            }
            add(seatId,hallId);
        }
    }

    /**
     * 找到所有未坐人的座位数量
     * @param hallId 大厅号
     * @return 剩余座位数
     */
    public int findSeatCount(String hallId) throws SQLException {
        Connection connection = JdbcConn.getConn();
        String sql = "select * from tb_seat where hall_id="+hallId+" and isempty= true ";

        int count =0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }


    /**
     * 找到所有的座位
     * @param hallId 大厅号
     * @return 剩余座位数
     */
    public ResultSet findAllASeat(String hallId) throws SQLException {
        Connection connection = JdbcConn.getConn();
        String sql = "select * from tb_seat where hall_id="+hallId;
        ResultSet resultSet=null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }


    /**
     * 打印座位列表
     * @param hallId 大厅号
     * @throws SQLException sql异常
     */
    public void printAllASeat(String hallId) throws SQLException {
        ResultSet resultSet = findAllASeat(hallId);
        int i=0;
        while (resultSet.next()){
            String  isEmpty = resultSet.getBoolean(6)?"空位":"有人";
            System.out.print(i+1+" :"+isEmpty+"  ");
            i++;
            if(i%10==0){
                System.out.println();
            }
        }
    }

    /**
     * 选座
     * @param hallId 大厅编号
     * @throws SQLException sql 异常
     */
    public void seatSelection(String hallId) throws SQLException {
        printAllASeat(hallId);
        Scanner sc = new Scanner(System.in);
        //输入座位编号 [1,N]
        String seatNum = sc.next();
        //处理座位编号到 10 位String
        seatNum = IdHandle.seatIdGetHandle(seatNum,hallId);
        //更新座位状态
        String sql = "update tb_seat set isempty = false where seat_id ="+seatNum;
        Connection connection = JdbcConn.getConn();
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    public boolean isEmpty(){
        return false;
    }

    public static void main(String[] args) throws SQLException {
        SeatDao seatDao = new SeatDao();
        seatDao.seatSelection("101");
        seatDao.printAllASeat("101");
    }
}
