package interfaceTest;

/* 1) ��� �ʵ常 ����
 * 2) �߻� �޼ҵ常 ����
 * 
 */


public interface AdderInterface {

	public static final int X = 100;
	// x; only public, static & final are permitted
	
	
	//Abstract methods do not specify a body
	void method1();
	
	//JAVA 1.8����
	//static �޼ҵ�� default �޼ҵ� ���� �� ����
	
	static void method2() {}
	
	default void method3() {}
	
	
}
