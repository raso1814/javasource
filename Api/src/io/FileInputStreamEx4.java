package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\temp\\Rolling.mp3");
			fos = new FileOutputStream("C:\\temp\\Rolling_copy.mp3");

			byte[] datas = new byte[1024];

			try {
				while (fis.read(datas) != -1) {//-1: 파일의 끝
					fos.write(datas);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
