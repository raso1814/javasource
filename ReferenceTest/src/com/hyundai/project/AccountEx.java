package com.hyundai.project;

import java.util.Scanner;

//���� ��Ű���� �ƴ� Ŭ������ �ҷ��� �� �ʿ� 
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
		
		//�����ڸ� ������� �ʰ� ������� �� �ʱ�ȭ
		human1.setName("ȫ�浿");
		human1.setAccountNum("122-01-1222222");
		human1.setBalance(15000);
			
				
		System.out.println(human1.getBalance());
		
		
		
		Account human2 = new Account("1727-282", "������");
		System.out.println("���� �ܾ� ��ȸ : " + human2.getBalance());
	}

}
