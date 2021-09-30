import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("제품명 : ");
		String productName = a.next();
		
		System.out.print("가격 : ");
		int productPrice = a.nextInt();
		
		System.out.print("무게 : ");
		double productWeight = a.nextDouble();
		
		System.out.println("---------------------");
		
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productWeight);
		
		// 형식지정 printf/ 근데 줄바꿈없으니 \n같이 써주기
		// %s : String 들어올 자리
		// %d : decimal(십진수) 정수 들어올 자리
		// %05d : 두번째 자리에 자릿수를 쓰면 앞에 0채워서 자릿수 5자리 맞추기
		// %f : float 실수 들어올 자리
		// %.3f : 자릿수 지정해서 실수 들어올자리 반올림해서 소숫점 셋째자리까지
		// %b : boolean
		
		System.out.printf("-제품명 : %s-\n", productName);
		System.out.printf("-가격 : %d-\n", productPrice );
		System.out.printf("-가격 : %05d-\n", productPrice );
		System.out.printf("-무게 : %f-\n", productWeight );
		System.out.printf("-무게 : %.3f-\n", productWeight );
		
		double pct = 56.7;
		System.out.printf("-%.2f-\n", pct);
		System.out.printf("-%.2f%%-\n", pct);
		// %도 \처럼 특수문자로 JAVA에서 쓰이므로, %출력 원하면 %%써야함

		System.out.printf("%s[%d원] - %fgram", productName, productPrice, productWeight);
							
		a.close();
		
	
		
	}

}
