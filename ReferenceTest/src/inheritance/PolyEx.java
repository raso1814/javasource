package inheritance;

public class PolyEx {
	
	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();
		
		p2.field1="";
		p2.method1();
		p2.method2(); //오버라이딩 된 상태라면 자식 클래스의 메소드가 실행
		
		//method3
		
		Child3 c = (Child3) p2;
		
		c.method3();
		
		Parent2 obj = new Parent2(); //new Child3()이 아니라 new Parent2()
		
		//Child3 c2 = (Child3) obj; // java.lang.ClassCastException:
		//c2.method3();
		
		
	}

}
