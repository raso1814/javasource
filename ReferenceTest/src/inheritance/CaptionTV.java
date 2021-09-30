package inheritance;

public class CaptionTV extends TV {
	
	boolean caption; //기본값 false
	int a;
	
	void displayCaption(String text) {

		if(caption) { // caption==true 이렇게 안씀
			System.out.println(text);}
		}

}
