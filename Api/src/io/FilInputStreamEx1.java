package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilInputStreamEx1 {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = System.out;
		byte datas[] = new byte[100];

		//try-with-resources : 자동으로 자원해제
		//finally안에 있는 in과 out 관련을 try(안에)
		try {
			in = new FileInputStream("c:\\temp\\file1.txt");

			while (in.read(datas) != -1) {
				out.write(datas);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
