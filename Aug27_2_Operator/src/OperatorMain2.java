import java.util.Scanner;

//��������
//   >     >=     ==     !=     <=     <
// (�ʰ�)  (�̻�)  (����)  (�ٸ���)  (����)  (�̸�)

//�����տ�����
//   &&      ||        !
// ��(and)  �ų�(or)   �ݴ�(not)
// �����տ����� �Ѱ��� �ᵵ ��
// ���̰� ����? &&�ΰ��� ���ǵ� ������� ���鼭 �ʹݿ� ���� ����ġ �ϸ� �ٷγ����°�
// &�Ѱ��� ���� ������ �� �����°�. �۾����� &&�� ȿ������
// && �� ��, Ȯ�� ���� ��(X,����ġ) ������ ������ �۾� �ʹݿ� ���߹Ƿ� �۾��� �پ����
// || �� ��, Ȯ�� ���� ��(O,��ġ) ������ ������ �۾� �ʹݿ� ���߹Ƿ� �۾��� �پ����

public class OperatorMain2 {
	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ű : ");
		double height = a.nextDouble();
		
		System.out.print("���� : ");
		int age = a.nextInt();
		
		System.out.println("--------------");
		
		System.out.printf("Ű %.1fcm, ���� %d��\n", height, age);
		
		//Ű�� 150 �ѳ�
		boolean b = (height > 150);
		System.out.printf("Ű�� 150cm�� �ѳ���? %b\n", b);
		
		boolean c = (age <= 10);
		System.out.printf("���̰� 10�� �����ΰ���? %b\n", c);
		
		System.out.println("--------------");
		
		boolean d = (age >= 5) && (height >= 200);
		System.out.printf("���̰� 5�� �̻��̰� Ű�� 200cm �̻��ΰ���? %b\n", d);		
		//"���̰� 5�� �̻��̰� Ű�� 200cm �̻��ΰ���? b%\n", d
		
		boolean e = (height >= 200) || (age >= 5);
		System.out.printf("Ű�� 200cm �̻��̰ų� ���̰� 5�� �̻��ΰ���? %b\n", e);
			
		// d�� true�� e�� false
		// d�� false�� e�� true
		boolean f = !e;
		System.out.println(f);
				
		a.close();
	}
}
