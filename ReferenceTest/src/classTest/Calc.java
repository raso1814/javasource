package classTest;
//���� Ŭ���� ���� �ٸ� �޼ҵ� ȣ��
//�ٸ� Ŭ������ �޼ҵ� ȣ�� : ��ü ���� �� �޼ҵ� ȣ��
// Number number = new Number(); number.xxx();


public class Calc {
	//����
	int plus(int x, int y) {
		return x + y;
		//ȣ���� ������ �̰��� ������ ���ư�
	}

	//���
	double avg(int x, int y) {
		//return x+y/2.0;
		//return plus(x,y)/2.0;
		
		int sum = plus(x,y);
		return sum/2.0;
		
	}
	
	void execute( ) {
		double result = avg(7,10);
		println("������ "+ result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
}
