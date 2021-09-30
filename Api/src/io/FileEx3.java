package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {

		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp, "file3.txt");
		File file4 = new File("c:\\temp\\file4.txt");

		// 폴더 생성
		if (!temp.exists()) {
			temp.mkdir();
		}

		if (!dir.exists()) {
			dir.mkdir();
		}

		// 파일 생성
		try {
			if (!file1.exists()) {
				file1.createNewFile();
			}

			if (!file2.exists()) {
				file2.createNewFile();
			}

			if (!file3.exists()) {
				file3.createNewFile();
			}

			if (!file4.exists()) {
				file4.createNewFile();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 파일 정보 출력
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("--------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
		File contents[] = temp.listFiles(); //temp폴더 내의 내용물 배열로 받기
		for (File f : contents) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			// long access = f.lastModified(); 파일최종접근일자
			// Date date = new Date(access);
			// SimpleDateFormat sdf = new SimpleDateFormat(형식)
			// String format = sdf.format(date);

			if (f.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + f.getName());

			} else {
				System.out.print("\t\t" + f.length() + "\t" + f.getName());
			}

			System.out.println();
		}
	}

}
