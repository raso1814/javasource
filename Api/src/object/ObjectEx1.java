package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
						
		System.out.println(obj1.equals(obj2));
		//주소 동일한지 묻는 것
		//equals(주소비교) -> false
		
		//toString -> 객체를 문자열로 표현
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
		
		//String 사용하는 equals는 오버라이딩 적용
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));
		
		//String 사용하는 toString을 오버라이딩 적용 -> 객체가 가진 값
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1);
		System.out.println(str2);
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
