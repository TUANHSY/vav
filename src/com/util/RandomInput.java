package com.util;

import java.util.Scanner;

/**
 * 随机一种输入方式
 * @author: DX
 * @date: 2019/12/16 15:26
 */
public class RandomInput {
    /**
     * 随机类型输入
     * @return object
     */
    public static Object input(){
        Scanner scanner = new Scanner(System.in);
        Object object = null;
        int select = (int) (Math.floor(Math.random()*8)+1);
        switch (select){
            case 1:
                System.out.println("请输入String");
                object=scanner.next();
                break;
            case 2:
                System.out.println("请输入Int");
                object=scanner.nextInt();
                break;
            case 3:
                System.out.println("请输入Double");
                object=scanner.nextDouble();
                break;
            case 4:
                System.out.println("请输入bool");
                object=scanner.nextBoolean();
                break;
            case 5:
                System.out.println("请输入float");
                object=scanner.nextFloat();
                break;
            case 6:
                System.out.println("请输入long");
                object=scanner.nextLong();
                break;
            case 7:
                System.out.println("请输入short");
                object=scanner.nextShort();
                break;
            case 8:
                System.out.println("请输入byte");
                object=scanner.nextByte();
                break;
                default:
                    System.out.println("请输入String");
                    object=scanner.nextLine();
        }

        return object;





    }
}
