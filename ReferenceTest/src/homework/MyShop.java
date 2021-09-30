package homework;

import java.util.Scanner;

public class MyShop implements iShop {

	String title;

	Scanner sc = new Scanner(System.in);

	Product carts[];

	String selUser;

	User users[] = new User[2];

	User user1 = new User("홍길동", PayType.CARD);
	User user2 = new User("블로거", PayType.CASH);

	Product products[] = new Product[5];
	
	Product product1 = new Cellphone("갤럭시노트5", 1000000, "SKT");

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void getUser() {
		
		
		for (int i = 0; i < users.length; i++) {
			
			String name = sc.next(); 
			users[i].setName(name);
			
			
			
		}

	}

	@Override
	public void getProduct() {

		
		
		
	}

	@Override
	public void start() {

		System.out.println("MyShop : 메인화면 - 계정선택");

		for (int i = 0; i < 1; i++) {

			System.out.printf("[%d]%s", i, users[i].getName());

		}
		System.out.println();

	}

	void productList() {

		for (int i = 0; i < 1; i++) {

			products[i].printDetail();

		}
		

	}

	void checkOut() {
	}

}
