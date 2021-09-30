package test;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("숫자를 누르시오 : ");
		int num1 = k.nextInt();
		System.out.print("숫자를 누르시오 : ");
		int num2 = k.nextInt();
		System.out.print("연산자를 입력하시오 : ");
		String operator = k.next();
		
		int result = 0;
		switch (operator) {
		case "+":
			//System.out.println(num1+num2);
			//System.out.printf(num1 + operator + num2 + "=" + (num1+num2));
			result = num1+num2;
			break;
		case "-":
			//System.out.println(num1-num2);
			result = num1-num2;
			break;
		case "*":
			//System.out.println(num1*num2);
			result = num1*num2;
			break;
		case "/":
			//System.out.println((double)num1/num2);
			result = num1/num2;
			break;
		case "%":
			//System.out.println(num1%num2);
			result = num1%num2;
			break;
		}
		
		System.out.printf("%d %s %d = %d", num1, operator, num2, result );
		
		
		
	}

}
