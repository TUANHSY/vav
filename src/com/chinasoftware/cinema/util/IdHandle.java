package com.chinasoftware.cinema.util;

/**
 * @author: DX
 * @date: 2019/12/2 19:55
 */
public class IdHandle {
    private static final int A = 10;
    private static final int B = 100;
    private static final int C = 1000;

    /**
     * 处理用户输入的座位号，将其变成数据库同格式
     * @param str 用户输入的座位编号
     * @param hallId 大厅编号
     * @return 处理后的座位编号
     */
    public static String seatIdGetHandle(String str, String hallId){
        if (Integer.parseInt(str)<A){
            str = hallId+"000000"+str;
        }else if (Integer.parseInt(str)<B){
            str = hallId+"00000"+str;
        }else {
            str = hallId+"0000"+str;
        }
        return str;
    }

    /**
     * 对播放列表的id 格式处理
     * @param str 播放场次
     * @param hallId 放映厅编号
     * @param movieId 电影编号
     * @return 处理后的编号
     */
    public static String playIdHandle (String str,String hallId,String movieId){
        if (Integer.parseInt(str)<A){
            str = hallId+movieId.substring(movieId.length()-4)+"00"+str;
        }else if (Integer.parseInt(str)<B){
            str = hallId+movieId.substring(movieId.length()-4)+"0"+str;
        }else if(Integer.parseInt(str)<C) {
            str = hallId+movieId.substring(movieId.length()-4)+str;
        }else {
            System.out.println("长度超出");
        }
        return str;
    }
}
