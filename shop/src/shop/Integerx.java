package shop;

import java.util.Scanner;

public class Integerx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		String input = sc.next();
		System.out.println(input+5); // + : 연결
		
		//"5" -> 5
		int num = Integer.parseInt(input);
		System.out.println(num+5); // + : 연산
				
		
		
	}

}
