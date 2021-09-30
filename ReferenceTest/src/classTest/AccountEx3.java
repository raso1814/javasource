package classTest;

public class AccountEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Account3 객체를 5개 생성하고 싶다
		Account account1 = new Account("122-12", 2000, "홍길동");
		Account account2 = new Account("122-13", 2100, "장길동");
		Account account3 = new Account("122-14", 2200, "최길동");
		Account account4 = new Account("122-15", 2300, "김길동");
		Account account5 = new Account("122-16", 2400, "이길동");

		// 동일한 타입으로 객체 생성시 효율성

		account5.print();

		Account accArr[] = new Account[5];
		// int a,b,c,d,e... > int arr[] = new int

		System.out.println(accArr[0]); // null

		// 타입 1)기본타입 2)참조타입
		// 참조타입 : null로 초기화가 된다
		// 참조타입 : 배열, 클래스,
		// 클래스 -> 대문자로 시작하세요
		// 배열 : 기본타입 배열, 클래스 배열

		accArr[0] = new Account("122-12", 2000, "홍길동");
		accArr[1] = new Account("122-13", 2100, "장길동");
		accArr[2] = new Account("122-14", 2200, "최길동");
		accArr[3] = new Account("122-15", 2300, "김길동");
		accArr[4] = new Account("122-16", 2400, "이길동");

//		
		// for(int i=0; i<accArr.length; i++) {
		// System.out.print(accArr[i].getName()+"\t");
		// System.out.print(accArr[i].getAccountNum()+"\t");
		// System.out.print(accArr[i].getBalance()+"\t");

		// System.out.println();
		// }

		for (int i = 0; i < accArr.length; i++) {
			Account account = accArr[i]; // 변수 새로만들어도 주소는 안바뀌어 그대로 변경

			accountPrint(account);

		}
		// 참조타입은 메소드로 넘길때 참조값(주소)이 넘어감
		// 기본타입은 메소드를 넘길때 값이 넘어감

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