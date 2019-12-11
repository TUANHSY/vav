package com.chinasoftware.aboutfile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 复制图片
 * 1.图片读取到字节数组中
 * 2.字节数组写出到图片中
 * @author Administrator
 *
 */
public class IOTest09 {

	public static void main(String[] args) {
		byte[] datas =  fileToByteArray("E:\\cs\\123.jpg");
		System.out.println(datas.length);
		for (int i = 0; i < datas.length; i++) {

			System.out.print(datas[i]+" ");
			if (i%100==0){
				System.out.println();
			}
		}
		byteArrayToFile(datas, "E:\\cs\\128.jpg");
	}
	//图片转换成字节数组
	public static byte[] fileToByteArray(String filePath){
		//创建源与目的地
		File file = new File(filePath);
		byte[] dest = null;
		//选择流
		InputStream is =null;
		ByteArrayOutputStream baos = null;

		
		try {
			is = new FileInputStream(file);
			baos = new ByteArrayOutputStream();
			//操作流(分段读取)
			byte[] flush = new byte[1024*10];
			int len = -1;
			while((len=is.read(flush))!=-1){
				baos.write(flush, 0, len);
			}
			baos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(baos!=null)
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return baos.toByteArray();
		
		
	}
	//将字节数组转换成图片
	public static void byteArrayToFile(byte[] src,String filePath){
		//创建源
		File file = new File(filePath);
		//选择流
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(file);
			//操作流（分段读取）
			byte[] flush = new byte[1024];
			int len=-1;
			while((len=is.read(flush))!=-1){
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(os!=null)
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
