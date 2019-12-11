package com.chinasoftware.cinema.entity;

/**
 * @author: DX
 * @date: 2019/12/2 14:23
 */
public class Hall {
    /**
     * 放映厅的id
     */
    private String hallId;
    /**
     * 放映厅的名称
     */
    private String hallName;
    /**
     * 座位数量
     */
    private String hallSeat;
    /**
     * 所属电影院
     */
    private Theater theater;
    /**
     * 放映厅描述
     */
    private String hallDes;

    /**
     * 无参构造
     */
    public Hall() {
    }

    /**
     * 有参构造
     * @param hallId id
     * @param hallName name
     * @param hallSeat seatCount
     * @param theater theater
     */
    public Hall(String hallId, String hallName, String hallSeat, Theater theater) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.hallSeat = hallSeat;
        this.theater = theater;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getHallSeat() {
        return hallSeat;
    }

    public void setHallSeat(String hallSeat) {
        this.hallSeat = hallSeat;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getHallDes() {
        return hallDes;
    }

    public void setHallDes(String hallDes) {
        this.hallDes = hallDes;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallId='" + hallId + '\'' +
                ", hallName='" + hallName + '\'' +
                ", hallSeat='" + hallSeat + '\'' +
                ", theater=" + theater +
                ", hallDes='" + hallDes + '\'' +
                '}';
    }
}
