package test;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =0;
		while (i<10) {
			System.out.println("�ȳ��ϼ���");
			i++; // ���ѷ����� �Ⱥ����� ����
		}
		
		i=1;
		while (i<11) {
			System.out.print(i+"\t");
			i++;
		} 
		System.out.println();
		
		
		i=2;
		while (i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
	
		System.out.println();
		
		i=3;
		while (i<100) {
			System.out.print(i+"\t");
			i+=3;
		}
		
		System.out.println();
		
		
		i=0;
		int sum =0;
		
		while (i <=100) {
			sum= i+sum;
			i++;
		}
		
		System.out.println(sum);
		
		i=1; sum=0;
		
		while (i<10) {
			System.out.printf("2 * %d = %d\n", i, 2*i);
			i++;
		}
		
		
		
		
		
		
	}

}
