package classTest;

//�޼ҵ� �����ε�

//�޼ҵ� �̸��� ���ƾ� �Ѵ�.
//�Ű� ������ ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.

public class MyMath2 {
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, long b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int add(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	
}
