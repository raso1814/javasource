package classTest;

public class AccountEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Account3 ��ü�� 5�� �����ϰ� �ʹ�
		Account account1 = new Account("122-12", 2000, "ȫ�浿");
		Account account2 = new Account("122-13", 2100, "��浿");
		Account account3 = new Account("122-14", 2200, "�ֱ浿");
		Account account4 = new Account("122-15", 2300, "��浿");
		Account account5 = new Account("122-16", 2400, "�̱浿");

		// ������ Ÿ������ ��ü ������ ȿ����

		account5.print();

		Account accArr[] = new Account[5];
		// int a,b,c,d,e... > int arr[] = new int

		System.out.println(accArr[0]); // null

		// Ÿ�� 1)�⺻Ÿ�� 2)����Ÿ��
		// ����Ÿ�� : null�� �ʱ�ȭ�� �ȴ�
		// ����Ÿ�� : �迭, Ŭ����,
		// Ŭ���� -> �빮�ڷ� �����ϼ���
		// �迭 : �⺻Ÿ�� �迭, Ŭ���� �迭

		accArr[0] = new Account("122-12", 2000, "ȫ�浿");
		accArr[1] = new Account("122-13", 2100, "��浿");
		accArr[2] = new Account("122-14", 2200, "�ֱ浿");
		accArr[3] = new Account("122-15", 2300, "��浿");
		accArr[4] = new Account("122-16", 2400, "�̱浿");

//		
		// for(int i=0; i<accArr.length; i++) {
		// System.out.print(accArr[i].getName()+"\t");
		// System.out.print(accArr[i].getAccountNum()+"\t");
		// System.out.print(accArr[i].getBalance()+"\t");

		// System.out.println();
		// }

		for (int i = 0; i < accArr.length; i++) {
			Account account = accArr[i]; // ���� ���θ��� �ּҴ� �ȹٲ�� �״�� ����

			accountPrint(account);

		}
		// ����Ÿ���� �޼ҵ�� �ѱ涧 ������(�ּ�)�� �Ѿ
		// �⺻Ÿ���� �޼ҵ带 �ѱ涧 ���� �Ѿ

//		account.deposit(10000);

//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNum()+"\t");
//			System.out.print(account.getBalance()+"\t");

//			System.out.println();
//	}

		accountPrint(accArr);

		System.out.println();

	}

	static void accountPrint(Account accArr[]) {
		for (int i = 0; i < accArr.length; i++) {
			System.out.print(accArr[i].getName() + "\t");
			System.out.print(accArr[i].getAccountNum() + "\t");
			System.out.print(accArr[i].getBalance() + "\t");

			System.out.println();
		}

	}

	static void accountPrint(Account account) {

		System.out.print(account.getName() + "\t");
		System.out.print(account.getAccountNum() + "\t");
		System.out.print(account.getBalance() + "\t");

		System.out.println();

	}

}