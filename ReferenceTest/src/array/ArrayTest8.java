package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// ī�� 45�� 
		
	   int card[] = new int[45];
		
	   for(int i : card) {
		   card[i] = i+1;
	   }
	   
	   for(int i =0; i<card.length; i++) {
		   card[i] = i+1;
	   }	
	   

	   for(int i : card) {
		   System.out.print(i+" ");
	   }
	   
	   //ī�弯��
	   for(int i=0; i<card.length;i++) {
		   //�ٲ� ��ġ ����
		   int pos = (int)(Math.random()*45);
		   int temp = card[i];
		   card[i] = card[pos];
		   card[pos] = temp;
			  
		      }
	   
	   System.out.println();
	   
	   for(int i:card)
	   {System.out.print(i+" ");}
	   
	}

}
