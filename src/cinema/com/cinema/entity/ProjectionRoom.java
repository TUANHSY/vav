package cinema.com.cinema.entity;

import java.util.ArrayList;

/**
 * @author: DX
 * @date: 2019/11/29 14:31
 */
public class ProjectionRoom {
    /**
     * 放映室编号
     */
    private String roomId;
    /**
     * 放映室名称
     */
    private String roomName;
    /**
     * 放映室位置
     */
    private String roomLocation;

    /**
     * 放映室座位数
     */
    private int seatCount;
    /**
     * 放映室座位
     */
    private ArrayList<Seat> seats;

    /**
     * 无参构造放映室
     */
    public ProjectionRoom() {
    }

    /**
     * 有参构造放映室
     * @param roomId  放映室编号
     * @param roomName 放映室名称
     * @param roomLocation 放映室位置
     * @param seatCount 座位数
     */

    public ProjectionRoom(String roomId, String roomName, String roomLocation, int seatCount) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomLocation = roomLocation;
        this.seatCount = seatCount;
    }




    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * 获取可用座位上
     * @return 座位数
     */
    public int getSeatNum(){
        int count=0;
        for (int i=0; i<seats.size();i++){
            if (!seats.get(i).isUsed()){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectionRoom)) {
            return false;
        }

        ProjectionRoom that = (ProjectionRoom) o;

        if (getSeatCount() != that.getSeatCount()) {
            return false;
        }
        if (!getRoomId().equals(that.getRoomId())) {
            return false;
        }
        if (!getRoomName().equals(that.getRoomName())) {
            return false;
        }
        if (!getRoomLocation().equals(that.getRoomLocation())) {
            return false;
        }
        return getSeats().equals(that.getSeats());
    }

    @Override
    public int hashCode() {
        int result = getRoomId().hashCode();
        result = 31 * result + getRoomName().hashCode();
        result = 31 * result + getRoomLocation().hashCode();
        result = 31 * result + getSeatCount();
        result = 31 * result + getSeats().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ProjectionRoom{" +
                "roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomLocation='" + roomLocation + '\'' +
                ", seatCount=" + seatCount +
                ", seats=" + seats +
                '}';
    }
}
