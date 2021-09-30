package homework;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	
	}
	
	
	void printProperty() {
		System.out.printf("%d인치 %d컬러\n", getSize(), color);
	};

}
