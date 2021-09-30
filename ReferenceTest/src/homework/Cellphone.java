package homework;

public class Cellphone extends Product {

	String carrier;

	public Cellphone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}

	@Override
	void printExtra() {
		System.out.println("Ελ½Ε»η : "+carrier);
	}

}
