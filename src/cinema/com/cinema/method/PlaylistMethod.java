package cinema.com.cinema.method;

import cinema.com.cinema.entity.Movie;
import cinema.com.cinema.entity.MovieTheater;
import cinema.com.cinema.entity.PlayList;
import cinema.com.cinema.entity.ProjectionRoom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: DX
 * @date: 2019/12/2 9:30
 */
public class PlaylistMethod {
    public void setMoviePlayInfo(MovieTheater movieTheater) {
        ArrayList<PlayList> playLists = movieTheater.getPlayLists();
        ArrayList<Movie> movies = movieTheater.getMovies();
        ArrayList<ProjectionRoom> projectionRooms = movieTheater.getProjectionRooms();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
        String select = "1";
        while (true){
            boolean[] movieFlags = new boolean[movies.size()];
            boolean isMovieExist = false;
            if ("1".equals(select)){
                System.out.println("请输入电影名：");
                String name = sc.nextLine();
                for (int i = 0; i < movies.size(); i++) {
                    movieFlags[i] = name.equals(movies.get(i).getMovieName());
                }
                for (int i = 0; i < movieFlags.length; i++) {
                    isMovieExist=isMovieExist||movieFlags[i];
                    if (movieFlags[i]){
                        System.out.println("找到电影：" + movies.get(i).toString());
                    }
                }
                if (!isMovieExist){
                    System.out.println("没找到该电影！");
                    continue;
                }

                boolean[] roomFlags = new boolean[projectionRooms.size()];
                boolean isRoomExist = false;
                System.out.println("请输入电放映室：");
                name = sc.nextLine();
                for (int i = 0; i < projectionRooms.size(); i++) {
                    roomFlags[i] = name.equals(projectionRooms.get(i).getRoomName());
                }
                for (int i = 0; i < roomFlags.length; i++) {
                    isRoomExist=isRoomExist||roomFlags[i];
                    if (roomFlags[i]){
                        System.out.println("找到放映室：" + projectionRooms.get(i).toString());
                    }
                }
                if (!isRoomExist){
                    System.out.println("没找到该放映室！");
                    continue;
                }
                System.out.println("请输入电影播放时间：");
                String time = sc.nextLine();
                try {
                    Date date = simpleDateFormat.parse(time);
                } catch (ParseException e) {
                    e.printStackTrace();
                    System.out.println("时间格式错误：月-天 时（24小时制）:分");
                    continue;
                }

            }else if ("0".equals(select)){
                System.out.println("退出放映管理！");
                break;
            }else {
                System.out.println("输入选项错误！");
            }
            System.out.println("是否继续放映管理：1：是，0：否");
            select = sc.nextLine();
        }
    }
}
