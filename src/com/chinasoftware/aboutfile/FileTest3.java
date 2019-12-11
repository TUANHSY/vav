package com.chinasoftware.aboutfile;

import java.io.*;

/**
 * @author: DX
 * @date: 2019/12/11 11:11
 */
public class FileTest3 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("dest.txt"))));
            String exit = "exit";
            String str = null;
            while (!exit.equals(str)){
                str = reader.readLine();
                writer.write(str);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
