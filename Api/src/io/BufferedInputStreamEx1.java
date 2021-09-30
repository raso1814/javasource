package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//���� : Ŭ�����尰�� �ӽ������, ���� ó���� ����

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fis = new FileInputStream("c:\\temp\\file1.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\temp\\test4.txt");
			bos = new BufferedOutputStream(fos);

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}

			bos.flush(); // ���� ����

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
