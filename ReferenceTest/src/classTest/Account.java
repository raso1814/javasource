package classTest;

public class Account {
	//�Ӽ� : ���¹�ȣ, �ܾ�, �̸�
	//�⺻������
	//��� : �Ա��Ѵ�(�Է°� �Աݾ�, ��ȯ�� ����) -> �����ܾ� +=�Աݾ�
	//      ����Ѵ�(�Է°� ��ݾ�, ��ȯ�� ��ü�ܾ�) -> �����ܾ� -=��ݾ�
	
	
	private String accountNum;
	private int balance;
	private String name;
	
		
	
	
	public Account(String accountNum, int balance, String name) {
		this(accountNum,name); // this() : �ٸ� ������ ȣ��
		//super();
		//this.accountNum = accountNum;
		this.balance = balance;
		//this.name = name;
	}
	
	
	public Account(String accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		
		
		
	}

	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	void deposit(int money){
	balance += money;
	}
	
	int withdraw(int money) {
		balance -= money;
		return balance;
	}
	
	// �ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾�
	// set~���� �޼ҵ带 �ۼ��Ѵ�. 
	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	
	//�̸��� �����ϰ� �ʹٸ�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//��� ������ ���� �����ϰ� �ʹٸ�
	int getBalance(){
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	void print() {}
	
		
	}

	
