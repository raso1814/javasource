package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1byte = 8비트 = 2의8승 = 256 (0-255)-> -128-127
		//int 4byte = 2의 32승
		
		byte byteValue =10;
		
		//자동형변환(Promotion)
		int intValue = byteValue;
		System.out.println(intValue);
		
		intValue=500;
		long longValue=intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2;
		
		System.out.println(charValue3);
		
		//강제형변환(casting)
		System.out.println((char)charValue3);
		
	}

}
