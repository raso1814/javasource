import java.util.Scanner;

public class HomeworkMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int price = k.nextInt();

		System.out.print("���� : ");
		int money = k.nextInt();

		int x = money - price;
		System.out.println("�Ž����� : " + x);

		if (x >= 10000) {
			System.out.println("1���� : " + x / 10000);
			x %= 10000;
		}

		if (x >= 5000) {
			System.out.println("5õ�� : " + x / 5000);
			x %= 5000;

		}

		if (x >= 1000) {
			System.out.println("1õ�� : " + x / 1000);
			x %= 1000;
		}

		if (x >= 500) {
			System.out.println("5��� : " + x / 500);
			x %= 500;
		}

		System.out.println("������ : " + x);
	}
}
