package main;

import java.util.Date;

/**
 * @author: DX
 * @date: 2019/11/28 13:54
 */
public class Movie {
    String movieNumber;
    String movieName;
    String movieType;
    String starringName;
    Double price;

    public Movie() {
    }
    public Movie(String movieNumber, String movieName, String movieType, String starringName, Double price) {
        this.movieNumber = movieNumber;
        this.movieName = movieName;
        this.movieType = movieType;
        this.starringName = starringName;
        this.price = price;
    }

    public String getMovieNumber() {
        return movieNumber;
    }

    public void setMovieNumber(String movieNumber) {
        this.movieNumber = movieNumber;
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

    public String getStarringName() {
        return starringName;
    }

    public void setStarringName(String starringName) {
        this.starringName = starringName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "main.Movie{" +
                "movieNumber='" + movieNumber + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieType='" + movieType + '\'' +
                ", starringName='" + starringName + '\'' +
                ", price=" + price +
                '}';
    }
}
