package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		// static �޼ҵ�(Ŭ���� �޼ҵ�) ȣ�� -> ��ü ���� ���� ȣ��

		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
		//static -> ��ü ���� �ʿ����, Ŭ������.�޼ҵ�()
		
		System.out.println();
		
		MyMath myMath = new MyMath();
		
		myMath.a=200L;
		myMath.b=100L;
		
		System.out.println(myMath.add());
		System.out.println(myMath.subtract());
		System.out.println(myMath.multiply());
		System.out.println(myMath.divide());
		//static X-> ��ü��.�޼ҵ�()
		
		System.out.println();
		
		MyMath2 myMath2 = new MyMath2();
		int[] arr= {1,2};
		
		System.out.println(myMath2.add(arr));
		
	
		
	}

}
