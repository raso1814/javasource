package test;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)((Math.random()*4)+8);
		
	
				
		switch (num) {
		case 8:
			System.out.println("����� �մϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");	
			break;
		}
		
		
	}

}
