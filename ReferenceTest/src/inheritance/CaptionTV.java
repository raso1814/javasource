package inheritance;

public class CaptionTV extends TV {
	
	boolean caption; //�⺻�� false
	int a;
	
	void displayCaption(String text) {

		if(caption) { // caption==true �̷��� �Ⱦ�
			System.out.println(text);}
		}

}
