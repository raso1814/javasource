import java.util.Scanner;

//조건문 : 특정 조건 때만 흐름이 넘어오도록
//      if
//      switch

//반복문 : 
//컬렉션
//특징
// -> 집 날씨

public class ConditionalStmt {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("가격 : ");
		int price = k.nextInt();

		System.out.println("-----------------");

		System.out.printf("%d원어치 구매함\n", price);
		int point = (int) (price * 0.01);

		if (price >= 10000) {
			point += 50;
		}

		System.out.printf("적립포인트 : %d\n", point);

		// 20000<가격<50000이면 포인트 100점 추가, 아니면 10점 추가

		if (20000 < price && price < 50000) {
			point += 100;
		} else {
			point += 10;
		}

		System.out.printf("적립포인트 : %d\n", point);

	}
}
