package cinema.com.cinema.method;

import cinema.com.cinema.entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author: DX
 * @date: 2019/12/2 9:29
 */
public class MovieTheaterMethod {

    /**
     * 初始化电影院 加入 3 部电影 ， 加入 3 个放映室 ，加入 5 个放映清单
     * @param movieTheater 电影院
     * @throws ParseException 时间格式化异常
     */
    public void initialMovieTheater(MovieTheater movieTheater) throws ParseException {
        //初始化电影 3 部
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Movie movie1 = new Movie("0","冰雪奇缘","艾莎");
        Movie movie2 = new Movie("1","中国机长","张涵予");
        Movie movie3 = new Movie("2","攀登者","吴京");
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movieTheater.setMovies(movies);
        //初始化放映室 3 个
        ArrayList<ProjectionRoom> projectionRooms = new ArrayList<ProjectionRoom>();
        ProjectionRoom projectionRoom1 = new ProjectionRoom("1","1号厅","xxx",80);
        //初始化座位 80 个
        ArrayList<Seat> seats1 = new ArrayList<Seat>();
        for (int i=0;i<projectionRoom1.getSeatCount();i++){
            Seat seat = new Seat(""+(i+1));
            seats1.add(seat);
        }
        projectionRoom1.setSeats(seats1);
        ProjectionRoom projectionRoom2 = new ProjectionRoom("2","2号厅","xxx",100);
        //初始化座位 100 个
        ArrayList<Seat> seats2 = new ArrayList<Seat>();
        for (int i=0;i<projectionRoom1.getSeatCount();i++){
            Seat seat = new Seat(""+(i+1));
            seats2.add(seat);
        }
        projectionRoom2.setSeats(seats2);
        ProjectionRoom projectionRoom3 = new ProjectionRoom("3","3号厅","xxx",120);
        //初始化座位 120 个
        ArrayList<Seat> seats3 = new ArrayList<Seat>();
        for (int i=0;i<projectionRoom1.getSeatCount();i++){
            Seat seat = new Seat(""+(i+1));
            seats3.add(seat);
        }
        projectionRoom3.setSeats(seats3);
        projectionRooms.add(projectionRoom1);
        projectionRooms.add(projectionRoom2);
        projectionRooms.add(projectionRoom3);
        movieTheater.setProjectionRooms(projectionRooms);
        //初始化放映清单
        ArrayList<PlayList> playListArrayList = new ArrayList<PlayList>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
        PlayList playList1 = new PlayList("1001",movie1,projectionRoom1,simpleDateFormat.parse("11-01 8:30"),28.5d);
        PlayList playList2 = new PlayList("1001",movie1,projectionRoom1,simpleDateFormat.parse("11-01 19:20"),38.5d);
        PlayList playList3 = new PlayList("1003",movie2,projectionRoom1,simpleDateFormat.parse("11-01 16:30"),32.5d);
        PlayList playList4 = new PlayList("1004",movie1,projectionRoom3,simpleDateFormat.parse("11-01 8:30"),28.5d);
        PlayList playList5 = new PlayList("1005",movie3,projectionRoom3,simpleDateFormat.parse("11-01 8:30"),28.5d);
        playListArrayList.add(playList1);
        playListArrayList.add(playList2);
        playListArrayList.add(playList3);
        playListArrayList.add(playList4);
        playListArrayList.add(playList5);
        movieTheater.setPlayLists(playListArrayList);
        //初始化完成
        System.out.println("初始化完成:"+movieTheater.toString());
    }

}
