package test;

public class BreakTest2 {
	// ���ڸ� 0�������� �ϳ��� ������Ű�鼭 �հ踦 ���ϱ�
	// ��, �հ谡 100�� ������ �ݺ��� ����
public static void main(String[] args) {
	
	
	int i =0; int sum =0;
	while(sum<100) {
		sum = sum+i;
		i++;
		
		
		
	}
	System.out.println(sum);
	
	
	i =0; sum =0;
	
	while(true) {
		if(sum>100) {break;}
		sum = sum+i;
		i++;
		
	}
	
	System.out.println(sum);
	
	
	
}	
}
