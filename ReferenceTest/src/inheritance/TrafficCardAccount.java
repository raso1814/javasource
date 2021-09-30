package inheritance;

public class TrafficCardAccount extends CheckingAccount{
	
	//���¹�ȣ, ������, �ܾ�, ī���ȣ 
	//����ī�� ��ɿ���
	//�Ա��ϴ�, ����ϴ�, üũī�� ����
	//����ī�� ����� �ִٸ� ����� �����Ѵ�

	private boolean hasTrafficCard;
	
	public TrafficCardAccount(String accountNum, int balance, String name, 
			String cardNo, boolean hasTrafficcard) {
		super(accountNum, balance, name, cardNo);
		this.hasTrafficCard = hasTrafficcard;
	}
		
		//����ī�� ����� �ִٸ� ����� �����Ѵ�.
		//�Է°� : ī���ȣ, ����� ����
		//��ȯ�� : ����
		
		int payTrafficCard(String cardNo, int amount) {
			if(!hasTrafficCard) { //hasTrafficCard !=true
				System.out.println("����ī�� ����� �����ϴ�.");
				return 0;
			}
			
			return pay(cardNo, amount);
		}
		
		
	}	

 
	
	
	
		
	


