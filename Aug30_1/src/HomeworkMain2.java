import java.util.Scanner;

public class HomeworkMain2 {
	public static void main(String[] args) throws InterruptedException {

		Scanner k = new Scanner(System.in);

		System.out.println("BMI ����");
		
		System.out.print("�̸� : ");
		String name = k.next();

		System.out.print("Ű(cm) : ");
		double height = k.nextDouble();
		
	

		System.out.print("������(kg) : ");
		double weight = k.nextDouble();

		double bmi = weight / ((height / 100) * (height / 100));

		Thread.sleep(5000);
		if (bmi >= 35) {
			System.out.printf("����� bmi�� %.2f�̸� �����Դϴ�.\n", bmi);
		} else if (bmi >= 30) {
			System.out.printf("����� bmi�� %.2f�̸� �ߵ����Դϴ�.\n", bmi);
		} else if (bmi >= 25) {
			System.out.printf("����� bmi�� %.2f�̸� �浵���Դϴ�.\n", bmi);
		} else if (bmi >= 23) {
			System.out.printf("����� bmi�� %.2f�̸� ��ü���Դϴ�.\n", bmi);
		} else if (bmi >= 18.5) {
			System.out.printf("����� bmi�� %.2f�̸� �����Դϴ�.\n", bmi);
		} else {
			System.out.printf("����� bmi�� %.2f�̸� ��ü���Դϴ�.\n", bmi);
		}

		System.out.println("���α׷��� �����ϱ� �� �ƹ�Ű�� �����ʽÿ�");
		
		System.out.println("");
		String x = k.next();
	}
}
