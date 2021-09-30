package classTest;
//같은 클래스 내에 다른 메소드 호출
//다른 클래스의 메소드 호출 : 객체 생성 후 메소드 호출
// Number number = new Number(); number.xxx();


public class Calc {
	//덧셈
	int plus(int x, int y) {
		return x + y;
		//호출한 곳으로 이값을 가지고 돌아가
	}

	//평균
	double avg(int x, int y) {
		//return x+y/2.0;
		//return plus(x,y)/2.0;
		
		int sum = plus(x,y);
		return sum/2.0;
		
	}
	
	void execute( ) {
		double result = avg(7,10);
		println("실행결과 "+ result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
}
