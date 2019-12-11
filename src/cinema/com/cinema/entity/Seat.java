package cinema.com.cinema.entity;

/**
 * @author: DX
 * @date: 2019/11/29 14:31
 */
public class Seat {
    /**
     * 座位编号
     */
    private String seatId;
    /**
     * 座位排编号
     */
    private String xId;
    /**
     * 座位列编号
     */
    private String yId;
    /**
     * 是否被使用
     */
    private boolean used=false;

    /**
     * 无参构造
     */
    public Seat() {
    }

    /**
     * 有参构造
     * @param seatId 座位编号
     */
    public Seat(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getxId() {
        return xId;
    }

    public void setxId(String xId) {
        this.xId = xId;
    }

    public String getyId() {
        return yId;
    }

    public void setyId(String yId) {
        this.yId = yId;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Seat)) {
            return false;
        }

        Seat seat = (Seat) o;

        if (isUsed() != seat.isUsed()) {
            return false;
        }
        if (!getSeatId().equals(seat.getSeatId())) {
            return false;
        }
        if (!getxId().equals(seat.getxId())) {
            return false;
        }
        return getyId().equals(seat.getyId());
    }

    @Override
    public int hashCode() {
        int result = getSeatId().hashCode();
        result = 31 * result + getxId().hashCode();
        result = 31 * result + getyId().hashCode();
        result = 31 * result + (isUsed() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatId='" + seatId + '\'' +
                ", xId='" + xId + '\'' +
                ", yId='" + yId + '\'' +
                ", used=" + used +
                '}';
    }
}
