package string;

public class StringBuilderTest2 {

	public static void main(String[] args) {

		String str1 = "Hello java!!!";

		// String ���·� �ΰ� �Ųٷ� ���

//		char[] chArr = new char[str1.length()];
//
//		for (int i = 0; i < chArr.length; i++) {
//			chArr[i] = str1.charAt(i);
//		}
		
		char[] chArr = str1.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		
				
		// StringBuilder �Ųٷ� ���
				
		StringBuilder sb = new StringBuilder(str1);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(str1);

	}

}
