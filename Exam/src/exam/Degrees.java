package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// ȭ���µ� -> �����µ� 
		
		// ȭ���µ� �Է¹ޱ�(����)
		// ���� ȭ���µ� -> �����µ��� ��ȯ �� ����ϱ�
		// (ȭ���µ�-32)*5/9 
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("ȭ���µ� : ");
		int f = k.nextInt();
		double c = (f-32)*5/9.0;
		System.out.printf("�����µ� : %.2f", c);
		
		
		
		

	}

}
