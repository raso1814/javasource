package classTest;

public class Numbers {

	private int num[];
	
	public Numbers(int num[]) {
		this.num = num;
	}
	
	
	int plus() {
	
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			}
	
		return sum;
		} 
	
	
	double avg() {
	
		return (double)plus()/(num.length);
	
	
	}
	
	
	
	
}
