package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
	
		System.out.print("당신 : ");
		int hum = k.nextInt();
		
		int com = (int)((Math.random()*3)+1);
		System.out.printf("컴퓨터 : %d\n", com);
		
		int result = com-hum;
		
		switch (result) {
		case -1: case 2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			break;
		case 1: case -2:
			System.out.println("당신이 졌습니다");
			break;
		default:
			break;
		}
		
	}

}
