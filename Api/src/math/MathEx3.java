package math;

// java.lang 패키지는 기본적으로 import가 되어있음
// (Math 클래스나 String 클래스 쓸 때 import 따로 안했음)

// 하나의 클래스에 모든 메소드가 static 메소드로 구성되어 있다면
// import static 만들어서 사용 가능 -> Math. 떼어버리고 메소드만 사용 가능

import static java.lang.Math.*;

public class MathEx3 {

	public static void main(String[] args) {

		double val = 90.7552;
		System.out.println("round() " + round(val)); // 반올림
		System.out.println("ceil() " + ceil(1.1)); // 올림
		System.out.println("floor() " + floor(1.5)); // 버림
		System.out.println("max() " + max(1.5, 1.2));
		System.out.println("min() " + min(1.5, 1.2));

	}

}
