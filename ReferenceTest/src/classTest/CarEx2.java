package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 첫번째 차
		// 객체 생성 시 생성자 자동 호출됨
		Car2 car1 = new Car2();
		// 기본 속성값은 null(String), 0(int), false(boolean), 0.0(double)
		

//		car1.company = "현대";
		// car1.model = "KONA";
		// car1.color = "red";
		// car1.maxSpeed = 200;

		car1.forward();

		// 두번째 차
		// 객체 생성 시 생성자 자동 호출됨
		// Car2 car2 = new Car2();
		Car2 car2 = new Car2("kona");
		// model만 값이 들어가고 나머지는 기본속성값
		
		
		// 세번째 차
		Car2 car3 = new Car2("kona", "black");

		//네번째 차
		Car2 car4 = new Car2("kona", "black", "현대", 250);
		
		// car2.company = "현대";
		// car2.model = "산타페";
		// car2.color = "black";
		// car2.maxSpeed = 250;

		car2.forward();

	}

}
