package inheritance;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine f;
		Ambulance a;
		
		//f=a; ��Ӱ��谡 �ƴ� Ŭ���� ���� ����ȯ �Ұ�
		
		f = new FireEngine();
		Car car = f; // parents ��Ӱ���� ����ȯ ���� ��ĳ����(����ȯ ��������)
		// Car car = new FireEngine();
		
		
		FireEngine f2;
		f2 = (FireEngine) car; // �ٿ�ĳ����(����ȯ ���� �Ұ�)
		
		
		
		
		
	}

}
