package test;

public class LoopTest4 {

	public static void main(String[] args) {
		
		//���� for �������
		// �� int i=0;
		// �� i<3
		// ���� for ���� int j=0;
		// j<3 
		// System.out.print("*"); *
		// j++ => j=1
		// j<3;
		// System.out.print("*"); **
		// j++ => j=2
		// j<3;
		// System.out.print("*"); ***
		// j++ => j=3		
		// j<3; => ���� for�� ����
		// System.out.println(""); ����
		// i++ => int i=1;
		
		
		
		for(int i=0; i<4; i++)
		{for(int j=0; j<3; j++) {
			System.out.print("*"); //j 0�� 1�� 2��
		}
			System.out.println(""); // i 1�� 2�� 3��
		}

		
		for(int i=1; i<=5; i++)
		{for(int j=1; j<=i; j++) {
			System.out.print("*"); //j 0�� 1�� 2��
		}
			System.out.println(""); // i 1�� 2�� 3��
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
		System.out.println("3�� ����̰� 9�� ����� �ƴ� ��"+sum);
		
		sum =0;
		for (int i = 1; i <=100; i++) {
			if (i%3==0 || i%5==0) {
				sum = sum+i;
							
			}
			
		}
		System.out.println(sum);
		
		
		
	}
	
	

}
