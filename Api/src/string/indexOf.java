package string;

public class indexOf {

	public static void main(String[] args) {

		String str1 = "�ڹ� ���α׷���";

		// �Ű������� �־��� ���ڿ��� ���۵Ǵ� ��ġ�� ����, ù��° ��ġ
		int index = str1.indexOf("���α׷���");
		System.out.println(index);

		System.out.println("��ã�� ��� " + str1.indexOf("���̽�"));
		
		
		System.out.println();

		String str2 = "HelloHelloHello World";

		System.out.println(str2.indexOf(65)); // A��� ���� ã��
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el", 2));
		
		System.out.println(str2.lastIndexOf("l"));

		// �װ� ����ִ��� Ȯ��

		if (str1.indexOf('��') != -1) {
			System.out.println("�����ϰ� ����");
		} else {
			System.out.println("�����ϰ� ���� ����");
		}
		
		
		System.out.println(str1.indexOf('��') > -1? "�����ϰ� ����" : "�����ϰ� ���� ����");

	}

}
