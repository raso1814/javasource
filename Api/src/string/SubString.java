package string;

public class SubString {

	public static void main(String[] args) {
		
		String ssn = "880515-1220146";
		
		//문자열 잘라내기 항상 0번부터 시작
		System.out.println(ssn.substring(7));
		System.out.println(ssn.substring(0,6));

	}

}
