import java.util.Scanner;

//논리연산자
//   >     >=     ==     !=     <=     <
// (초과)  (이상)  (같다)  (다르다)  (이하)  (미만)

//논리결합연산자
//   &&      ||        !
// 고(and)  거나(or)   반대(not)
// 논리결합연산자 한개만 써도 됨
// 차이가 뭐냐? &&두개는 조건들 순서대로 보면서 초반에 조건 불일치 하면 바로끝내는거
// &한개는 조건 끝까지 쭉 가보는거. 작업량은 &&이 효율적임
// && 쓸 때, 확률 낮은 걸(X,불일치) 앞으로 보내면 작업 초반에 멈추므로 작업량 줄어들음
// || 쓸 때, 확률 높은 걸(O,일치) 앞으로 보내면 작업 초반에 멈추므로 작업량 줄어들음

public class OperatorMain2 {
	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = a.nextDouble();
		
		System.out.print("나이 : ");
		int age = a.nextInt();
		
		System.out.println("--------------");
		
		System.out.printf("키 %.1fcm, 나이 %d살\n", height, age);
		
		//키가 150 넘나
		boolean b = (height > 150);
		System.out.printf("키가 150cm가 넘나요? %b\n", b);
		
		boolean c = (age <= 10);
		System.out.printf("나이가 10살 이하인가요? %b\n", c);
		
		System.out.println("--------------");
		
		boolean d = (age >= 5) && (height >= 200);
		System.out.printf("나이가 5살 이상이고 키가 200cm 이상인가요? %b\n", d);		
		//"나이가 5살 이상이고 키가 200cm 이상인가요? b%\n", d
		
		boolean e = (height >= 200) || (age >= 5);
		System.out.printf("키가 200cm 이상이거나 나이가 5살 이상인가요? %b\n", e);
			
		// d가 true면 e는 false
		// d가 false면 e는 true
		boolean f = !e;
		System.out.println(f);
				
		a.close();
	}
}
