package test;

import java.io.IOException;

public class WhileTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean run = true;
		int keyCode = 0, speed = 0;

		while (run) {
			//13= CR&&10 LF : 엔터
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("============");
				System.out.println("1.종속 | 2.감속 | 3.중지");
				System.out.println("============");
				System.out.print("선택 : ");
			}
		

		keyCode = System.in.read(); //1->49 2->50 3->51

		if (keyCode == 49) {
			speed++;
			System.out.println("현재속도 =" + speed);
		} else if (keyCode == 50) {
			speed--;
			System.out.println("현재속도 =" + speed);
		} else if (keyCode == 51) {
			run = false;
		}
		
		}
		System.out.println("프로그램 종료");
		}
		
		
	

}
