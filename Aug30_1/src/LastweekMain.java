import java.util.Scanner;
// 논리결합연산자 
//2개짜리 : 중단되는 버전
//    && = 더 확률 낮은거를 앞으로 배치
//    || = 더 확률 높은거를 앞으로 배치
//1개짜리 : 끝까지 가는 버전
//xor(eXclusive OR) ^ 둘중 한개만 참일때 boolean

public class LastweekMain {
	public static void main(String[] args) {
	
	Scanner a = new Scanner(System.in);
	
	System.out.print("가로 : ");
	int width = a.nextInt();
	
	System.out.print("세로 : ");
	int length = a.nextInt();
	
	System.out.print("높이 : ");
	int height = a.nextInt();
			
	System.out.print("무게 : ");
	int weight = a.nextInt();
	
	System.out.println("----------------");
	
	System.out.println("부피 : " + (width * length * height));
	System.out.println("무게 : " + weight);
	
	int b = width * length * height;
	System.out.printf("부피 : %d\n", b);
	System.out.printf("무게 : %d\n", weight);
	
	// decimal :%d / float : %f
	
	// 부피가 10이상이고, 무게가 1000이상이면 
	boolean c = (b >= 10) & (weight >= 1000);
	System.out.println(c);
	System.out.printf("부피가 10cm이상이고 무게가 1000kg 이상입니까? %b\n", c);
	//효율적인 작업 : 	boolean c = (weight >= 1000) && (b >= 10);
	
	boolean d = (b < 10) | (weight < 1000);
	System.out.println(d);
	System.out.printf("부피가 10cm미만이거나 무게가 1000kg 미만입니까? %b\n", d);
	//효율적인 작업 : boolean d = (weight < 1000) || (b < 10); 
	
	boolean e = (b >= 20) & (weight >= 30);
	System.out.println(e);
	System.out.printf("부피가 20cm이상이고 무게가 30kg 이상입니까? %b\n", e);
	//효율적입 작업 : boolean e = (weight >= 20);
	
	boolean f = !(b >= 20) & (weight >= 30);
	System.out.println(f);
	
	//부피가 10미만 이든지, 무게가 1000미만이든지
	boolean g = (weight <1000) ^ (b < 10);
	System.out.println(g);
	}
}
