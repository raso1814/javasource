package test;

public class TypeTest1 {

	public static void main(String[] args) {
		// 타입 - 1) 기본타입 2) 참조타입
		// 변수의 메모리 사용되는 방식이 달라짐

	//기본타입	
	int age=25;
	double price=200.3;
	
	//참조타입
	// 정석적인 문자열 생성 : String name = new String("java")
	String name = "java";
	String name2 = new String("java");
	String hobby = "독서";
	
	System.out.println(name==name2? "동일함": "다름");	
	}
}


