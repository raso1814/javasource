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
		//�����ϴ�, ���ݾ��� 0.1% ���ʽ� ����Ʈ
		bonusPoint+=money*0.001;
		super.deposit(money); //�� deposit(money) �ȵ�?

	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}
