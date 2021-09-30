package test;

public class BreakTest2 {
	// 숫자를 0에서부터 하나씩 증가시키면서 합계를 구하기
	// 단, 합계가 100이 넘으면 반복문 종료
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
