import java.util.Scanner;

//���ǹ� : Ư�� ���� ���� �帧�� �Ѿ������
//      if
//      switch

//�ݺ��� : 
//�÷���
//Ư¡
// -> �� ����

public class ConditionalStmt {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int price = k.nextInt();

		System.out.println("-----------------");

		System.out.printf("%d����ġ ������\n", price);
		int point = (int) (price * 0.01);

		if (price >= 10000) {
			point += 50;
		}

		System.out.printf("��������Ʈ : %d\n", point);

		// 20000<����<50000�̸� ����Ʈ 100�� �߰�, �ƴϸ� 10�� �߰�

		if (20000 < price && price < 50000) {
			point += 100;
		} else {
			point += 10;
		}

		System.out.printf("��������Ʈ : %d\n", point);

	}
}
