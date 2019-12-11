package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 万年历类
 * @author: DX
 * @date: 2019/11/28 9:04
 */
public class PerpetualCalendar {
    /**
     * 万年历 输出某年某月的日历
     * @param year 年
     * @param month 月
     * @throws ParseException 抛出时间格式化异常
     */
    public static void perpetualCalendar(int year,int month) throws ParseException {
        //周几字符串定义
        String []week = {"日","一","二","三","四","五","六",};
        //获取该年该月有多少天
        int days = getMonthDay(year,month);
        //将year+month转换为该年该月第一天00：00：00的时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = simpleDateFormat.parse(year+"-"+month);
        //将时间转换为Calendar格式
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //获得当前时间周几
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
        for(int i=0;i<week.length;i++){
            System.out.print("  "+week[i]+"");
        }
        printCalendar(days,dayOfWeek);
    }

    /**
     * 获得某年某月的天数
     * @param year 年份
     * @param month 月份
     * @return 该月天数
     */
    private static int  getMonthDay(int year, int month){
        int[] dayMonth = new int[12];
        for (int i=0;i<dayMonth.length;i++){
            if ((i+1)%2!=0){
                if (i<7){
                    dayMonth[i]=31;
                }else {
                    dayMonth[i]=30;
                }
            }else {
                if (i<7){
                    dayMonth[i]=30;
                }else {
                    dayMonth[i]=31;
                }
            }
        }
        //判断是否闰年 改变二月天数
        boolean isALeapYear = (year%4==0&&year%100!=0)||year%400==0;
        if (isALeapYear){
            dayMonth[1]=29;
        }else {
            dayMonth[1]=28;
        }
        return dayMonth[month-1];
    }

    /**
     * 格式化输出天数 对应的周几
     * @param day 该月天数
     * @param dayOfWeek 第一天是周几
     */
    private static void printCalendar(int day,int dayOfWeek){
        int[] monthDay = new int[35];
        int[] days =new int[day];
        for (int i=0;i<days.length;i++){
            days[i]=i+1;
        }
        for (int i=0;i<monthDay.length;i++){
            if (i<dayOfWeek){
                monthDay[i]=2;
            }else if(i>=day+dayOfWeek){
                monthDay[i]=2;
            }else {
                    monthDay[i]= days[i-dayOfWeek];
            }
        }
        for (int i=0;i<monthDay.length;i++){
             if (i%7==0){
                 System.out.println();
             }
             if (i<dayOfWeek){
                 System.out.print("  "+" "+" ");
             }else if (i<9+dayOfWeek){
                 System.out.print("  "+monthDay[i]+" ");
             }else if(i<days.length+dayOfWeek){
                 System.out.print(" "+monthDay[i]+" ");
             }else {
                 System.out.print("  "+" "+" ");
             }
        }
    }
}
