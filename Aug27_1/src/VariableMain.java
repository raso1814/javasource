
//CPU - 연산장치 -> 컴퓨터는 계산, 좋으면 빠름 속도 쿼드코어 등 코어는 동시 계산  
//RAM - 저장장치 -> 좋으면 많이 저장, 휘발성 메모리 (변수를 많이 만들 수 있다)
//    변수형태, 임시저장(자동삭제, 재부팅하거나)
//     static - 나중에
//     stack - 프로그램 종료시 자동 반납 -> 종료안됐으면 계속 쓰는 거 / 수동 반납 불가능
//     heap - 자동 반납되지 않음 -> 개발자가 수동으로 반납처리해야
//     자료형 변수는 stack에 쌓이고 참조형변수는 heap에 쌓임 
// 자료형 변수는 해당 byte대로 차근차근 잡아먹는데 참조형변수는 번지로 지정이 됨 #7 차근차근이 아님
// stack에 1337이라는 데이터, apple이라는 데이터, but heap에 string =apple이더라도 #7만 저장
// JAVA, Python에는 GarbageCollection 기능이 있어서 괜찮음
//             heap영역 자동정리 시스템 - 언제?

//*물리적으로 나눠진 게 아니라 윈도우가 이렇게 나눠서 씀
// 램 4GB - 3.9GB 남았음 다썼으면 그 공간 반납해야
// 메모리 정리 어플 : 프로그램 종료했는데도 자꾸 메모리 잡아먹으니까 쓰는 어플


//HDD,SSD - 저장장치 -> 좋으면 많이 저장, 비휘발성 메모리 -> eclipse는 ssd에서 실행 .java는 hdd
//    파일형태로 영구저장 -> 발전 -> DB
//GPU - 그래픽 표현하는데 필요한(CPU+RAM+HDD)
// 1bit = 0/1
// 1byte = 8bit


// 변수(Variable)
// 데이터를 담는 그릇
// 프로그램 진행 중에 만들어진 데이터를 저장할 때 
// 어디다 저장?
// 본인이 판단하기에 XX가 필요하다면 그 때 쓰는 거

// 문법 
//     그릇종류           그릇이름;
//     어떤 데이터 저장     그릇이름;
//     자료형(data type)  변수명;
// 자료형 
//      기본형 
//         정수 - byte(1byte : -100~100), 
//				 short(2 : -6만~6만)
//				 int(4: -21억~21억)
// 				 long(8 : 큼) (그릇 크기 차이)
// 같은 프로그램이라도 RAM 적은 게 좋음 그래서 최적의 자료형을 찾아서 써야함? - 옛날 얘기
// (전)알고리즘의 시대 : 최대한 아낄 전략을 짜내는데 주력 
// (후)유지보수의 시대 : 요즘은 RAM이 워낙 크기에 프로그램 변경 유리하도록 기본이 int 
// 사람 나이 데이터 임시 저장 : byte or short - 옛날

//         실수 - float(4>1.123), double(8) (그릇 크기 차이-더 정밀한 표현) - java는 double 주력
//         한글자 - char(2 한글자가 2byte)
//         논리 - boolean(true or false)(1) 
//         없다 - void

//      참조형
//         여러글자 - String
//         기타등등... 기본형 위 이외에는 다 참조형
//         python은 참조형만 씀

//


public class VariableMain {
	public static void main(String[] args) {
		
		//byte efg = 12300; <- byte에 저거 안들어가서 short 써줘야함
		//byte a = 1; ram 16gb = 160000000000byte 중 1byte씀
		//국어점수가 80점인거를 임시로 저장할 수 있게 
		
//변수명 마음대로
		//but 숫자로 시작불가 a1은 가능 1a는 안됨
		//특수문자 불가(_ $는 괜찮음)
		//자바문법 불가 int int, int system.out ~		
		
		//에러는 아니지만 IT문화 : Aasdfe NO! 소문자로 시작, 한국어 NO! 영어로
		//뜻을 알아볼 수 있게 변수명 국어점수 aas NO! kor_score 뜻을 알기 좋게
		// -> 그런데 띄어쓰기는 못쓰니 띄어쓰기 들어갈 곳에 대문자 or _
		//korScore(낙타체) or kor_score(뱀체) 
		
		int korScore ; // 변수 만들기
		korScore = 80; // 변수에 값 저장
		
		// = 같다X 오른쪽에 있는 것을 왼쪽에 넣어라
		
		System.out.println("korScore"); //글자데이터 표현할때만 "" ""없으면 변수
		System.out.println(korScore); //korScore변수에 들어있는 값 출력
		
		korScore = 100;
		System.out.println(korScore); //korScore변수에 들어있는 값 출력
		//변수명 변경하고 싶다면 refactor rename
		
		//기온 24.38도인거를 임시로 저장할 수 있게 변수만들기 변수에 값저장 값출력
		
		double temperatures;
		temperatures = 24.85;
		System.out.println(temperatures);
		
		/*float temp;
		temp = 24.85;
		//float = double 왼쪽은 float고 안맞아서 오른쪽은 double이라 안들어감 
		System.out.println(temp);*/
		
		float temp;
		temp = (float) 24.38; // 형변환(casting) : (자료형)값
		System.out.println(temp);
		
		// 모든 프로그래밍 언어들은 기본자료형을 가지고 있다.
		// 달랑 123 435.64 이렇게 있고 아무 처리도 안하고 값만 있으면 뭘로 인식하는지?
		// java는 int로 double로 인식한다 C는 int와 float
		
		//ㅋ라는 글자를 임시로 저장
		
		char laugh;
		laugh = 'ㅋ'; // char에는 '', "" 쓰면 오류남
		System.out.println(laugh);
		
		String word; // 지금까지 기본형 썼다가 처음으로 참조형 8byte
		word = "ㅋㅋ"; // String에는 ""
		System.out.println(word);
		
		//컴 32bit/64bit -> 참조형 변수 사이즈 : String 64bit=8byte

		//RAM 구성
		// static / stack / heap
		// 참조형은 번지값만 저장
		
		
		//배고픈가를 임시로 저장할 수 있게
		boolean isHungry; //다른 변수명은 보통 명사이나 boolean은 이게 자연스러움
		isHungry = true; //true or false 입력
		System.out.println(isHungry);
		
		Double temp2; 
		//double이 아닌데 왜 될까? double은 기본형(stack), Double 참조형(heap)
		temp2 = 24.3123;
		System.out.println(temp2);
				
		//변수를 만들고 값을 안넣으면 변수가 안만들어질까? JAVA 한정 사용이 불가능 
		//Java에서 지역변수를 만들고 값을 안넣으면 사용이 불가능
		int age; //변수생성
		age = 28; //지역변수는 값을 넣어야 쓸 수 있음
		System.out.println(age);
		
		int age2 = 28;
		System.out.println(age2);
		//어차피 변수생성하면 값을 넣어야 하므로 그냥 한번에 변수생성 및 값넣기
		
		int age3=15;
		System.out.println(age3);	
				
		
	}

}
