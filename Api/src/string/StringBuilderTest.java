package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
//		String data = "ABC";
//		data += "DEF";
		// 뒤에 추가만 하고 싶어도, 기존 문자열 제거한 후 새롭게 문자열 생성
		// -> StringBuffer, StringBuilder 개선
		
		//멀티스레드 지원
		StringBuffer buffer = new StringBuffer();
		
		//단일스레드 지원
		StringBuilder builder = new StringBuilder();
		
		//추가
		System.out.println(builder);
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//삽입
		builder.insert(3, 34);
		System.out.println(builder);
		
		//String 안에는 추가, 삽입 메소드가 없다
		
		System.out.println();
		
		//삭제
		builder.delete(1, 3);
		System.out.println(builder);
		
		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append(3.14);
		builder1.deleteCharAt(1);
		System.out.println(builder1);
		System.out.println(str1);
		
		//String 작업하다가 StringBuilder갖고 와서 작업하고 다시 String에 담아준다
		
		
	}

}
