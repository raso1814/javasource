package classTest;

public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data();
		System.out.println("data: "+data); //classtest.Data@
		
		
		//x의 값 10으로 지정
		data.x = 10;
		change(data.x);//data 객체 안의 멤버변수가 가지는 값(10)을 보냄
		System.out.println("after change() x = " + data.x);
		
		System.out.println();
		
		change(data);
		System.out.println("after change() x = " + data.x);
		
		
	}

	static void change (int i) {
		System.out.println(i);
		i = 10000;
		System.out.println("change() x = "+ i);
		//메소드(기본타입) -> 값의 복사
	}
	
	static void change (Data d) {
		System.out.println(d);
		d.x = 10000;
		System.out.println("change() x = "+ d.x);
		//메소드(참조타입) -> 주소 복사
	    // 여러 개의 메소드가 동일한 객체를 참조할 수 있도록 만들어주는 방법
	}
	
	
	
}
