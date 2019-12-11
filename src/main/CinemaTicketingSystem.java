package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author: DX
 * @date: 2019/11/28 13:53
 * 【已解决】【重要】   八阿哥：在设置预置的播放列表时只设置了一个座位集合，导致多场次电影公用同一个座位集合，选择1场次电影会导致2场次电影的座位减少，此八阿哥不会在自己添加的电影场次中出现。
 * 【未解决】【不重要】 八阿哥：购票完成后没有返回购票结果，购买座位的信息
 */
class CinemaTicketingSystem {

    /**
     * 电影管理系统的菜单
     * @throws ParseException 时间格式转换错误
     */
    static void startSys() throws ParseException {
        Scanner sc = new Scanner(System.in);
        //用来存储电影的ArrayList
        ArrayList<Movie> movieArrayList = new ArrayList<Movie>();
         //用来存储放映场次的ArrayList
        ArrayList<PlayRoom> playRoomArrayList = new ArrayList<PlayRoom>();
        /*
            预置三部电影
            预设放映5个场次
            预设座位30个
            本操作只是为方便后续测试，可以跳过，跳过则使用添加功能手动添加
        */
        presetTheater(movieArrayList,playRoomArrayList);

        //菜单开始，输入选择
        System.out.print("==================\n*1.新增电影入院****\n*2,查询电影信息****\n*3.电影放映设置****\n*4.电影票实时销售**\n*0.退出系统**\n==================\n");
        System.out.println("请选择（1，2，3，4,0）：");

        //nextInt只接收了输入的整数，结尾的换行符并未接收而被下一个nextLine接收，会导致跳过下一个nextLine输入
        //在nextInt后接收参数 先用nextLine接受掉nextInt未接受的换行符
        int select = sc.nextInt();
        sc.nextLine();
        while (select!=0){
            if (select==1){
                System.out.println("*1.新增电影入院****");
                addMovie(movieArrayList);
                System.out.println("本次新加电影完成，现在影院共有"+movieArrayList.size()+"部电影");
            }else if (select==2){
                System.out.println("*2.查询电影信息****");
                searchMovie(movieArrayList);
                System.out.println("#2.查询电影信息完成");
            }else if (select==3){
                System.out.println("*3.电影放映设置****");
                setPlayRoom(movieArrayList,playRoomArrayList);
                System.out.println("#3.电影放映设置完成");
            }else if (select==4){
                System.out.println("*4.电影票实时销售**");
                buyTicket(playRoomArrayList);
                System.out.println("#4.电影票购买成功**");
            }else {
                System.out.println("输入错误,请重新输入:");
            }
            System.out.print("==================\n*1.新增电影入院****\n*2,查询电影信息****\n*3.电影放映设置****\n*4.电影票实时销售**\n*0.退出系统**\n==================\n");
            select=sc.nextInt();
        }
    }

    /**
     * 添加电影
     * @param movies 现有电影集合
     * @return 添加后电影集合
     */
    private static void addMovie(ArrayList<Movie> movies){
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (i==1){
            Movie movie = new Movie();
            System.out.println("输入电影编号：");
            movie.setMovieNumber(sc.nextLine());
            System.out.println("输入电影名字：");
            movie.setMovieName(sc.nextLine());
            System.out.println("输入电影类型：");
            movie.setMovieType(sc.nextLine());
            System.out.println("输入电影主演：");
            movie.setStarringName(sc.nextLine());
            movies.add(movie);
            System.out.println("是否继续添加电影：1：是，0：否");
            i=sc.nextInt();
            sc.nextLine();
        }
    }

    /**
     * 查找电影
     * @param movies 待查的电影集合
     */
    private static void searchMovie(ArrayList<Movie> movies){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入查询类别：1：按编号查找，2：按名字查找");
        int i = sc.nextInt();
        sc.nextLine();
        while (i!=0){
            Movie movie = new Movie();
            if (i==1){
                System.out.println("1：输入电影编号：");
                movie.setMovieNumber(sc.nextLine());
                for (Movie movy : movies) {
                    if (movy.getMovieNumber().equals(movie.getMovieNumber())) {
                        System.out .println(movy.toString());
                    }
                }
            }else if (i==2){
                System.out.println("2：输入电影名字：");
                movie.setMovieName(sc.nextLine());
                for (Movie movy : movies) {
                    if (movy.getMovieName().equals(movie.getMovieName())) {
                        System.out .println(movy.toString());
                    }
                }
            }else {
               System.out.println("输入有误！");
            }
            System.out.println("是否继续查询电影：1：按编号，2：按名字，0：退出");
            i=sc.nextInt();
            sc.nextLine();
        }

    }

