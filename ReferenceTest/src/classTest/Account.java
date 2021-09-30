package classTest;

public class Account {
	//속성 : 계좌번호, 잔액, 이름
	//기본생성자
	//기능 : 입금한다(입력값 입금액, 반환값 없음) -> 현재잔액 +=입금액
	//      출금한다(입력값 출금액, 반환값 전체잔액) -> 현재잔액 -=출금액
	
	
	private String accountNum;
	private int balance;
	private String name;
	
		
	
	
	public Account(String accountNum, int balance, String name) {
		this(accountNum,name); // this() : 다른 생성자 호출
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
	
	// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업
	// set~으로 메소드를 작성한다. 
	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	
	//이름을 변경하고 싶다면
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//멤버 변수의 값을 리턴하고 싶다면
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

	
