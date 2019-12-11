package com.chinasoftware.cinema.entity;

/**
 * @author: DX
 * @date: 2019/12/2 14:23
 */
public class Theater {
    /**
     * 电影院id
     */
    private String theaterId;
    /**
     * 电影院名称
     */
    private String theaterName;
    /**
     * 电影院位置
     */
    private String theaterLocation;
    /**
     * 电影院描述
     */
    private String theaterDes;

    /**
     * 构造 无参
     */
    public Theater() {
    }

    /**
     * 构造 有参
     * @param theaterId id
     * @param theaterName name
     * @param theaterLocation location
     */
    public Theater(String theaterId, String theaterName, String theaterLocation) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    public String getTheaterDes() {
        return theaterDes;
    }

    public void setTheaterDes(String theaterDes) {
        this.theaterDes = theaterDes;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterId='" + theaterId + '\'' +
                ", theaterName='" + theaterName + '\'' +
                ", theaterLocation='" + theaterLocation + '\'' +
                ", theaterDes='" + theaterDes + '\'' +
                '}';
    }
}
