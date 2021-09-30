package inheritance;

public class CaptionTV2 extends TV2 {
	


	boolean caption; //기본값 false
	
	public CaptionTV2(String color, boolean power, int channel) {
		super(color, power, channel);
		// TODO Auto-generated constructor stub
	}
	
	void displayCaption(String text) {

		if(caption) { // caption==true 이렇게 안씀
			System.out.println(text);}
		}

}
