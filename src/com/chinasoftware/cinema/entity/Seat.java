package com.chinasoftware.cinema.entity;

/**
 * @author: DX
 * @date: 2019/12/2 14:23
 */
public class Seat {
    /**
     * 放映厅的id
     */
    private String seatId;
    /**
     * 放映厅的名称
     */
    private String seatX;
    /**
     * 座位数量
     */
    private String seatY;
    /**
     * 所属电影院
     */
    Theater seatType;
    /**
     * 放映厅描述
     */
    private Hall hall;

    /**
     * 是否有人
     */
    private boolean isEmpty;

    /**
     * 无参
     */
    public Seat() {
    }

    /**
     * 有参
     * @param seatId 编号
     * @param hall 厅号
     * @param isEmpty 有人没有
     */
    public Seat(String seatId, Hall hall, boolean isEmpty) {
        this.seatId = seatId;
        this.hall = hall;
        this.isEmpty = isEmpty;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatX() {
        return seatX;
    }

    public void setSeatX(String seatX) {
        this.seatX = seatX;
    }

    public String getSeatY() {
        return seatY;
    }

    public void setSeatY(String seatY) {
        this.seatY = seatY;
    }

    public Theater getSeatType() {
        return seatType;
    }

    public void setSeatType(Theater seatType) {
        this.seatType = seatType;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "座位号：'" + seatId.substring(seatId.length()-3) + '\'' +
                ", 放映厅编号：" + hall +
                ", 是否为空位：" + isEmpty +
                '}';
    }
}
