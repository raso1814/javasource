package exam;

public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 44032;
		char charValue = (char)intValue;
		//char charValue = intValue; -> Type mismatch
		System.out.println(charValue);
		
		double d = 3.14;
		intValue = (int)d;
		// 큰거->작은거 X
		System.out.println(intValue);

		
		
	}

}
