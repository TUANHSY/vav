package com.chinasoftware.aboutgenerictlist;

import main.PerpetualCalendar;
import main.Sort;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义带泛型数组集合
 * @author: DX
 * @date: 2019/12/5 11:27
 */
public class Main {
    public static void main(String[] args) {
        CustomizeBilateralLinkedList QQlist = new CustomizeBilateralLinkedList();
        QQlist.addAfterHead("12345");
        QQlist.addAfterHead("678902");
        QQlist.addAfterHead("234456");
        QQlist.addAfterHead("12345");
        QQlist.addAfterHead("12345");
        QQlist.addAfterHead("234456");
        System.out.println(QQlist.toString());
        QQlist.deduplication();
        System.out.println(QQlist.toString());

        int n=33;
        int k =6;
        int[] redball = Sort.random(n);
        int begin = (int) Math.floor(Math.random()*(n-k));
        int [] red = new int[k];
        int blue = (int) Math.floor(Math.random()*(16)+1);
        System.arraycopy(redball, begin, red, 0, k);
        System.out.print("红球：[");
        for (int i:red){
            System.out.print(i+" ");
        }
        System.out.println("] 蓝球：["+blue+"]");

        String [] province ={"黑龙江","浙江","江西","广东","福建"};
        String [] provincialCapital ={"哈尔滨","杭州","南昌","广州","福州"};

        Map<String,String> city = new HashMap<>();
        for (int i=0;i<province.length;i++){
            city.put(province[i],provincialCapital[i]);
        }
        System.out.println(city.toString());

        Generic generic = new Generic();
        generic.getRandomArray(32,6);

        try {
            PerpetualCalendar.perpetualCalendar(1995,5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

