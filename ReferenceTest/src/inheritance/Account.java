package inheritance;

public class Account {

	
	private String accountNum;
	private int balance;
	private String name;
	
		
	
	
	
	
	
//	public Account(String accountNum, String name) {
//		super();
//		this.accountNum = accountNum;
//		this.name = name;
//		
//		
//		
//	}

	
//	public Account() {
//		super();
//		
//	}


	public Account(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}

	void deposit(int money){
	balance += money;
	}
	
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}
	
	public int setBalance(int balance) {
		this.balance = balance;
		return balance;
	}
	
	
	public int getBalance(){
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

	
