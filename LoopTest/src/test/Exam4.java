package test;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
				
		boolean run = true;
		
		//�ܾ�
		int balance=0;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			
			System.out.println("****************************");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("****************************");
			
			System.out.println("����>>>");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("���ݾ� : ");
				int a = sc.nextInt();
				balance += a;
				System.out.printf("�ܰ� : %d\n", balance);
				continue;
			case 2:
				System.out.println("��ݾ� : ");
				int b = sc.nextInt();
				balance -= b;
				System.out.printf("�ܰ� : %d\n", balance);
				continue;
			case 3:
				System.out.printf("�ܰ� : %d\n", balance);
				continue;
			case 4:
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				break;
			default:
				System.out.println("�޴�Ȯ��");
				break;
			
			}
			
			
			//1 ���� : ��������� ���ݾ� �Է¹ޱ� -> balance �߰�
			//2 ���� : ��������� ��ݾ� �Է¹ޱ� -> balance ����
			//3 ���� : balance ���
			//4 ���� : run=false ���� �� ���α׷� ����
		
		}
				

	}

}
