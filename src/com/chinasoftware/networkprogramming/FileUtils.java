package com.chinasoftware.networkprogramming;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ��װ����
 * @author Administrator
 *
 */
public class FileUtils {

	public static void main(String[] args) {
		//�ļ����ļ�
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("test.txt");
			copy(is,os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//�ļ����ֽ�����
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("abc.txt");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			copy(is, baos);
			datas = baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//�ֽ����鵽�ļ�
		try {
			InputStream is = new ByteArrayInputStream(datas);
			OutputStream os = new FileOutputStream("bcd.txt");
			copy(is, os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void copy(InputStream is,OutputStream os){
		try {
			//����(�ֶζ�ȡ)
			byte[] flush = new byte[1024];
			int len;
			while((len=is.read(flush))!=-1){
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(is,os);
		}
		
	}
	/**
	 * �ͷ���Դ
	 */
	public static void close(InputStream is,OutputStream os){
		try {
			if(os!=null) {
				os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(is!=null) {
				is.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
