package inheritance;

public class BallPen extends SharpPencil {

	private String color;

	public BallPen(int amount, String color) {
		super(amount);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
