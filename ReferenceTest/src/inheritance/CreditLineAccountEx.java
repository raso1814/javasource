package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
	
		CreditLineAccount credit = new CreditLineAccount
				("122-12", 10000, "ȫ�浿", 1000000);
		
		//System.out.println(credit.withdraw(1500000));
		System.out.println(credit.getBalance());
		System.out.println(credit.withdraw(800000));
	}

}
