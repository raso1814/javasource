package test;

public class SwitchEx2 {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default:
			System.out.println("�մ�");
			break; // ���� ����
		}

		if (grade == 'A' || grade == 'a') {
			System.out.println("���ȸ��");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ�ȸ��");
		} else {
			System.out.println("�մ�");
		}
		
			
		
		
	}

}
