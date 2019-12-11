package cinema.com.cinema.entity;

/**
 * 电影类
 * @author: DX
 * @date: 2019/11/29 14:30
 */
public class Movie {
    /**
     * 电影编号
     */
    private String movieId;
    /**
     * 电影名称
     */
    private String movieName;
    /**
     * 电影主演
     */
    private String movieStarring;
    /**
     * 其他信息
     */
    private String movieInfo;

    /**
     * 无参构造
     */
    public Movie() {
    }

    /**
     * 有参构造
     * @param movieId 电影编号
     * @param movieName 电影名称
     * @param movieStarring 电影主演
     */
    public Movie(String movieId, String movieName, String movieStarring) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieStarring = movieStarring;
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

    public String getMovieStarring() {
        return movieStarring;
    }

    public void setMovieStarring(String movieStarring) {
        this.movieStarring = movieStarring;
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Movie)) {
            return false;
        }

        Movie movie = (Movie) o;

        if (!getMovieId().equals(movie.getMovieId())) {
            return false;
        }
        if (!getMovieName().equals(movie.getMovieName())) {
            return false;
        }
        if (!getMovieStarring().equals(movie.getMovieStarring())) {
            return false;
        }
        return getMovieInfo().equals(movie.getMovieInfo());
    }

    @Override
    public int hashCode() {
        int result = getMovieId().hashCode();
        result = 31 * result + getMovieName().hashCode();
        result = 31 * result + getMovieStarring().hashCode();
        result = 31 * result + getMovieInfo().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieStarring='" + movieStarring + '\'' +
                ", movieInfo='" + movieInfo + '\'' +
                '}';
    }
}
