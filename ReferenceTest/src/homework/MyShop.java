package homework;

import java.util.Scanner;

public class MyShop implements iShop {

	String title;

	Scanner sc = new Scanner(System.in);

	Product carts[];

	String selUser;

	User users[] = new User[2];

	User user1 = new User("ȫ�浿", PayType.CARD);
	User user2 = new User("��ΰ�", PayType.CASH);

	Product products[] = new Product[5];
	
	Product product1 = new Cellphone("�����ó�Ʈ5", 1000000, "SKT");

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

		System.out.println("MyShop : ����ȭ�� - ��������");

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
