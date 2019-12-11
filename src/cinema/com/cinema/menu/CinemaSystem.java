package cinema.com.cinema.menu;

import cinema.com.cinema.entity.MovieTheater;
import cinema.com.cinema.method.MovieMethod;
import cinema.com.cinema.method.MovieTheaterMethod;
import cinema.com.cinema.method.PlaylistMethod;

import java.text.ParseException;
import java.util.Scanner;

/**
 * 构造一个电影院，
 * 构造电影院的放映室，
 * 构造每个放映室的座位，
 * 构造电影，
 * 构造放映业务清单，
 * 开始售票选座，
 * @author: DX
 * @date: 2019/11/29 14:30
 *
 * 【收获】  nextInt只接收了输入的整数，结尾的换行符并未接收而被下一个nextLine接收，会导致跳过下一个nextLine输入，
 *          在nextInt后接收参数 先用nextLine接受掉nextInt未接受的换行符
 */
public class CinemaSystem {
    public void startMenu() throws ParseException {
        Scanner sc = new Scanner(System.in);

        //构造一个电影院
        MovieTheater movieTheater = new MovieTheater("4210000001","天河影城","xxx市xxx区xxx路xxx广场xxx座xxx楼");
        //初始化电影院
        MovieTheaterMethod movieTheaterMethod =new MovieTheaterMethod();
        movieTheaterMethod.initialMovieTheater(movieTheater);

        while (true){
            //菜单开始，输入选择
            System.out.print("============================\n#\t1.新增电影入院****\n#\t2,查询电影信息****\n#\t3.电影放映设置****\n#\t4.电影票实时销售**\n#\t0.退出系统********\n============================\n");
            System.out.println("请选择（1，2，3，4,0）：");
            String select=sc.nextLine();
            MovieMethod movieMethod = new MovieMethod();
            PlaylistMethod playlistMethod = new PlaylistMethod();
            if ("1".equals(select)){
                System.out.println("*1.新增电影入院****");
                movieMethod.addMovie(movieTheater);
                System.out.println("#1.本次新加电影完成，现在影院共有"+movieTheater.getMovies().size()+"部电影");
            }else if ("2".equals(select)){
                System.out.println("*2.查询电影信息****");
                movieMethod.searchMovie(movieTheater);
                System.out.println("#2.查询电影信息完成");
            }else if ("3".equals(select)){
                System.out.println("*3.电影放映设置****");
                playlistMethod.setMoviePlayInfo(movieTheater);
                System.out.println("#3.电影放映设置完成");
            }else if ("4".equals(select)){
                System.out.println("*4.电影票实时销售**");

                System.out.println("#4.电影票购买成功**");
            }else if ("0".equals(select)){
                System.out.println("#0.退出系统");
                break;
            } else  {
                System.out.println("输入错误,请重新输入:");
            }
        }
    }
}
