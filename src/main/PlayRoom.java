package main;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author: DX
 * @date: 2019/11/28 16:15
 */
public class PlayRoom {
    private String roomId;
    private String playId;
    private String playRoomName;
    private Movie movie;
    private Date platTime;
    private ArrayList<Seat> seats;
    private double price;
    private boolean isExist;

    public PlayRoom() {
    }

    public PlayRoom(String roomId, String playId, String playRoomName, Movie movie, Date platTime, ArrayList<Seat> seats, double price) {
        this.roomId = roomId;
        this.playId = playId;
        this.playRoomName = playRoomName;
        this.movie = movie;
        this.platTime = platTime;
        this.seats = seats;
        this.price = price;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getPlayRoomName() {
        return playRoomName;
    }

    public void setPlayRoomName(String playRoomName) {
        this.playRoomName = playRoomName;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getPlatTime() {
        return platTime;
    }

    public void setPlatTime(Date platTime) {
        this.platTime = platTime;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatsCount(){
        int count=0;
        for (int i=0;i<seats.size();i++){
            if (!seats.get(i).isEnpty()){
                count++;
            }
        }
        return count;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    @Override
    public String toString() {
        return "main.PlayRoom{" +
                "roomId='" + roomId + '\'' +
                ", playId='" + playId + '\'' +
                ", playRoomName='" + playRoomName + '\'' +
                ", movie=" + movie +
                ", platTime=" + platTime +
                ", seats=" + seats.toString() +
                ", price=" + price +
                '}';
    }
}
