package test;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {

		boolean run = true;

		// �ܾ�
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("****************************");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("****************************");

			System.out.println("����>>>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("���ݾ� : ");
				balance+=sc.nextInt();
				continue;
			} else if (num == 2) {
				System.out.println("��ݾ� : ");
				balance-=sc.nextInt();
				continue;
			} else if (num == 3) {
				System.out.printf("�ܰ� : %d\n", balance);
				continue;
			} else if (num == 4) {
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				break;
			}

			// 1 ���� : ��������� ���ݾ� �Է¹ޱ� -> balance �߰�
			// 2 ���� : ��������� ��ݾ� �Է¹ޱ� -> balance ����
			// 3 ���� : balance ���
			// 4 ���� : run=false ���� �� ���α׷� ����

		}

	}

}
