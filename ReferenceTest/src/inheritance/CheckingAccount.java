package inheritance;

public class CheckingAccount extends Account {
 //���¹�ȣ, ������, �ܾ� -> �θ�
//�Ա��ϴ�,����ϴ� -> �θ�
	

	//ī���ȣ(111-11-1234)
	private String cardNo;
	
	public CheckingAccount(String accountNum, int balance, String name, String cardNo) {
		super(accountNum, balance, name);
		this.cardNo=cardNo;	}
	
	//�Է°� : ī���ȣ, ���ݾ�
	//��ȯ�� : ����(int)
	//ī�尪�� �����Ѵ�(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������,
	//���ݾ��� ���� �ܾ׺��ٴ� ������ Ȯ���ϰ� ���� ����)
	
	int pay(String cardNo, int amount) {
	
		if (!cardNo.equals(this.cardNo)|| amount>getBalance()) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ�����ּ���");
			return 0; //�޼ҵ� ȣ�� pay�� ���ư� = break�� ���
		}
		
		//�ܾ� = �����ܾ� - ī�����
		//setBalance(getBalance()-amount);
		//�θ��� withdraw�� ������ ��ɰ� ����
		//���� �ٽ� ������ ���� �θ��� withdraw�� ����ϸ� ��
		return withdraw(amount);
		
	} 
	
	
	
	
}
