package string;

public class CharAt {

	public static void main(String[] args) {

		String str1 = "�ڹ� ���α׷���";

		char ch = str1.charAt(3);
		System.out.println(ch);
		
		
		//str�� '��'��� ���ڰ� �ִ��� Ȯ���ϰ� ����ִٸ�
		//�����ϰ� ����, ���ٸ� �����ϰ� ���� ����


		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)=='��') {
				flag=true;
				break;
			}
			
		}
				System.out.println(flag ? "�����ϰ� ����" : "�����ϰ� ���� ����");
		
		
		

		String str2 = "Hello java!!";

		// str2�� char �迭�� ��� �� �迭�� ���

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
