package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		
		InputStream in = System.in; // Ű���� ����
		OutputStream out = System.out; // ����� ����
		
		byte[] datas = new byte[100];
		
		//����ڷκ��� �̸��� �ϰ� ���� ���� �Է¹��� �Ŀ� String ��ü�� ��ȯ
		
		System.out.print("�̸� : ");
		try {
			int nameBytes = in.read(datas);//ȫ�浿+����
			//read()�� ���� ����Ʈ ��
			//Enter : carriage return => 13��, line feed => 10��
			String name = new String(datas, 0, nameBytes-2); //���Ͱ�����
			
			System.out.print("�ϰ������ : ");
			
			int commentBytes = in.read(datas);//ȫ�浿+����
			String comment = new String(datas, 0, commentBytes-2);
			
			System.out.println("�Է��� �̸� : "+name);
			System.out.println("�Է��� �ϰ� ���� �� : "+comment);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		

	}

}
