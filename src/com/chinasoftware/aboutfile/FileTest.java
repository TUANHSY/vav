package com.chinasoftware.aboutfile;

import java.io.*;

/**
 * 字节流copy文件
 * @author: DX
 * @date: 2019/12/9 9:08
 */
public class FileTest {
    public static void main(String[] args) {
        File  file0 = new File ("E:\\cs\\cd.txt");
        File  file1 = new File ("E:\\cs\\cs.txt");
        InputStream   inputStream  = null;
        OutputStream  outputStream = null;
        try {
            int temp;
            inputStream  = new FileInputStream (file0);
            outputStream = new FileOutputStream(file1,true);

            //缓冲
            byte[] b = new byte[1024];
            while ((temp=inputStream.read(b))!=-1){
               outputStream.write(b,0,temp);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null){
                try {
                    outputStream.close();
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
