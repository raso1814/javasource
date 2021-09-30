import java.util.Scanner;

public class HomeworkMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("가격 : ");
		int price = k.nextInt();

		System.out.print("낸돈 : ");
		int money = k.nextInt();

		int x = money - price;
		System.out.println("거스름돈 : " + x);

		if (x >= 10000) {
			System.out.println("1만원 : " + x / 10000);
			x %= 10000;
		}

		if (x >= 5000) {
			System.out.println("5천원 : " + x / 5000);
			x %= 5000;

		}

		if (x >= 1000) {
			System.out.println("1천원 : " + x / 1000);
			x %= 1000;
		}

		if (x >= 500) {
			System.out.println("5백원 : " + x / 500);
			x %= 500;
		}

		System.out.println("나머지 : " + x);
	}
}
