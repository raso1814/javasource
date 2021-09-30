import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("��ǰ�� : ");
		String productName = a.next();
		
		System.out.print("���� : ");
		int productPrice = a.nextInt();
		
		System.out.print("���� : ");
		double productWeight = a.nextDouble();
		
		System.out.println("---------------------");
		
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productWeight);
		
		// �������� printf/ �ٵ� �ٹٲ޾����� \n���� ���ֱ�
		// %s : String ���� �ڸ�
		// %d : decimal(������) ���� ���� �ڸ�
		// %05d : �ι�° �ڸ��� �ڸ����� ���� �տ� 0ä���� �ڸ��� 5�ڸ� ���߱�
		// %f : float �Ǽ� ���� �ڸ�
		// %.3f : �ڸ��� �����ؼ� �Ǽ� �����ڸ� �ݿø��ؼ� �Ҽ��� ��°�ڸ�����
		// %b : boolean
		
		System.out.printf("-��ǰ�� : %s-\n", productName);
		System.out.printf("-���� : %d-\n", productPrice );
		System.out.printf("-���� : %05d-\n", productPrice );
		System.out.printf("-���� : %f-\n", productWeight );
		System.out.printf("-���� : %.3f-\n", productWeight );
		
		double pct = 56.7;
		System.out.printf("-%.2f-\n", pct);
		System.out.printf("-%.2f%%-\n", pct);
		// %�� \ó�� Ư�����ڷ� JAVA���� ���̹Ƿ�, %��� ���ϸ� %%�����

		System.out.printf("%s[%d��] - %fgram", productName, productPrice, productWeight);
							
		a.close();
		
	
		
	}

}
