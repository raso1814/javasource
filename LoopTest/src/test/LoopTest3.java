package test;

import java.util.Scanner;

public class LoopTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("구구단 단수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i < 10; i ++) {
			System.out.printf("%d * %d = %d\t", num, i, (num * i));
		}

	}

}
