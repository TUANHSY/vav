package cinema.com.cinema.entity;

import java.util.Date;

/**
 * 播放清单
 * @author: DX
 * @date: 2019/11/29 14:41
 */
public class PlayList {
    /**
     * 播放单号，unique
     */
    private String playListId;
    /**
     * 播放的电影，Movie
     */
    private Movie movie;
    /**
     * 使用的放映室，ProjectionRoom
     */
    private ProjectionRoom projectionRoom;
    /**
     * 上映时间 date
     */
    private Date date;

    /**
     * 价格 double
     */
    private double price;

    /**
     * 无参构造
     */
    public PlayList() {
    }

    /**
     * 有参构造
     * @param playListId 编号
     * @param movie 电影
     * @param projectionRoom 放映室
     * @param date 开始时间
     * @param price 价格
     */
    public PlayList(String playListId, Movie movie, ProjectionRoom projectionRoom, Date date, double price) {
        this.playListId = playListId;
        this.movie = movie;
        this.projectionRoom = projectionRoom;
        this.date = date;
        this.price = price;
    }

    public String getPlayListId() {
        return playListId;
    }

    public void setPlayListId(String playListId) {
        this.playListId = playListId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ProjectionRoom getProjectionRoom() {
        return projectionRoom;
    }

    public void setProjectionRoom(ProjectionRoom projectionRoom) {
        this.projectionRoom = projectionRoom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlayList)) {
            return false;
        }

        PlayList playList = (PlayList) o;

        if (Double.compare(playList.getPrice(), getPrice()) != 0) {
            return false;
        }
        if (!getPlayListId().equals(playList.getPlayListId())) {
            return false;
        }
        if (!getMovie().equals(playList.getMovie())) {
            return false;
        }
        if (!getProjectionRoom().equals(playList.getProjectionRoom())) {
            return false;
        }
        return getDate().equals(playList.getDate());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getPlayListId().hashCode();
        result = 31 * result + getMovie().hashCode();
        result = 31 * result + getProjectionRoom().hashCode();
        result = 31 * result + getDate().hashCode();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playListId='" + playListId + '\'' +
                ", movie=" + movie +
                ", projectionRoom=" + projectionRoom +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
