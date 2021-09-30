package inheritance;

public class FountainPen extends BallPen {

	
	public FountainPen(int amount, String color) {
		super(amount, color);
		
	}

	public void refill(int n) {setAmount(n);}
	
	
}
