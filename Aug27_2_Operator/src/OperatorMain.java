import java.util.Scanner;

// = 대입연산자, 우항에 있는 거 좌항에 넣어라
//   모든 연산자 중 가장 늦게 발동 

// 산술연산자
// 		+  :       String + ? -> 붙여서 String으로  
// 		-
// 		*
// 		/  : int/int -> 나눠서 int로 계산함 
// 		%  : 나눈 후 나머지
// 결합형 연산자(대입연산자+산술연산자) += -= *= /= %= 
// 증감 연산자 ++ --

public class OperatorMain {
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = number.nextInt();
		
		System.out.print("y : ");
		int y = number.nextInt();
		
		System.out.printf("x는 %d, y는 %d\n",x,y);
		
		String laugh = "ㅋ";
		String e = laugh + x;
		System.out.println(e);

		int a = x + y;
		
		int b = x - y;
		int c = x * y;
		double d = x / y;
		// =는 가장 마지막에 발동함 x/y가 먼저 계산되고 둘다 int라 이미 2.0이 됨
		// 둘중 하나라도 실수형이어야 int/double 등 double 필요
		// 나누기때는 하나를 double로 형변환 하면됨
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//나누기 소숫점? 
		
		String f = "차는 " + b;
		System.out.println(f);
		
		double g = x/(double)y;
		System.out.println(g);
		
		int h = x % y;
		System.out.println(h);
		
		System.out.println("--------------");
		x = x+5;
		x += 5;
		System.out.println(x);
		// =이 가장 마지막에 발동하므로 넣은 값에 5 더해진게 넣어짐
		
		//y = y-3;
		y -= 3;
		System.out.println(y);
		
		x *= 4;
		System.out.println(x);
		
		y /= 2;
		System.out.println(y);
		
		x %= 4;
		System.out.println(x);
		
		
		x++;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		number.close();
		
	}
}
