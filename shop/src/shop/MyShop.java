package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// ��ٱ��� �迭
	private Product[] carts = new Product[10]; // �迭 ����, ��ȣ�� ������ �������
	// �迭�� ���������δ� null�� �ż� �ݵ�� ������ �ؾ��Ѵ�, heap �ڸ����
	// �׷��� new�� ������ ������ �ּҰ� null�̹Ƿ� �� �ؾ��Ѵ�

	// ȸ������ �迭 - ȸ������, ����Ÿ��
	private User users[] = new User[2];

	// ��ǰ���� �迭 - ��ǰ�̸�, ����, ������
	private Product products[] = new Product[5];
	// Product�� �߻�Ŭ�����̹Ƿ� Ÿ���� Product���� ������ �ڽ�Ŭ������ �ؾ��Ѵ�

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("��ΰ�", PayType.CASH);

	}

	@Override
	public void genProduct() {
		// Product Ÿ���� ��ü ����(->�߻�Ŭ����)
		// �߻�Ŭ���� -> �ڽ�Ŭ���� ��ü ����

		products[0] = new CellPhone("�����ó�Ʈ5", 1000000, "SKT");
		products[1] = new CellPhone("���� ������7", 980000, "KT");
		products[2] = new CellPhone("������10", 700000, "LGU+");
		products[3] = new SmartTV("�Ｚ 3D Smart TV", 5000000, "4K");
		products[4] = new SmartTV("LG Smart TV", 2500000, "FULL HD");

	}

	@Override
	public void start() {

		System.out.println(this.title + " : ����ȭ�� - ��������");
		System.out.println("=========================");

		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}

		System.out.println("[x]����");
		System.out.println("���� : ");

		String choice = sc.next();

		System.out.printf("## %s���� ##", choice);

		// ����ڰ� 0,1 ������ ��� -> ��ǰ��� ȣ��
		// x�� �Է��� ��� -> ����
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

		System.out.println(this.title + " : ��ǰ��� - ��ǰ����");
		System.out.println("=========================");

		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.println("���� : ");

		// ����� �Է� -> ��ǰ����0-4(��ٱ��Ͽ� ���� ������ ��ǰ ���)
		String choice = sc.next();
		System.out.println("## " + choice + " ����##");
		System.out.println();

		switch (choice) {
		case "h":
			start();

			break;

		case "c":
			checkout();
			break;

		default:
			// ����ڰ� ������ ��ǰ�� carts�� ���

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

		System.out.println(this.title + " : üũ�ƿ�");
		System.out.println("=========================");

		int sum = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d]%s(%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				sum += carts[i].getPrice();
			}
			

		}

		System.out.println("=========================");
		System.out.println("������� : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.printf("�հ� : %d\n", sum);
		System.out.println("[p]����, [q]�����Ϸ�");
		System.out.println("���� : ");

		String choice = sc.next();

		switch (choice) {
		case "p":
			checkout();
			break;
		case "q":
			System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ�. ##");
			System.exit(0);
			break;

		default:
			break;
		}

	}

}
