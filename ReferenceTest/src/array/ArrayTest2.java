package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// int 타입의 변수 10개 선언
		// 담으려고하는 타입 배열명 [] = new 담으려고 하는 타입 [갯수]
		
		// 배열의 선언과 생성(힙)
		// 개별요소에 접근 0번부터 시작(0-9)
		// 참조타입 처음에 null
		int scores[]= new int[10];
				
				
		int arr[]; //선언 
		arr=new int[4]; //생성
		
		//배열의 선언과 생성 및 초기화
		int arr2[]= {35,95,65,75,25,33};
		System.out.println(arr2.length);
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}

		for(int i :arr2) {
			System.out.println(arr2[i]+" ");

		}
		
		int hobby[] = new int[10];
		
		
	}

}
