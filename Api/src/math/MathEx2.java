package math;

public class MathEx2 {

	public static void main(String[] args) {

		Math.random(); // 0 <=Math.random()<1

		// 세 개의 랜던값을 구하기(1~3까지 나오도록)
		// 211 123 321...
		// 세 개의 랜덤값이 똑같아질때까지 반복

		while (true) {

			int a = (int) (Math.random() * 3) + 1;
			int b = (int) (Math.random() * 3) + 1;
			int c = (int) (Math.random() * 3) + 1;

			System.out.printf("%d %d %d\n", a, b, c);

			if (a == b && b == c) {
				break;
			}
		}

	}

}
