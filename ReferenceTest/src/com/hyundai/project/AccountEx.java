package com.hyundai.project;

import java.util.Scanner;

//같은 패키지가 아닌 클래스를 불러올 때 필요 
import com.samsung.project.Account;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		Account human1 = new Account("122-01-12222",50000,"James");
		
		//human1.accountNum ="122-01-12222";
		//human1.balance = 50000;
		//human1.name="James"; 
		
		human1.deposit(10000);
		//The method deposit(int) from the type Account is not visible
		
		//생성자를 사용하지 않고 멤버변수 값 초기화
		human1.setName("홍길동");
		human1.setAccountNum("122-01-1222222");
		human1.setBalance(15000);
			
				
		System.out.println(human1.getBalance());
		
		
		
		Account human2 = new Account("1727-282", "성춘향");
		System.out.println("현재 잔액 조회 : " + human2.getBalance());
	}

}
