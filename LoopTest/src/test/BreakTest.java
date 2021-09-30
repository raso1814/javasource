package test;
//break; 반복문 실행 중지

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while (true) {
			//주사위를 돌려서 6이 나오면 반복문 종료
	
		int num = (int)(Math.random()*6+1);
		System.out.println(num);
		
		
		if (num==6) {break;
			
			}
					
		}
		
	}

}
