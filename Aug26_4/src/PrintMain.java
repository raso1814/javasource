//���� 1.8.0-302
//1 : major
//8.0-302 : minor 
//���ڸ� �ٲ���� ���� �ٲ��
// major ������ �ٲ� : �ٸ� ���α׷�
// java 2 �Ǹ� ���� �ٲ�Ƿ� ���߾�� �ܿ� �ʿ����
// �ܿ��� ���ñ� -> �ٸ� �ϵ� �۾��ش뼭 �ܿ��� ���Ͻø� ����

public class PrintMain {
	//��� �ڵ�� �� ������
	public static void main(String[] args) {
		// ���� ���͸� ����
		System.out.print("������ �������� ��� �����ٵ� ");
		//�ֿܼ� ���
		System.out.println("�� ã�ƺ����� ���뾾");
		//�ֿܼ� ����ϰ� ���� �ٹٲٱ� ���� ���Ե� ��	
		System.out.printf("%.1f", 45.123);
		//f�� formating ������ �����ϸ鼭 �ܼ�â�� ���
		System.out.println();
		System.out.println("����");
		System.out.println("1250��"); // \1250��?
		/*����� �� ���� Ư������ \n �� �ٹٲٱ� ������ ���� 
		���������� JAVA���� �Ժη� �� �� ����*/
		// \n : new line �ٸ��ٲ�
		// \r : carrage return Ŀ�� �Ǿ�����
		// ��� \r\n �ϼ��� �ٹٲ�
		System.out.println("��\n��"); // 
		System.out.println("������\n������"); // 
		System.out.println("������\r������"); //
		System.out.println("��\t��"); //
		System.out.println("��\t: �д�"); //
		System.out.println("����\t: ����"); //
		System.out.println("������\b"); //
		/*������
		      ������
		  ������������   */ //�ܼ�â���� \n�� �ᵵ ������...
		// \t : tab �ܼ� ���� ����� �ƴ϶� ������ ����Ʈ�� ���°�
		// \b : backspace(1byte �����) �ѱ��ڴ� 2byte�� �ʿ����
		// ��¥ �������� ���� �ʹٸ� �� �ι� ��� ���ǥ��, �� ��
		System.out.println("\\1250"); // \1250��?
		System.out.println("\""); // "
		// ""�� �� ����� �ν��ϹǷ� "�� ����Ϸ��� \"����t
		}
}
