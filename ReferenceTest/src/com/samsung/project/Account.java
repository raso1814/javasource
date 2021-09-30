package com.samsung.project;

public class Account {
	//속성 : 계좌번호, 잔액, 이름
	//기본생성자
	//기능 : 입금한다(입력값 입금액, 반환값 없음) -> 현재잔액 +=입금액
	//      출금한다(입력값 출금액, 반환값 전체잔액) -> 현재잔액 -=출금액
	
	
	 private String accountNum;
	 private int balance;
	 private String name;
	
	 //접근제어자
	 //public,protected,default(package),private
	 //public(접근제한 없음) : 클래스, 필드(멤버변수), 생성자, 메소드
	 //protected(자식 클래스가 아닌 다른 패키지에 있는 클래스 접근 불가) : 필드, 생성자, 메소드
	 //default(package 다른 패키지에 있는 클래스 접근 불가) : 클래스, 필드, 생성자, 메소드
	 //아무것도 안붙이는 상황이 default
	 //private(모든 외부 클래스 접근 불가) : 필드, 생성자, 메소드
	 //클래스, 생성자, 메소드 -> 주로 public
	 //필드 -> private
	 
	 
	 private int iv;  // 인스턴스 변수, 속성, 프로퍼티, 멤버변수, 필드
	 static int cv;  //클래스변수, static변수
	 void method(int a){
	 int sum=0;} // (중간 괄호 안 특정 영역 안에만 가능한)생성자, 메소드 안의 변수 지역변수
	 
	 //생성시기 
	 // 클래스변수 : 클래스가 메모리에 올라갈 때(저장 시)
	 // 인스턴스변수 : 객체 생성될 때
	 // 지역변수 : 변수 선언문이 수행될 때
	 
	 //상속 -> extends
	 //부모클래스 -> 자식클래스

	 
	 
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


	public void deposit(int money){
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

	
