package classTest;

public class TVEx {

	public static void main(String[] args) {
		// main�� �־�� ȭ�� ����� ����

		// Ŭ���� -> ������ -> ����
		// TV.java -> TV.class

		// new : ������ �ǹ� -> ��ü ����, ����
		// TV tv = new TV();
		// System.out.println(tv); //classTest.TV@1175e2db

		// ��ü ����
		// tv.power = true; //on
		// tv.channel = 2;

		// tv.channelUp(); //�޼ҵ� ȣ��

		// System.out.printf("ä�� ���� : %d\n", tv.channel);

		// TV ��ü�� 3�� �����ϰ� �ʹ�

		/*
		 * TV tv1 = new TV(); 
		 * TV tv2 = new TV(); 
		 * TV tv3 = new TV();
		 */

		TV tvArr[] = new TV[3];
		//int arr[] = new int[10];
		//Ÿ�Ը� ������[] = new Ÿ�Ը�[] -> Ŭ���� : ����Ÿ��
		
		tvArr[0]= new TV("����", true, 5);
		tvArr[1]= new TV("����", false, 6);
		tvArr[2]= new TV("���", true, 2);
		
		
		printArr(tvArr);
	}
	
	static void printArr(TV tvArr[]) {
		//tvArr�� ����ִ� ��ü�� ������ ���
		
		for(int i=0; i<tvArr.length; i++) {
			System.out.print(tvArr[i].getColor()+"\t");
			System.out.print(tvArr[i].isPower()+"\t");
			System.out.print(tvArr[i].getChannel()+"\t");
			System.out.println();
		}
		
	}

}
