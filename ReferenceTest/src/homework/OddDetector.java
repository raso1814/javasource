package homework;

public abstract class OddDetector  {
	
	int n;

	public OddDetector(int n) {
		super();
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	abstract boolean isOdd();

}
