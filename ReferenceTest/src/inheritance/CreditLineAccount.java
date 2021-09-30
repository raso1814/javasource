package inheritance;

public class CreditLineAccount extends Account {
	// ���¹�ȣ, ������, �ܾ�, ���̳ʽ��ѵ�, �Ա��ϴ�, ����ϴ�
	// ����ϴ� �������̵�
	// �θ��� ��� : �ܾ� = �ܾ� - ��ݾ�
	// �ڽ� : �ܾ�(�����ܾ� + ���̳ʽ��ѵ�) - ��ݾ�

	private int creditLine;

	public CreditLineAccount(String accountNum, int balance, String name, int creditLine) {
		super(accountNum, balance, name);
		this.creditLine = creditLine;

	}

	@Override
	int withdraw(int amount) {

		if (getBalance() + creditLine < amount) {
			System.out.println("����Ұ�");
			return 0;
		}
		
		setBalance(getBalance()-amount);
		return getBalance();
		//return getBalance()+creditLine;
		
		//Ŭ����, �޼ҵ�, ������ public
		//�ʵ� private
		//default 
		
	}

}