    /**
     * 设置放映室
     * @param movies 已存在的电影列表
     * @param playRooms 待添加的放映列表
     */
    private static void setPlayRoom(ArrayList<Movie> movies,ArrayList<PlayRoom> playRooms){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        int i=1;
        sc.nextLine();
        while (i==1){
            PlayRoom  playRoom = new PlayRoom();
            System.out.println("输入放映室编号：");
            playRoom.setRoomId(sc.nextLine());
            System.out.println("输入放映编号：");
            playRoom.setPlayId(sc.nextLine());
            System.out.println("输入电影编号：");
            String mId = sc.nextLine();
            for (Movie movie :movies){
                if (mId.equals(movie.getMovieNumber())){
                    playRoom.setMovie(movie);
                }
            }
            System.out.println("输入放映时间：");
            try {
                playRoom.setPlatTime(simpleDateFormat.parse(sc.nextLine()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("输入票价：");
            playRoom.setPrice(sc.nextDouble());
            System.out.println("输入座位数量：");
            int seatNum = sc.nextInt();
            ArrayList<Seat> seats = new ArrayList<Seat>();
            for (int j=0;j<seatNum;j++){
               Seat seat = new Seat(""+j,false);
               seats.add(seat);
            }
            playRoom.setSeats(seats);
            playRooms.add(playRoom);
            System.out.println("是否继续添加待放映电影：1：是，0：否");
            i=sc.nextInt();
            sc.nextLine();
        }
    }

    /**
     * 用来添加预置电影及 电影场次
     * @param movies 电影集合
     * @param playRooms 放映场次集合
     * @throws ParseException 时间格式化异常
     */
    private static void presetTheater(ArrayList<Movie> movies,ArrayList<PlayRoom> playRooms) throws ParseException {

        Movie movie1=new Movie("111","111","111","111",28d);
        Movie movie2=new Movie("222","222","222","222",28d);
        Movie movie3=new Movie("333","333","333","444",28d);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        ArrayList<Seat> seats0 = new ArrayList<Seat>();
        ArrayList<Seat> seats1 = new ArrayList<Seat>();
        ArrayList<Seat> seats2 = new ArrayList<Seat>();
        ArrayList<Seat> seats3 = new ArrayList<Seat>();
        ArrayList<Seat> seats4 = new ArrayList<Seat>();
        int seaNum = 80;
        for (int i=0;i<seaNum;i++){
            Seat seat1 = new Seat(""+(i+1),false);
            Seat seat2 = new Seat(""+(i+1),false);
            seats0.add(seat1);
            seats3.add(seat2);
        }
        seaNum=120;
        for (int i=0;i<seaNum;i++){
            Seat seat3 = new Seat(""+(i+1),false);
            Seat seat4 = new Seat(""+(i+1),false);
            Seat seat5 = new Seat(""+(i+1),false);
            seats1.add(seat3);
            seats2.add(seat4);
            seats4.add(seat5);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        PlayRoom playRoom1 = new PlayRoom("1","1","放映室1",movie1,simpleDateFormat.parse("2019-11-11 10:10"),seats0,22d);
        PlayRoom playRoom2 = new PlayRoom("2","2","放映室2",movie1,simpleDateFormat.parse("2019-11-11 10:10"),seats1,22d);
        PlayRoom playRoom3 = new PlayRoom("2","3","放映室2",movie2,simpleDateFormat.parse("2019-11-11 15:20"),seats2,25d);
        PlayRoom playRoom4 = new PlayRoom("1","4","放映室1",movie1,simpleDateFormat.parse("2019-11-11 15:20"),seats3,25d);
        PlayRoom playRoom5 = new PlayRoom("2","5","放映室2",movie2,simpleDateFormat.parse("2019-11-11 18:30"),seats4,25d);
        playRooms.add(playRoom1);
        playRooms.add(playRoom2);
        playRooms.add(playRoom3);
        playRooms.add(playRoom4);
        playRooms.add(playRoom5);
    }

    /**
     * 电影购票
     * @param playRooms 放映列表
     */
    private static void buyTicket(ArrayList<PlayRoom> playRooms){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
        for (PlayRoom playRoom:playRooms){
            System.out.println(playRoom.toString());
        }
        System.out.println("1：购票，0：退出");
        int i= sc.nextInt();
        sc.nextLine();
        while (i!=0){
           if (i==1){
                System.out.println("请输入要购买的电影名");
                ArrayList<PlayRoom> playRooms1 = new ArrayList<PlayRoom>();
                String name = sc.nextLine();
                for (PlayRoom playRoom:playRooms){
                    if(name.equals(playRoom.getMovie().getMovieName())){
                        System.out.println("场次编号:"+playRoom.getPlayId()+" 电影名："+playRoom.getMovie().movieName+" 放映时间："+
                                simpleDateFormat.format(playRoom.getPlatTime())+" 放映室："+playRoom.getPlayRoomName()+" 剩余座位："+playRoom.getSeatsCount());
                        playRooms1.add(playRoom);

                    }
                }

                System.out.println("请输入场次编号：");
                PlayRoom playRoom1 = new PlayRoom();
                String num = sc.nextLine();
               for (PlayRoom playRoom:playRooms1){

                   if(num.equals(playRoom.getPlayId())){
                       System.out.println("场次编号:"+playRoom.getPlayId()+" 电影名："+playRoom.getMovie().movieName+" 放映时间："+
                           simpleDateFormat.format(playRoom.getPlatTime())+" 放映室："+playRoom.getPlayRoomName()+" 剩余座位："+playRoom.getSeatsCount());
                       playRoom1=playRoom;
                   }
               }

               seatSelection(playRoom1);

           }else {
               System.out.println("输入错误！");
           }
           System.out.println("1：购票，0：退出");
           i= sc.nextInt();
           sc.nextLine();
        }
    }

    /**
     * 电影选座 座位表
     * @param playRoom 选择的那个电影
     */
    private static void seatSelection(PlayRoom playRoom){
        ArrayList<Seat> seats = playRoom.getSeats();
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i);
            String isEmpty = "空";
            if (seat.isEnpty()) {
                isEmpty = "有";
            }
            if(i%10==0){
                System.out.println();
            }
            System.out.print(" "+seat.getSeatId() +" "+ isEmpty+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n请输入座位号：");
        String str = sc.nextLine();
        for (Seat seat:seats){
            if (seat.getSeatId().equals(str)){
                seat.setEnpty(true);
            }
        }
        System.out.println("选座成功！");
    }
}