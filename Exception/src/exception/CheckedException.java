package exception;

//Exception(���ܻ���)
//CheckedException : complie�� ��Ÿ���� ����
//UnCheckedException : runŸ�� �� ��Ÿ���� ����


public class CheckedException {

	public static void main(String[] args)  {
		//ClassNotFoundException
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
