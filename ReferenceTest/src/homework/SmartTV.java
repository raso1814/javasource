package homework;

public class SmartTV extends Product {

	String resolution;
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution =resolution;
	}

	@Override
	void printExtra() {
		System.out.println("�ػ� : "+resolution);

	}

}
