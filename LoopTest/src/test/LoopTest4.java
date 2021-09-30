package test;

public class LoopTest4 {

	public static void main(String[] args) {
		
		//이중 for 실행순서
		// ① int i=0;
		// ② i<3
		// 안쪽 for 문의 int j=0;
		// j<3 
		// System.out.print("*"); *
		// j++ => j=1
		// j<3;
		// System.out.print("*"); **
		// j++ => j=2
		// j<3;
		// System.out.print("*"); ***
		// j++ => j=3		
		// j<3; => 안쪽 for문 종료
		// System.out.println(""); 엔터
		// i++ => int i=1;
		
		
		
		for(int i=0; i<4; i++)
		{for(int j=0; j<3; j++) {
			System.out.print("*"); //j 0열 1열 2열
		}
			System.out.println(""); // i 1행 2행 3행
		}

		
		for(int i=1; i<=5; i++)
		{for(int j=1; j<=i; j++) {
			System.out.print("*"); //j 0열 1열 2열
		}
			System.out.println(""); // i 1행 2행 3행
		}
		
		
		for (int i = 1; i <= 100; i++) {
if (i%3==0) { if(i%9 !=0) {System.out.printf(i+"\t");}
	

}			

		}
		System.out.println("");
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%9 !=0) { 
				sum = sum+i;
											
			}		
			
					}
		System.out.println("3의 배수이고 9의 배수는 아닌 합"+sum);
		
		sum =0;
		for (int i = 1; i <=100; i++) {
			if (i%3==0 || i%5==0) {
				sum = sum+i;
							
			}
			
		}
		System.out.println(sum);
		
		
		
	}
	
	

}
