import java.util.Scanner;

public class HomeworkMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("�񸸵� �˻�----------");
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű : ");
		double height = k.nextDouble();
		
		System.out.print("������ : ");
		double weight = k.nextDouble();

		System.out.println("-------------");
		
		double x = (height-100)*0.9;
		double y = (weight/x)*100;
		String result = (y > 120) ? "��" : "����";
		
		System.out.printf("ǥ��ü�� : %.2f\n",x);
		System.out.printf("�񸸵� : %.2f\n",y);
		System.out.printf("%s���� %s�Դϴ�\n", name, result);
		
		Thread.sleep(5000);
		
		
	}

}
