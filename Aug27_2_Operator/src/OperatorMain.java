import java.util.Scanner;

// = ���Կ�����, ���׿� �ִ� �� ���׿� �־��
//   ��� ������ �� ���� �ʰ� �ߵ� 

// ���������
// 		+  :       String + ? -> �ٿ��� String����  
// 		-
// 		*
// 		/  : int/int -> ������ int�� ����� 
// 		%  : ���� �� ������
// ������ ������(���Կ�����+���������) += -= *= /= %= 
// ���� ������ ++ --

public class OperatorMain {
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = number.nextInt();
		
		System.out.print("y : ");
		int y = number.nextInt();
		
		System.out.printf("x�� %d, y�� %d\n",x,y);
		
		String laugh = "��";
		String e = laugh + x;
		System.out.println(e);

		int a = x + y;
		
		int b = x - y;
		int c = x * y;
		double d = x / y;
		// =�� ���� �������� �ߵ��� x/y�� ���� ���ǰ� �Ѵ� int�� �̹� 2.0�� ��
		// ���� �ϳ��� �Ǽ����̾�� int/double �� double �ʿ�
		// �����⶧�� �ϳ��� double�� ����ȯ �ϸ��
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//������ �Ҽ���? 
		
		String f = "���� " + b;
		System.out.println(f);
		
		double g = x/(double)y;
		System.out.println(g);
		
		int h = x % y;
		System.out.println(h);
		
		System.out.println("--------------");
		x = x+5;
		x += 5;
		System.out.println(x);
		// =�� ���� �������� �ߵ��ϹǷ� ���� ���� 5 �������� �־���
		
		//y = y-3;
		y -= 3;
		System.out.println(y);
		
		x *= 4;
		System.out.println(x);
		
		y /= 2;
		System.out.println(y);
		
		x %= 4;
		System.out.println(x);
		
		
		x++;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		number.close();
		
	}
}
