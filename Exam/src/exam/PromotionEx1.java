package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1byte = 8��Ʈ = 2��8�� = 256 (0-255)-> -128-127
		//int 4byte = 2�� 32��
		
		byte byteValue =10;
		
		//�ڵ�����ȯ(Promotion)
		int intValue = byteValue;
		System.out.println(intValue);
		
		intValue=500;
		long longValue=intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2;
		
		System.out.println(charValue3);
		
		//��������ȯ(casting)
		System.out.println((char)charValue3);
		
	}

}
