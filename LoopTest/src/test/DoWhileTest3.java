package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int com = (int)(Math.random()*100+1);	
	
	Scanner sc = new Scanner(System.in);
	int user; 

	do{
		System.out.println("���ڸ� �Է����ּ��� : ");
		user = sc.nextInt();
		System.out.println("���� : "+ user);
		System.out.println("��ǻ�� : "+ com);
		
		if (com>user) {
			System.out.println("�� ū ���� �Է����ּ���");	
		}
		
		if (com<user)
		{System.out.println("�� ���� ���� �Է����ּ���");}
		
	}
	while (com !=user);
	System.out.println("���߼̽��ϴ�");
	
	}

}
