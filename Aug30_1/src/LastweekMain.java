import java.util.Scanner;
// �����տ����� 
//2��¥�� : �ߴܵǴ� ����
//    && = �� Ȯ�� �����Ÿ� ������ ��ġ
//    || = �� Ȯ�� �����Ÿ� ������ ��ġ
//1��¥�� : ������ ���� ����
//xor(eXclusive OR) ^ ���� �Ѱ��� ���϶� boolean

public class LastweekMain {
	public static void main(String[] args) {
	
	Scanner a = new Scanner(System.in);
	
	System.out.print("���� : ");
	int width = a.nextInt();
	
	System.out.print("���� : ");
	int length = a.nextInt();
	
	System.out.print("���� : ");
	int height = a.nextInt();
			
	System.out.print("���� : ");
	int weight = a.nextInt();
	
	System.out.println("----------------");
	
	System.out.println("���� : " + (width * length * height));
	System.out.println("���� : " + weight);
	
	int b = width * length * height;
	System.out.printf("���� : %d\n", b);
	System.out.printf("���� : %d\n", weight);
	
	// decimal :%d / float : %f
	
	// ���ǰ� 10�̻��̰�, ���԰� 1000�̻��̸� 
	boolean c = (b >= 10) & (weight >= 1000);
	System.out.println(c);
	System.out.printf("���ǰ� 10cm�̻��̰� ���԰� 1000kg �̻��Դϱ�? %b\n", c);
	//ȿ������ �۾� : 	boolean c = (weight >= 1000) && (b >= 10);
	
	boolean d = (b < 10) | (weight < 1000);
	System.out.println(d);
	System.out.printf("���ǰ� 10cm�̸��̰ų� ���԰� 1000kg �̸��Դϱ�? %b\n", d);
	//ȿ������ �۾� : boolean d = (weight < 1000) || (b < 10); 
	
	boolean e = (b >= 20) & (weight >= 30);
	System.out.println(e);
	System.out.printf("���ǰ� 20cm�̻��̰� ���԰� 30kg �̻��Դϱ�? %b\n", e);
	//ȿ������ �۾� : boolean e = (weight >= 20);
	
	boolean f = !(b >= 20) & (weight >= 30);
	System.out.println(f);
	
	//���ǰ� 10�̸� �̵���, ���԰� 1000�̸��̵���
	boolean g = (weight <1000) ^ (b < 10);
	System.out.println(g);
	}
}
