package classTest;

public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data();
		System.out.println("data: "+data); //classtest.Data@
		
		
		//x�� �� 10���� ����
		data.x = 10;
		change(data.x);//data ��ü ���� ��������� ������ ��(10)�� ����
		System.out.println("after change() x = " + data.x);
		
		System.out.println();
		
		change(data);
		System.out.println("after change() x = " + data.x);
		
		
	}

	static void change (int i) {
		System.out.println(i);
		i = 10000;
		System.out.println("change() x = "+ i);
		//�޼ҵ�(�⺻Ÿ��) -> ���� ����
	}
	
	static void change (Data d) {
		System.out.println(d);
		d.x = 10000;
		System.out.println("change() x = "+ d.x);
		//�޼ҵ�(����Ÿ��) -> �ּ� ����
	    // ���� ���� �޼ҵ尡 ������ ��ü�� ������ �� �ֵ��� ������ִ� ���
	}
	
	
	
}
