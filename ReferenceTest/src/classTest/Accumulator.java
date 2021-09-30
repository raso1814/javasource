package classTest;

public class Accumulator {

	static {
		try{Class.forName("");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	int total =0;
	static int grandTotal=0;
	void acumulate(int amount) {
		total +=amount;
		grandTotal+=amount;
	}
	
}
