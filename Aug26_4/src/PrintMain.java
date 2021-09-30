//버전 1.8.0-302
//1 : major
//8.0-302 : minor 
//뒷자리 바뀔수록 조금 바뀐것
// major 버전이 바뀜 : 다른 프로그램
// java 2 되면 완전 바뀌므로 개발언어 외울 필요없다
// 외우지 마시길 -> 다만 하도 작업해대서 외움을 당하시면 좋다

public class PrintMain {
	//모든 코드는 이 영역에
	public static void main(String[] args) {
		// 여기 쓴것만 실행
		System.out.print("에어콘 리모콘이 어디 있을텐데 ");
		//콘솔에 출력
		System.out.println("좀 찾아보시죠 종용씨");
		//콘솔에 출력하고 나서 줄바꾸기 까지 포함된 것	
		System.out.printf("%.1f", 45.123);
		//f는 formating 형식을 지정하면서 콘솔창에 출력
		System.out.println();
		System.out.println("버스");
		System.out.println("1250원"); // \1250원?
		/*출력할 때 쓰는 특수문자 \n 은 줄바꾸기 원으로 못씀 
		역슬래쉬는 JAVA에서 함부로 쓸 수 없음*/
		// \n : new line 줄만바꿈
		// \r : carrage return 커서 맨앞으로
		// 결론 \r\n 완성된 줄바꿈
		System.out.println("ㅋ\nㅎ"); // 
		System.out.println("ㅋㅋㅋ\nㅎㅎㅎ"); // 
		System.out.println("ㅋㅋㅋ\rㅎㅎㅎ"); //
		System.out.println("ㅋ\tㅎ"); //
		System.out.println("집\t: 분당"); //
		System.out.println("직업\t: 강사"); //
		System.out.println("ㅋㅋㅋ\b"); //
		/*ㅋㅋㅋ
		      ㅎㅎㅎ
		  ㅎㅎㅎㅋㅋㅋ   */ //콘솔창에선 \n만 써도 되지만...
		// \t : tab 단순 띄어쓰기 몇번이 아니라 정해진 포인트로 가는것
		// \b : backspace(1byte 지우기) 한글자는 2byte라 필요없음
		// 진짜 역슬래쉬 쓰고 싶다면 를 두번 써라 경로표시, 원 등
		System.out.println("\\1250"); // \1250원?
		System.out.println("\""); // "
		// ""를 한 덩어리로 인식하므로 "만 출력하려면 \"써야햠
		}
}
