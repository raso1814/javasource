package classTest;

public class Car {
	
	// �Ӽ� : ����ȸ��, �𵨸�, ����, �ִ�ӵ�...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//Car(){} -> �⺻������(default)
	//Ŭ���� ���� ����� �����ڰ� �ϳ��� ������ 
	//�����Ϸ��� �ڵ����� �⺻ �����ڸ� �������
	

	// ���� : �����ϴ�, �����ϴ�
	void forward(){
		System.out.println("�����ϴ�");
	}
	
	void backward() {
		System.out.println("�����ϴ�");
	}
}
