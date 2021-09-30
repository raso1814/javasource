package inheritance;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine f;
		Ambulance a;
		
		//f=a; 상속관계가 아닌 클래스 간의 형변환 불가
		
		f = new FireEngine();
		Car car = f; // parents 상속관계는 형변환 가능 업캐스팅(형변환 생략가능)
		// Car car = new FireEngine();
		
		
		FireEngine f2;
		f2 = (FireEngine) car; // 다운캐스팅(형변환 생략 불가)
		
		
		
		
		
	}

}
