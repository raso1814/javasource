package interfaceTest;

/* 1) 상수 필드만 가짐
 * 2) 추상 메소드만 가짐
 * 
 */


public interface AdderInterface {

	public static final int X = 100;
	// x; only public, static & final are permitted
	
	
	//Abstract methods do not specify a body
	void method1();
	
	//JAVA 1.8부터
	//static 메소드와 default 메소드 들어올 수 있음
	
	static void method2() {}
	
	default void method3() {}
	
	
}
