package inheritance;

public class CreditLineAccount extends Account {
	// 계좌번호, 계좌주, 잔액, 마이너스한도, 입금하다, 출금하다
	// 출금하다 오버라이딩
	// 부모의 기능 : 잔액 = 잔액 - 출금액
	// 자식 : 잔액(현재잔액 + 마이너스한도) - 출금액

	private int creditLine;

	public CreditLineAccount(String accountNum, int balance, String name, int creditLine) {
		super(accountNum, balance, name);
		this.creditLine = creditLine;

	}

	@Override
	int withdraw(int amount) {

		if (getBalance() + creditLine < amount) {
			System.out.println("인출불가");
			return 0;
		}
		
		setBalance(getBalance()-amount);
		return getBalance();
		//return getBalance()+creditLine;
		
		//클래스, 메소드, 생성자 public
		//필드 private
		//default 
		
	}

}
