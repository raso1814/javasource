import java.util.Scanner;

// if(A) {A ������������
// } else if(B) {A�� ��, B�� ������������
// }

public class CSMain2 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� : ");
		int mid = k.nextInt();

		System.out.print("�⸻��� : ");
		int fin = k.nextInt();

		System.out.println("----------");

		double avg = (mid + fin) / 2.0;
		// int/int=int�Ƿ� ����ȯ �Ǵ� �Ѱ��� double�̸� �ż� 2.0���� ó��
		System.out.printf("��� : %.1f\n", avg);

		// ����� 90�� �̻��̸� ����� ���, �ƴϸ� ��!��� ���
		if (avg >= 90) {
			System.out.println("��");
		} else {
			System.out.println("��!");
			if (avg >= 80) {
				System.out.println("�������� ���ض�");
			}
		}

		if (avg >= 90) {
			System.out.println("��");
		} else {
			if (avg >= 80) {
				System.out.println("��");
			} else {
				if (avg >= 70) {
					System.out.println("��");
				} else {
					if (avg >= 60) {
						System.out.println("��");
					} else {
						System.out.println("��");
					}
				}
			}
		}

		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 70) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");			
		}

	}
}
