package string;

//String -> Immutable �Һ�

public class Replace {

	public static void main(String[] args) {
		
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		
		//�ڹ� ->JAVA
		
		str1.replace("�ڹ�", "JAVA");
		System.out.println(str1);
		//�̷��� �ϸ� �ٲ��� �ʴ´�
		
		//str1=str1.replace("�ڹ�", "JAVA");
		
		str1= str1.replaceFirst("�ڹ�", "JAVA");
		System.out.println(str1);
		//String�� ��� ���� �� �����ϴ� ���, �ٽ� ������ �Ѵ�

	}

}
