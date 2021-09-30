package array;

public class ArrayTest3 {
	public static void main(String[] args) {

		String fruit[] = {"사과","귤","배","토마토","오렌지"};
		
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i]+"\t");	
		
		}
		
		//향상된 for문
		for(String f:fruit) {}
		
	}
}
