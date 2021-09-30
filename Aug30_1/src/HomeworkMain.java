import java.util.Scanner;

public class HomeworkMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("비만도 검사----------");
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();

		System.out.println("-------------");
		
		double x = (height-100)*0.9;
		double y = (weight/x)*100;
		String result = (y > 120) ? "비만" : "정상";
		
		System.out.printf("표준체중 : %.2f\n",x);
		System.out.printf("비만도 : %.2f\n",y);
		System.out.printf("%s씨는 %s입니다\n", name, result);
		
		Thread.sleep(5000);
		
		
	}

}
