package com.chinasoftware.aboutfile;

/**
 * @author: DX
 * @date: 2019/12/9 19:07
 */
public class Main {
    public static void main(String[] args) {
        byte[] bytes =PhotoCopy.getByteArray("E:\\cs\\123.jpg");
        for (int i=0;i<bytes.length;i++){

            System.out.print(Integer.toHexString(bytes[i])+" ");
            if (i%50==0){
                System.out.println();
            }
        }
        System.out.println("\n"+bytes.length);
        PhotoCopy.byteToFile(bytes,"E:\\cs\\125.jpg");
    }
}
