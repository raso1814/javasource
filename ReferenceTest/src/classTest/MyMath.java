package classTest;

public class MyMath {
	//��� ���� long ���� 2��
	//�޼ҵ� : add, subtract, multiply, divide
	//     : �Է°� ����, ��ȯ���� ������ 
	
	
	long a, b;
	
	long add(){
		return a+b;			
	}
	
	long subtract() {
		return a-b;
	} 
	
	long multiply() {
		return a*b;
	}
	
	double divide() {
		return a/b;
	}
	
	
	
	
	static long add(long a, long b){
		//Cannot make a static reference to the non-static field a
		//�� ���� ������� a,b�� �� �� �����Ƿ� ���� �Է¹���
		//�޼ҵ� �ȿ����� ���ư��� ���� �������� local variables
		return a+b;			
	}
	
	static long subtract(long a, long b) {
		return a-b;
	} 
	
	static long multiply(long a, long b) {
		return a*b;
	}
	
	static double divide(double a, double b) {
		return a/b;
	}
	
}
