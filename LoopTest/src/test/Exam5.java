package test;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {

		boolean run = true;

		// 잔액
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("****************************");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("****************************");

			System.out.println("선택>>>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("예금액 : ");
				balance+=sc.nextInt();
				continue;
			} else if (num == 2) {
				System.out.println("출금액 : ");
				balance-=sc.nextInt();
				continue;
			} else if (num == 3) {
				System.out.printf("잔고 : %d\n", balance);
				continue;
			} else if (num == 4) {
				System.out.println("프로그램이 종료되었습니다");
				break;
			}

			// 1 선택 : 사용자한테 예금액 입력받기 -> balance 추가
			// 2 선택 : 사용자한테 출금액 입력받기 -> balance 차감
			// 3 선택 : balance 출력
			// 4 선택 : run=false 변경 후 프로그램 종료

		}

	}

}
