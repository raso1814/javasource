package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//버퍼 : 클립보드같은 임시저장소, 빠른 처리를 위함

public class BufferedInputStreamEx4 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			//fis = new FileInputStream("c:\\temp\\picture.jpg");
			fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			bis = new BufferedInputStream(fis);
			//fos = new FileOutputStream("c:\\temp\\picture_copy2.jpg");
			fos = new FileOutputStream("c:\\temp\\Rolling_copy2.mp3");
			bos = new BufferedOutputStream(fos);

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
							}

			bos.flush(); // 버퍼 비우기

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				bis.close();
				fis.close();
				fos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
