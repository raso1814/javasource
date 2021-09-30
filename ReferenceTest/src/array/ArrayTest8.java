package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// 카드 45장 
		
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
	   
	   //카드섞기
	   for(int i=0; i<card.length;i++) {
		   //바꿀 위치 선정
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
