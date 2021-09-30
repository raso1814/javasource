package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// 장바구니 배열
	private Product[] carts = new Product[10]; // 배열 선언, 괄호는 어디오든 상관없음
	// 배열은 생성만으로는 null이 돼서 반드시 생성을 해야한다, heap 자리잡기
	// 그런데 new로 생성은 했지만 주소가 null이므로 더 해야한다

	// 회원정보 배열 - 회원정보, 결제타입
	private User users[] = new User[2];

	// 상품정보 배열 - 상품이름, 가격, 상세정보
	private Product products[] = new Product[5];
	// Product가 추상클래스이므로 타입은 Product지만 생성은 자식클래스로 해야한다

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("블로거", PayType.CASH);

	}

	@Override
	public void genProduct() {
		// Product 타입의 객체 생성(->추상클래스)
		// 추상클래스 -> 자식클래스 객체 생성

		products[0] = new CellPhone("갤럭시노트5", 1000000, "SKT");
		products[1] = new CellPhone("애플 아이폰7", 980000, "KT");
		products[2] = new CellPhone("갤럭시10", 700000, "LGU+");
		products[3] = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[4] = new SmartTV("LG Smart TV", 2500000, "FULL HD");

	}

	@Override
	public void start() {

		System.out.println(this.title + " : 메인화면 - 계정선택");
		System.out.println("=========================");

		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}

		System.out.println("[x]종료");
		System.out.println("선택 : ");

		String choice = sc.next();

		System.out.printf("## %s선택 ##", choice);

		// 사용자가 0,1 선택한 경우 -> 상품목록 호출
		// x를 입력한 경우 -> 종료
		switch (choice) {
		case "x":
			System.exit(0);
			break;

		default: // "0","1"
			selUser = choice;
			productList();
			break;
		}

		System.out.println();

	}

	public void productList() {

		System.out.println(this.title + " : 상품목록 - 상품선택");
		System.out.println("=========================");

		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");

		// 사용자 입력 -> 상품선택0-4(장바구니에 현재 선택한 제품 담기)
		String choice = sc.next();
		System.out.println("## " + choice + " 선택##");
		System.out.println();

		switch (choice) {
		case "h":
			start();

			break;

		case "c":
			checkout();
			break;

		default:
			// 사용자가 선택한 상품을 carts에 담기

			for (int i = 0; i < carts.length; i++) {

				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(choice)];
					break;
				}
			}

			productList();

			break;
		}

	};

	public void checkout() {

		System.out.println(this.title + " : 체크아웃");
		System.out.println("=========================");

		int sum = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d]%s(%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				sum += carts[i].getPrice();
			}
			

		}

		System.out.println("=========================");
		System.out.println("결제방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.printf("합계 : %d\n", sum);
		System.out.println("[p]이전, [q]결제완료");
		System.out.println("선택 : ");

		String choice = sc.next();

		switch (choice) {
		case "p":
			checkout();
			break;
		case "q":
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
			System.exit(0);
			break;

		default:
			break;
		}

	}

}
