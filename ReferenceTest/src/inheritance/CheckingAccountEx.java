package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckingAccount checkingAccount = new CheckingAccount
				("122-12",200000,"ȫ�浿","122-12-133");
		
		System.out.println(checkingAccount.pay("322-12", 20000));
		
		System.out.println("�����ܾ� "+checkingAccount.pay("122-12-133", 20000));
		
	}

}
