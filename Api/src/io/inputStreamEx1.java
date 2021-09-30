package io;

import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx1 {

	public static void main(String[] args) {

		// System.in : 키보드 입력
		InputStream in = System.in;
		int input=0;
		// 추상클래스로 new 생성은 못하지만 값은 받을 수 있다
		
		

		try {
			//int input = in.read();
			//System.out.println(input);
			//System.out.print((char)input);
			
			while ((input=in.read())!=-1) {
				System.out.print((char)input);
			}
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		


		

	}

}
