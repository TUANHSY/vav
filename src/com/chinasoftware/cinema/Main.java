package com.chinasoftware.cinema;

import com.chinasoftware.cinema.dao.PlayDao;

import java.sql.SQLException;

/**
 * @author: DX
 * @date: 2019/12/3 18:45
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        PlayDao playDao = new PlayDao();
        playDao.findAll();
    }
}
