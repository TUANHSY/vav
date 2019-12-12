package com.chinasoftware.aboutfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author: DX
 * @date: 2019/12/11 16:43
 */
public class FileTest6 {
    public static void main(String[] args) throws IOException {
        File file = new File("dest.txt");
        String msg = FileUtils.readFileToString(file,"utf8");
        int j=0;
        //将文件读取为字符串时 字符串中包含换行符，win中换行符占两个字节 \r\n ，linux下为一字节 \n ， mac下为一字节\r
        //遍历输出msg
        String[] strings =msg.split("\r\n");
        int length =0;
        for (String s :strings){
            System.out.println(s+" ");
            length=length+10;
        }
        System.out.println(length);
        //查找A a
        for (int i=0;i<msg.length();i++){
            char c =msg.charAt(i);
            if (c =='\n'){
                c=' ';
            }
            if (c =='\r'){
                c='r';
            }
            if (c =='A'||c=='a'){
                j++;
            }
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println(j);
    }
}
