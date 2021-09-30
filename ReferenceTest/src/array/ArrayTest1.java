package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		// int타입의 변수 10개 생성
		// int a=1, b=2, c=3, d=4...;
		
		// 배열(참조타입)
		// 참조타입 : 힙/null/자동으로 초기화
		// 정수
		int arr[]= new int[10];
		
		// 개별 요소에 접근 0번부터 시작(0~9)
		System.out.println(arr[0]);
	
		arr[3]=40;
		arr[5]=58;
		
		for(int i=1; i<10; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}

}
