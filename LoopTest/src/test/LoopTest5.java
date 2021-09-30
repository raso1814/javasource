package test;

public class LoopTest5 {

	public static void main(String[] args) {

		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d\t", i, j, i*j);
				
			}
			
			System.out.println();
		}

		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
						}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = 1; i <=5; i++) {
		
				System.out.print(" ");
					if(i==5) {System.out.println("*");}
		}
		
		for (int i = 1; i <=5; i++) {
			
			if(i<4) {System.out.print(" ");}
				if(i>=4) {System.out.print("*");}
	}
		
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(j<=5-i){System.out.print(" ");}
				if(j>5-i){System.out.print("*");}
			}
		System.out.println();
		}
		
		
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <= 5; j++) {
				
				if(j<i) {System.out.print(" ");}
				else {System.out.print("*");}
			}
			
			System.out.println();
		}
		
		
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(j<i?" ":"*");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
