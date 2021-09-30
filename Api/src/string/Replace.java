package string;

//String -> Immutable 불변

public class Replace {

	public static void main(String[] args) {
		
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
		//자바 ->JAVA
		
		str1.replace("자바", "JAVA");
		System.out.println(str1);
		//이렇게 하면 바뀌지 않는다
		
		//str1=str1.replace("자바", "JAVA");
		
		str1= str1.replaceFirst("자바", "JAVA");
		System.out.println(str1);
		//String의 경우 변경 및 수정하는 경우, 다시 담아줘야 한다

	}

}
