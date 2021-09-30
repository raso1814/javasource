package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int com = (int)(Math.random()*100+1);	
	
	Scanner sc = new Scanner(System.in);
	int user; 

	do{
		System.out.println("숫자를 입력해주세요 : ");
		user = sc.nextInt();
		System.out.println("유저 : "+ user);
		System.out.println("컴퓨터 : "+ com);
		
		if (com>user) {
			System.out.println("더 큰 수를 입력해주세요");	
		}
		
		if (com<user)
		{System.out.println("더 작은 수를 입력해주세요");}
		
	}
	while (com !=user);
	System.out.println("맞추셨습니다");
	
	}

}
