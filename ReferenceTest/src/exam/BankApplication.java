package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	//�ּҰ��� �����ȵ� null������ �׷��� getano�� �� ���� ���� ���� null�� �ƴ϶� �ּҰ� null�̶�
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("| 1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� |");
			System.out.println("---------------------------------------------");
			System.out.print("����>");
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
		System.out.println("���α׷� ����");

	}

	private static void createAccount() {

		
/*		int i = 0; 
		  
		  while (i<accountArray.length) {
		  
		  if (accountArray[i].getAno() != null) { i++;
		  
		  
		  }
		  
		  if (accountArray[i] == null) {
		  
		  System.out.print("���¹�ȣ : "); String ano = sc.next();
		  System.out.print("������ : "); String owner = sc.next();
		  System.out.print("�ʱ��Աݾ� : "); int money = sc.nextInt();
		  
		  accountArray[i] = new Account(ano, owner, money);
		  
		  
		  
		 break;}
		   
		  }
	} */

		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("������ : ");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ� : ");
		int money = sc.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("���°� �����Ǿ����ϴ�");
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
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();

		Account account = findAccount(ano);
		if (account != null) {

			System.out.println("�Աݾ� : ");
			int amount = sc.nextInt();
			account.setAno(account.getAno() + amount);
		} else {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���");
		}
	}

	private static void withdraw() {

		System.out.println("��ݰ��� �Է� : ");
		String ano = sc.next();

		Account account = findAccount(ano);

		if (account != null) {
			System.out.println("��ݾ� : ");
			int amount = sc.nextInt();
			account.setBalance(account.getBalance() - amount);
		
		} else {
			System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ���");
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
