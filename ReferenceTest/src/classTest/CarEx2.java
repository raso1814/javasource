package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ù��° ��
		// ��ü ���� �� ������ �ڵ� ȣ���
		Car2 car1 = new Car2();
		// �⺻ �Ӽ����� null(String), 0(int), false(boolean), 0.0(double)
		

//		car1.company = "����";
		// car1.model = "KONA";
		// car1.color = "red";
		// car1.maxSpeed = 200;

		car1.forward();

		// �ι�° ��
		// ��ü ���� �� ������ �ڵ� ȣ���
		// Car2 car2 = new Car2();
		Car2 car2 = new Car2("kona");
		// model�� ���� ���� �������� �⺻�Ӽ���
		
		
		// ����° ��
		Car2 car3 = new Car2("kona", "black");

		//�׹�° ��
		Car2 car4 = new Car2("kona", "black", "����", 250);
		
		// car2.company = "����";
		// car2.model = "��Ÿ��";
		// car2.color = "black";
		// car2.maxSpeed = 250;

		car2.forward();

	}

}
