import java.util.Scanner;
//alt ��/�� �������� ���� �������� ����
//error : �ڹ� ������ �ȸ����� 
//warning : �ҽ��� �������ϸ�
//exception : ������ x/y �� y=0������
//consoleâ : java�� cmd(���������Ʈ) ���� ���


public class ConsoleInputMain {
	public static void main(String[] args) {
		
		
		//Ű���� �Է¹��� �غ��ؼ� k�� ������
		Scanner k = new Scanner(System.in);
		
		//�Ĵ� �̸� �Է¹ޱ�
		System.out.print("�Ĵ� �̸� : ");
		//consoleâ �Ĵ� �̸� �Է��� �� ���� ������ �ȵ�
		
		//�ֿܼ� �Է��� ������ name�� ����
		String name = k.next(); // String�� next()�� ����
		
		System.out.print("�Ĵ� ũ�� : ");
		double size = k.nextDouble(); // �׿ܴ� next�ڷ���
		
		System.out.print("�Ĵ� ���̺� �� : ");
		int tableNumber = k.nextInt();                                                                                                                                                                                                                                                               
		
		System.out.print("�Ĵ� �������� : ");
		boolean isOpen = k.nextBoolean();		

		System.out.println("****************");
		System.out.println(" �Ĵ� �̸� : " + name);
		System.out.println(" �Ĵ� ũ�� : " + size);
		System.out.println(" �Ĵ� ���̺� �� : " + tableNumber);
		System.out.println(" �Ĵ� �������� : " + isOpen);
		System.out.println("****************");
		
		k.close();
		//����� ���������
		
	}
}
