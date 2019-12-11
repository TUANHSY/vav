package cinema.com.cinema.method;
import cinema.com.cinema.entity.Movie;
import cinema.com.cinema.entity.MovieTheater;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 增删改查
 * @author: DX
 * @date: 2019/12/2 9:29
 */
public class MovieMethod {
    /**
     * 添加电影
     * @param movieTheater 电影院
     */
    public void addMovie(MovieTheater movieTheater) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = movieTheater.getMovies();
        int a = movies.size();
        String select = "1";
        while (true){
            if ("1".equals(select)){
                System.out.println("请输入电影名称：");
                String name = sc.nextLine();
                System.out.println("请输入电影主演：");
                String star = sc.nextLine();
                Movie movie = new Movie(""+movies.size(),name,star);
                movies.add(movie);
            }else if ("0".equals(select)){
                System.out.println("退出添加！");
                break;
            }else {
                System.out.println("输入信息错误！");
            }

            System.out.println("是否继续录入：1：是，0：否");
            select = sc.nextLine();
        }
        movieTheater.setMovies(movies);
        System.out.println("#1.添加成功！本次添加"+(movies.size()-a)+"部");
    }

    /**
     * 查找电影
     * @param movieTheater 电影院
     */
    public void searchMovie(MovieTheater movieTheater) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = movieTheater.getMovies();
        String select = "1";
        while (true){
            boolean[] flags = new boolean[movies.size()];
            boolean isExist = false;
            if ("1".equals(select)){
                System.out.println("请输入电影名：");
                String name = sc.nextLine();
                for (int i = 0; i < movies.size(); i++) {
                    flags[i] = name.equals(movies.get(i).getMovieName());
                }
                for (int i = 0; i < flags.length; i++) {
                    isExist=isExist||flags[i];
                    if (flags[i]){
                        System.out.println("找到电影：" + movies.get(i).toString());
                    }
                }
                if (!isExist){
                    System.out.println("没找到该电影！");
                }

            }else if ("0".equals(select)){
                System.out.println("退出查询！");
                break;
            }else {
                System.out.println("输入选项错误！");
            }
            System.out.println("是否继续查询：1：是，0：否");
            select = sc.nextLine();
        }
    }
}


