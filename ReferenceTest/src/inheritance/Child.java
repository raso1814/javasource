package inheritance;

// extends �θ�Ŭ������
// �����ڿ� �ʱ�ȭ ���� ��ӵ��� ����
// private ��������� ������ ���ѵ�
// 

public class Child extends Parent {

//Implicit super constructor Parent() is undefined for default constructor. 
//Must define an explicit constructor	

	public Child(int age) {
		super(age); // �θ�Ŭ������ �⺻ ������ ȣ��
		
	}
	
	void play() {
		System.out.println("����!!");
	}
	
	@Override
		public void print() {
			System.out.println("Hello");
		}
	
}
