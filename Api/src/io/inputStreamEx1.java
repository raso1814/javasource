package io;

import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx1 {

	public static void main(String[] args) {

		// System.in : Ű���� �Է�
		InputStream in = System.in;
		int input=0;
		// �߻�Ŭ������ new ������ �������� ���� ���� �� �ִ�
		
		

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
