import java.util.Scanner;

// if(A) {A 만족시켰으면
// } else if(B) {A는 땡, B를 만족시켰으면
// }

public class CSMain2 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int mid = k.nextInt();

		System.out.print("기말고사 : ");
		int fin = k.nextInt();

		System.out.println("----------");

		double avg = (mid + fin) / 2.0;
		// int/int=int므로 형변환 또는 한개만 double이면 돼서 2.0으로 처리
		System.out.printf("평균 : %.1f\n", avg);

		// 평균이 90점 이상이면 수라고 출력, 아니면 야!라고 출력
		if (avg >= 90) {
			System.out.println("수");
		} else {
			System.out.println("야!");
			if (avg >= 80) {
				System.out.println("다음에는 잘해라");
			}
		}

		if (avg >= 90) {
			System.out.println("수");
		} else {
			if (avg >= 80) {
				System.out.println("우");
			} else {
				if (avg >= 70) {
					System.out.println("미");
				} else {
					if (avg >= 60) {
						System.out.println("양");
					} else {
						System.out.println("가");
					}
				}
			}
		}

		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else if (avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");			
		}

	}
}
