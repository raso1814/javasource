package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {

		String text = "ȫ�浿/������/�ڹμ�/�̼�ȫ";
		
		String[] names = text.split("/");
		for (String s : names) {
			System.out.println(s);
			
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		
		String text1 = "ȫ�浿 ������ �ڿ��� �̼�ȫ";
		names = text1.split(" ");
		for (String s : names) {
			System.out.println(s);
		}
		
	}

}
