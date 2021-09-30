import java.util.Scanner;

// << >> <<<(shift연산)
// 다중선택문제에서 사용

// 정렬
//     왼쪽 : 1
//     가운데 : 2
//     오른쪽 : 3

//특성
//      이탤릭 : 1 << 0
//       굵게 : 1 << 1
//       밑줄 : 1 << 2
//특성 = (1<<0) + (1<<1) = 이탤릭+굵게

// 24시간 = 1 << 0 : 1
// 주차 = 1 << 1 : 2
// 흡연실 = 1 << 2 : 4
// 와이파이 = 1 << 3 :8

// A특성 = 1 -> 24시간
// B특성 = 2 -> 주차
// C특성 = 8 -> 와이파이
// D특성 = 3 -> 1+2 -> 24시간+주차
// E특성 = 6 ->2 +4 -> 주차+흡연실

//대부분 2항연산
//     a>2
//     1+2

// 1항(단항)연산
//       !d


public class OperatorMain3 {
	public static void main(String[] args) {
		int a = 32 >> 2;
		System.out.println(a);
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		//20살 이상이면 안녕하세요, 아니면 나가
		// 3항연산
		//       조건식 ? O때값 : X때값
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		//나이가 짝수면 짝, 홀수면 홀
		String oe = (age%2 == 0) ? "짝" : "홀";
		System.out.println(oe);
		
		//이름이 홍길동이면 어...야, 아니면 어서오세요
		String say2 = (name.equals("홍길동"))? "어...야," : "어서오세요";
		System.out.println(say2);
		//연산자(==)라는 것들은 stack영역이 대상인데 String은 heap에 있고 stack엔 #2
		// .equals()써야 heap 안에 있는게 검색 / 홍길동 heap #2가 stack?

		
		
	
	
	
	}
}
