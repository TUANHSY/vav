package main;

/**
 * @author: DX
 * @date: 2019/11/28 16:21
 */
public class Seat {
    private String seatId;
    private String seatType;
    /**
     * 排号
     */
    private String seatXId;
    /**
     * 列号
     */
    private String seatYId;
    boolean isEnpty;

    public Seat(String seatId, String seatType, String seatXId, String seatYId, boolean isEnpty) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatXId = seatXId;
        this.seatYId = seatYId;
        this.isEnpty = isEnpty;
    }

    Seat(String seatId, boolean isEnpty) {
        this.seatId = seatId;
        this.isEnpty = isEnpty;
    }

    String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatXId() {
        return seatXId;
    }

    public void setSeatXId(String seatXId) {
        this.seatXId = seatXId;
    }

    public String getSeatYId() {
        return seatYId;
    }

    public void setSeatYId(String seatYId) {
        this.seatYId = seatYId;
    }

    boolean isEnpty() {
        return isEnpty;
    }

    void setEnpty(boolean enpty) {
        isEnpty = enpty;
    }

    @Override
    public String toString() {
        return "main.Seat{" +
                "seatId='" + seatId + '\'' +
                ", isEnpty=" + isEnpty +
                '}';
    }
}
