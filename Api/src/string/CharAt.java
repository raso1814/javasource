package string;

public class CharAt {

	public static void main(String[] args) {

		String str1 = "자바 프로그래밍";

		char ch = str1.charAt(3);
		System.out.println(ch);
		
		
		//str에 '그'라는 문자가 있는지 확인하고 들어있다면
		//포함하고 있음, 없다면 포함하고 있지 않음


		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)=='그') {
				flag=true;
				break;
			}
			
		}
				System.out.println(flag ? "포함하고 있음" : "포함하고 있지 않음");
		
		
		

		String str2 = "Hello java!!";

		// str2를 char 배열에 담고 그 배열을 출력

		char[] chArr = new char[str2.length()];

		for (int i = 0; i < chArr.length; i++) {

			chArr[i] = str2.charAt(i);
			System.out.print(chArr[i]);

		}

		for (char c : chArr) {
			System.out.printf("%c ", c);
		}
		
		
	

	}

}
