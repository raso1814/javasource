package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// È­¾¾¿Âµµ -> ¼·¾¾¿Âµµ 
		
		// È­¾¾¿Âµµ ÀÔ·Â¹Þ±â(Á¤¼ö)
		// ¹ÞÀº È­¾¾¿Âµµ -> ¼·¾¾¿Âµµ·Î º¯È¯ ÈÄ Ãâ·ÂÇÏ±â
		// (È­¾¾¿Âµµ-32)*5/9 
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("È­¾¾¿Âµµ : ");
		int f = k.nextInt();
		double c = (f-32)*5/9.0;
		System.out.printf("¼·¾¾¿Âµµ : %.2f", c);
		
		
		
		

	}

}
