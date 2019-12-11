package com.chinasoftware.aboutfile;

import java.io.*;

/**
 * @author: DX
 * @date: 2019/12/11 13:48
 */
public class FileTest4 {
    public static void main(String[] args) throws IOException {

        //写
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeUTF("俄代表处");
        objectOutputStream.writeObject("你好");
        objectOutputStream.writeObject(34567898763234567L);
        objectOutputStream.writeObject(18d);
        objectOutputStream.writeObject("你好测定");
        objectOutputStream.writeObject(18f);

        objectOutputStream.flush();
        byte[] bytes = byteArrayOutputStream.toByteArray();


        //读
        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));
        objectInputStream.read();
    }
}
