package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
	
		System.out.print("��� : ");
		int hum = k.nextInt();
		
		int com = (int)((Math.random()*3)+1);
		System.out.printf("��ǻ�� : %d\n", com);
		
		int result = com-hum;
		
		switch (result) {
		case -1: case 2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
			break;
		case 1: case -2:
			System.out.println("����� �����ϴ�");
			break;
		default:
			break;
		}
		
	}

}
