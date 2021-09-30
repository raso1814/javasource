package test;

public class LoopTest2 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		sum = 0;

		for (int i = 0; i <=100 ; i++) {
			
			sum = sum+i;
			
		}
		
		System.out.println(sum);
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println("2 * "+ i + " = " +(2*i));
			System.out.printf("2 * %d = %d\n", i, (2*i));
	
		
		}
		
		for (int i = 2; i < 10; i+=2) {
			System.out.printf("2 * %d = %d\t", i, (2*i));
		}
		
		
		
		
	}

}
