package classTest;

public class TriangleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 길이가 서로 다른 삼각형 5개를 가지고 있다.

		Triangle2 triArr[] = new Triangle2[5];

		triArr[0] = new Triangle2(1, 2);
		triArr[1] = new Triangle2(5, 10);
		triArr[2] = new Triangle2(6, 4);
		triArr[3] = new Triangle2(5, 6);
		triArr[4] = new Triangle2(8, 5);

		printTriArr(triArr);
		System.out.println();

		for (int i = 0; i < triArr.length; i++) {
			Triangle2 triangle = triArr[i];
		 
			printTriArr(triangle);
		
		}

		System.out.println();

		
		
	}

	static void printTriArr(Triangle2 triArr[]) {
		for (int i = 0; i < triArr.length; i++) {
			System.out.println(triArr[i].getArea());

		}

	}

	static void printTriArr(Triangle2 triangle) {
		System.out.println(triangle.getArea());

	}

}
