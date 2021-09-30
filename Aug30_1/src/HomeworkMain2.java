import java.util.Scanner;

public class HomeworkMain2 {
	public static void main(String[] args) throws InterruptedException {

		Scanner k = new Scanner(System.in);

		System.out.println("BMI 계산기");
		
		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("키(cm) : ");
		double height = k.nextDouble();
		
	

		System.out.print("몸무게(kg) : ");
		double weight = k.nextDouble();

		double bmi = weight / ((height / 100) * (height / 100));

		Thread.sleep(5000);
		if (bmi >= 35) {
			System.out.printf("당신의 bmi는 %.2f이며 고도비만입니다.\n", bmi);
		} else if (bmi >= 30) {
			System.out.printf("당신의 bmi는 %.2f이며 중도비만입니다.\n", bmi);
		} else if (bmi >= 25) {
			System.out.printf("당신의 bmi는 %.2f이며 경도비만입니다.\n", bmi);
		} else if (bmi >= 23) {
			System.out.printf("당신의 bmi는 %.2f이며 과체중입니다.\n", bmi);
		} else if (bmi >= 18.5) {
			System.out.printf("당신의 bmi는 %.2f이며 정상입니다.\n", bmi);
		} else {
			System.out.printf("당신의 bmi는 %.2f이며 과체중입니다.\n", bmi);
		}

		System.out.println("프로그램을 종료하기 전 아무키나 누르십시오");
		
		System.out.println("");
		String x = k.next();
	}
}
