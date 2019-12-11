package cinema.com.cinema.entity;

import java.util.ArrayList;

/**
 * @author: DX
 * @date: 2019/11/29 14:32
 */
public class MovieTheater {
    /**
     * 电影院编号
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
     * 电影院所有电影
     */
    private ArrayList<Movie> movies;
    /**
     * 电影院所有放映室
     */
    private ArrayList<ProjectionRoom> projectionRooms;
    /**
     * 电影院所有放映列表
     */
    private ArrayList<PlayList> playLists;

    /**
     * 无参构造
     */
    public MovieTheater() {
    }

    /**
     * 有参构造
     * @param theaterId 电影院编号
     * @param theaterName 电影院名称
     * @param theaterLocation 电影院位置
     */
    public MovieTheater(String theaterId, String theaterName, String theaterLocation) {
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

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<ProjectionRoom> getProjectionRooms() {
        return projectionRooms;
    }

    public void setProjectionRooms(ArrayList<ProjectionRoom> projectionRooms) {
        this.projectionRooms = projectionRooms;
    }

    public ArrayList<PlayList> getPlayLists() {
        return playLists;
    }

    public void setPlayLists(ArrayList<PlayList> playLists) {
        this.playLists = playLists;
    }

    @Override
    public String toString() {
        return "MovieTheater{" +
                "theaterId='" + theaterId + '\'' +
                ", theaterName='" + theaterName + '\'' +
                ", theaterLocation='" + theaterLocation + '\'' +
                ", movies=" + movies +
                ", projectionRooms=" + projectionRooms +
                ", playLists=" + playLists +
                '}';
    }
}
