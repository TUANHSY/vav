package com.chinasoftware.cinema.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: DX
 * @date: 2019/12/2 14:23
 */
public class Play {
    /**
     * 放映清单id
     */
    private String playId;
    /**
     * 放映的电影
     */
    private Movie movie;
    /**
     * 放映厅
     */
    private Hall hall;
    /**
     * 放映的时间
     */
    private Timestamp date;
    /**
     * 描述
     */
    private String playDes;

    /**
     * 价格
     */
    private double price;

    /**
     * 无参
     */
    public Play() {
    }

    /**
     * 有参构造
     * @param playId 放映编号
     * @param movie 放映电影
     * @param hall 放映厅
     * @param date 放映时间
     * @param price 价格
     */
    public Play(String playId, Movie movie, Hall hall, Timestamp date, double price) {
        this.playId = playId;
        this.movie = movie;
        this.hall = hall;
        this.date = date;
        this.price = price;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getPlayDes() {
        return playDes;
    }

    public void setPlayDes(String playDes) {
        this.playDes = playDes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Play{" +
                "playId='" + playId + '\'' +
                ", movie=" + movie +
                ", hall=" + hall +
                ", date=" + date +
                ", playDes='" + playDes + '\'' +
                ", price=" + price +
                '}';
    }
}
