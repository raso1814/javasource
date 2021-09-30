package classTest;

public class TVEx {

	public static void main(String[] args) {
		// main이 있어야 화면 출력이 가능

		// 클래스 -> 컴파일 -> 실행
		// TV.java -> TV.class

		// new : 생성의 의미 -> 객체 선언, 생성
		// TV tv = new TV();
		// System.out.println(tv); //classTest.TV@1175e2db

		// 객체 조작
		// tv.power = true; //on
		// tv.channel = 2;

		// tv.channelUp(); //메소드 호출

		// System.out.printf("채널 상태 : %d\n", tv.channel);

		// TV 객체를 3개 생성하고 싶다

		/*
		 * TV tv1 = new TV(); 
		 * TV tv2 = new TV(); 
		 * TV tv3 = new TV();
		 */

		TV tvArr[] = new TV[3];
		//int arr[] = new int[10];
		//타입명 변수명[] = new 타입명[] -> 클래스 : 참조타입
		
		tvArr[0]= new TV("빨강", true, 5);
		tvArr[1]= new TV("검정", false, 6);
		tvArr[2]= new TV("흰색", true, 2);
		
		
		printArr(tvArr);
	}
	
	static void printArr(TV tvArr[]) {
		//tvArr에 들어있는 객체의 내용을 출력
		
		for(int i=0; i<tvArr.length; i++) {
			System.out.print(tvArr[i].getColor()+"\t");
			System.out.print(tvArr[i].isPower()+"\t");
			System.out.print(tvArr[i].getChannel()+"\t");
			System.out.println();
		}
		
	}

}
