import java.util.Scanner;

// << >> <<<(shift����)
// ���߼��ù������� ���

// ����
//     ���� : 1
//     ��� : 2
//     ������ : 3

//Ư��
//      ���Ÿ� : 1 << 0
//       ���� : 1 << 1
//       ���� : 1 << 2
//Ư�� = (1<<0) + (1<<1) = ���Ÿ�+����

// 24�ð� = 1 << 0 : 1
// ���� = 1 << 1 : 2
// ���� = 1 << 2 : 4
// �������� = 1 << 3 :8

// AƯ�� = 1 -> 24�ð�
// BƯ�� = 2 -> ����
// CƯ�� = 8 -> ��������
// DƯ�� = 3 -> 1+2 -> 24�ð�+����
// EƯ�� = 6 ->2 +4 -> ����+����

//��κ� 2�׿���
//     a>2
//     1+2

// 1��(����)����
//       !d


public class OperatorMain3 {
	public static void main(String[] args) {
		int a = 32 >> 2;
		System.out.println(a);
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("���� : ");
		int age = k.nextInt();
		//20�� �̻��̸� �ȳ��ϼ���, �ƴϸ� ����
		// 3�׿���
		//       ���ǽ� ? O���� : X����
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		//���̰� ¦���� ¦, Ȧ���� Ȧ
		String oe = (age%2 == 0) ? "¦" : "Ȧ";
		System.out.println(oe);
		
		//�̸��� ȫ�浿�̸� ��...��, �ƴϸ� �������
		String say2 = (name.equals("ȫ�浿"))? "��...��," : "�������";
		System.out.println(say2);
		//������(==)��� �͵��� stack������ ����ε� String�� heap�� �ְ� stack�� #2
		// .equals()��� heap �ȿ� �ִ°� �˻� / ȫ�浿 heap #2�� stack?

		
		
	
	
	
	}
}
