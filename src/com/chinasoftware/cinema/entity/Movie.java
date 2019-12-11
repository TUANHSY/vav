package com.chinasoftware.cinema.entity;

/**
 * @author: DX
 * @date: 2019/12/2 14:22
 */
public class Movie {
    /**
     * 电影id
     */
    private String movieId;
    /**
     * 电影名称
     */
    private String movieName;
    /**
     * 电影类型
     */
    private String movieType;
    /**
     * 电影主演
     */
    private String movieStar;
    /**
     * 电影描述
     */
    private String movieDes;

    /**
     * 构造函数
     */
    public Movie() {
    }

    /**
     * 有参
     * @param movieId id
     * @param movieName name
     * @param movieType type
     * @param movieStar star
     */
    public Movie(String movieId, String movieName, String movieType, String movieStar) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieType = movieType;
        this.movieStar = movieStar;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieStar() {
        return movieStar;
    }

    public void setMovieStar(String movieStar) {
        this.movieStar = movieStar;
    }

    public String getMovieDes() {
        return movieDes;
    }

    public void setMovieDes(String movieDes) {
        this.movieDes = movieDes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieType='" + movieType + '\'' +
                ", movieStar='" + movieStar + '\'' +
                ", movieDes='" + movieDes + '\'' +
                '}';
    }
}
