package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {

		int arr3[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

		//58 숫자가 몇번째에 있는지 조회
		//순차검색
		for (int i = 0; i < arr3.length; i++) {

			if (arr3[i] == 58) {
				System.out.printf("58은 %d번째에 위치합니다.\n", i + 1);
				break;

			}

		}
		
		System.out.println(); 
		
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos+1 + "번째 찾았음");
		
		// binarySearch : 이진검색(정렬을 먼저 한 후)
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		int pos2 = Arrays.binarySearch(arr3, 58);
		System.out.println(pos2+1 + "번째 찾았음");

	}

}
