package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {

//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//
//		try {
//			fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
//			fos = new FileOutputStream("c:\\temp\\test1.txt");
//
//			byte datas[] = new byte[100];
//
//			while (fis.read(datas) != -1) {
//				fos.write(datas);
//
//			}
//
//		} catch (FileNotFoundException e) {
//
//			try {
//				fis.close();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		

		try (FileInputStream fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
				FileOutputStream fos = new FileOutputStream("c:\\temp\\test1.txt");) {

			byte datas[] = new byte[100];

			while (fis.read(datas) != -1) {
				fos.write(datas);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
