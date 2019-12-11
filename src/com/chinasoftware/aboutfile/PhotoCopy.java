package com.chinasoftware.aboutfile;

import java.io.*;

/**
 * @author: DX
 * @date: 2019/12/9 18:56
 */
public class PhotoCopy {
    public static byte[] getByteArray(String filePath){


        File file = new File(filePath);

        InputStream inputStream = null;

        ByteArrayOutputStream byteArrayOutputStream = null;

        try {

            inputStream = new FileInputStream(file);

            byteArrayOutputStream = new ByteArrayOutputStream();
            byte [] flush = new byte[1024*10];
            int len;
            while ((len=inputStream.read(flush))!=-1){
                byteArrayOutputStream.write(flush,0,len);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (byteArrayOutputStream!=null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void byteToFile(byte[] bytes,String filePath){
        File file = new File(filePath);

        InputStream inputStream = new ByteArrayInputStream(bytes);
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            byte[] flush = new byte[1024];
            int len;
            while ((len=inputStream.read(flush))!=-1){
                outputStream.write(flush,0,len);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
