package exception;

public class AccountEx {

	public static void main(String[] args) {

		Account account = new Account();

		try {
			account.withdraw(10000);
		} catch (Exception e) {
			// e.printStackTrace(); // 오류가 어디서 났는지 추적해서 출력해줌
			System.out.println(e.getMessage());

		}

	}

}
