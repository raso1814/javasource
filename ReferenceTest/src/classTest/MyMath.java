package classTest;

public class MyMath {
	//멤버 변수 long 변수 2개
	//메소드 : add, subtract, multiply, divide
	//     : 입력값 없음, 반환값은 연산결과 
	
	
	long a, b;
	
	long add(){
		return a+b;			
	}
	
	long subtract() {
		return a-b;
	} 
	
	long multiply() {
		return a*b;
	}
	
	double divide() {
		return a/b;
	}
	
	
	
	
	static long add(long a, long b){
		//Cannot make a static reference to the non-static field a
		//맨 위의 멤버변수 a,b를 쓸 수 없으므로 새로 입력받음
		//메소드 안에서만 돌아가는 변수 지역변수 local variables
		return a+b;			
	}
	
	static long subtract(long a, long b) {
		return a-b;
	} 
	
	static long multiply(long a, long b) {
		return a*b;
	}
	
	static double divide(double a, double b) {
		return a/b;
	}
	
}
