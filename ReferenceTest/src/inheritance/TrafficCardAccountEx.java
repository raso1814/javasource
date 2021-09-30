package inheritance;

public class TrafficCardAccountEx {

	public static void main(String[] args) {
	
		
		TrafficCardAccount traffic = new TrafficCardAccount
				("122-14", 10000, "홍길동", "3333-44", true);
		
		System.out.println(traffic.payTrafficCard("3333-44", 1800));
		

	}

}

//상속 오버라이딩(overriding) : 조상 클래스로부터 상속받은 메소드의 내용을 변경

