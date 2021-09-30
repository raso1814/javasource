package inheritance;

public class BonusPointAccount extends Account {

	private int bonusPoint;
	
	public BonusPointAccount
	(String accountNum, int balance, String name, int bonusPoint) {
		super(accountNum, balance, name);
		this.bonusPoint=bonusPoint;
	}

	@Override
	void deposit(int money) {
		//예금하다, 예금액의 0.1% 보너스 포인트
		bonusPoint+=money*0.001;
		super.deposit(money); //왜 deposit(money) 안돼?

	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}
