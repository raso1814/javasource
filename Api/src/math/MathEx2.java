package math;

public class MathEx2 {

	public static void main(String[] args) {

		Math.random(); // 0 <=Math.random()<1

		// �� ���� �������� ���ϱ�(1~3���� ��������)
		// 211 123 321...
		// �� ���� �������� �Ȱ����������� �ݺ�

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
