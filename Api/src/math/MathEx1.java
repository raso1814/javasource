package math;

public class MathEx1 {
	//Math 클래스는 다 static 메소드이므로 객체 생성할 필요없이 클래스명.메소드 바로 쓰면 된다

	public static void main(String[] args) {

		double val = 90.7552;
		System.out.println("round() "+Math.round(val)); //반올림
		System.out.println("ceil() "+Math.ceil(1.1)); //올림
		System.out.println("floor() "+Math.floor(1.5)); //버림
		System.out.println("max() "+Math.max(1.5, 1.2));
		System.out.println("min() "+Math.min(1.5, 1.2));
		
		
		
	}

}
