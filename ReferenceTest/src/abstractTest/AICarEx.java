package abstractTest;

public class AICarEx {

	public static void main(String[] args) {

		AICar ai = new AICar("Black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//Car car = new Car();
		//Cannot instantiate the type Car
		//�߻�Ŭ������ ��ü ���� �Ұ�
		Car car = new AICar("white");
		car.start();
		car.drive();
		car.stop();
		
		
		
		
	}

}
