package com.chinasoftware.aboutfile;

import java.io.*;

/**
 * 字符流copy文件实现
 * @author: DX
 * @date: 2019/12/9 16:25
 */
public class FileTest1 {
    public static void main(String[] args) {
        File file0 = new File("E:\\cs\\cs.txt");
        File file1 = new File("E:\\cs\\cd.txt");
        try {
            Reader reader = new FileReader(file0);
            Writer writer = new FileWriter(file1);
            int len;
            char[] temp =new char[1024];
            while ((len=reader.read(temp))!=-1){
                writer.append(temp.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
