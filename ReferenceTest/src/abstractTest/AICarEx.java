package abstractTest;

public class AICarEx {

	public static void main(String[] args) {

		AICar ai = new AICar("Black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//Car car = new Car();
		//Cannot instantiate the type Car
		//추상클래스는 객체 생성 불가
		Car car = new AICar("white");
		car.start();
		car.drive();
		car.stop();
		
		
		
		
	}

}
