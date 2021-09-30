package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		// static 메소드(클래스 메소드) 호출 -> 객체 생성 없이 호출

		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
		//static -> 객체 생성 필요없음, 클래스명.메소드()
		
		System.out.println();
		
		MyMath myMath = new MyMath();
		
		myMath.a=200L;
		myMath.b=100L;
		
		System.out.println(myMath.add());
		System.out.println(myMath.subtract());
		System.out.println(myMath.multiply());
		System.out.println(myMath.divide());
		//static X-> 객체명.메소드()
		
		System.out.println();
		
		MyMath2 myMath2 = new MyMath2();
		int[] arr= {1,2};
		
		System.out.println(myMath2.add(arr));
		
	
		
	}

}
