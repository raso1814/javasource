package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		// intŸ���� ���� 10�� ����
		// int a=1, b=2, c=3, d=4...;
		
		// �迭(����Ÿ��)
		// ����Ÿ�� : ��/null/�ڵ����� �ʱ�ȭ
		// ����
		int arr[]= new int[10];
		
		// ���� ��ҿ� ���� 0������ ����(0~9)
		System.out.println(arr[0]);
	
		arr[3]=40;
		arr[5]=58;
		
		for(int i=1; i<10; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}

}
