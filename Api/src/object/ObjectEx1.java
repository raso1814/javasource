package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
						
		System.out.println(obj1.equals(obj2));
		//�ּ� �������� ���� ��
		//equals(�ּҺ�) -> false
		
		//toString -> ��ü�� ���ڿ��� ǥ��
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
		
		//String ����ϴ� equals�� �������̵� ����
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1.equals(str2));
		
		//String ����ϴ� toString�� �������̵� ���� -> ��ü�� ���� ��
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1);
		System.out.println(str2);
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
