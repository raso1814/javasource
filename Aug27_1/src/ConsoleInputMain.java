import java.util.Scanner;
//alt 왼/오 이전파일 열기 다음파일 열기
//error : 자바 문법에 안맞으면 
//warning : 소스가 지저분하면
//exception : 연산자 x/y 중 y=0넣으면
//console창 : java와 cmd(명령프롬프트) 간의 통신


public class ConsoleInputMain {
	public static void main(String[] args) {
		
		
		//키보드 입력받을 준비해서 k에 저장함
		Scanner k = new Scanner(System.in);
		
		//식당 이름 입력받기
		System.out.print("식당 이름 : ");
		//console창 식당 이름 입력할 때 띄어쓰기 있으면 안됨
		
		//콘솔에 입력한 정보를 name에 저장
		String name = k.next(); // String은 next()로 가능
		
		System.out.print("식당 크기 : ");
		double size = k.nextDouble(); // 그외는 next자료형
		
		System.out.print("식당 테이블 수 : ");
		int tableNumber = k.nextInt();                                                                                                                                                                                                                                                               
		
		System.out.print("식당 영업여부 : ");
		boolean isOpen = k.nextBoolean();		

		System.out.println("****************");
		System.out.println(" 식당 이름 : " + name);
		System.out.println(" 식당 크기 : " + size);
		System.out.println(" 식당 테이블 수 : " + tableNumber);
		System.out.println(" 식당 영업여부 : " + isOpen);
		System.out.println("****************");
		
		k.close();
		//통신을 끊어줘야함
		
	}
}
