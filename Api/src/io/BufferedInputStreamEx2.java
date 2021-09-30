package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamEx2 {

	public static void main(String[] args) {

		// FileInputStream만 사용하는 경우 + byte 배열
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")) {

			byte data[] = new byte[1024];
			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream만 사용시 : "+(end-start));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//FileInputStream + BufferedInputStream 사용하는 경우
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			byte data[] = new byte[1024];
			long start = System.currentTimeMillis();
			while (bis.read(data) != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream 사용시 : "+(end-start));

						
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		

	}

}
