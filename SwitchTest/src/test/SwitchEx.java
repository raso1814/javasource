package test;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("���ڸ� �����ÿ� : ");
		int num1 = k.nextInt();
		System.out.print("���ڸ� �����ÿ� : ");
		int num2 = k.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
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
