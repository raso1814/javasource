package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	//주소값도 지정안된 null상태임 그래서 getano쓸 수 없음 안의 값이 null이 아니라 주소가 null이라
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();

			if (choice == 1) {

				createAccount();

			} else if (choice == 2) {
				accountList();

			} else if (choice == 3) {
				deposit();
			} else if (choice == 4) {
				withdraw();
			} else if (choice == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {

		
/*		int i = 0; 
		  
		  while (i<accountArray.length) {
		  
		  if (accountArray[i].getAno() != null) { i++;
		  
		  
		  }
		  
		  if (accountArray[i] == null) {
		  
		  System.out.print("계좌번호 : "); String ano = sc.next();
		  System.out.print("계좌주 : "); String owner = sc.next();
		  System.out.print("초기입금액 : "); int money = sc.nextInt();
		  
		  accountArray[i] = new Account(ano, owner, money);
		  
		  
		  
		 break;}
		   
		  }
	} */

		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int money = sc.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("계좌가 생성되었습니다");
				break;
			}

		}

	}

	private static void accountList() {

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];

			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "\t");
				System.out.print(accountArray[i].getOwner() + "\t");
				System.out.print(accountArray[i].getBalance() + "\t");
				System.out.println();
			}

		}

	}

	private static void deposit() {
		System.out.println("계좌번호 : ");
		String ano = sc.next();

		Account account = findAccount(ano);
		if (account != null) {

			System.out.println("입금액 : ");
			int amount = sc.nextInt();
			account.setAno(account.getAno() + amount);
		} else {
			System.out.println("계좌번호를 확인해주세요");
		}
	}

	private static void withdraw() {

		System.out.println("출금계좌 입력 : ");
		String ano = sc.next();

		Account account = findAccount(ano);

		if (account != null) {
			System.out.println("출금액 : ");
			int amount = sc.nextInt();
			account.setBalance(account.getBalance() - amount);
		
		} else {
			System.out.println("계좌번호를 다시 확인해주세요");
		}

	}

	private static Account findAccount(String ano) {

		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] != null) {

				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
