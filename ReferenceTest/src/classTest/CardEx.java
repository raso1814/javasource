package classTest;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card1 = new Card("spade",7);
		cardPrint(card1);
	

		//card1.width =8;말고 static한 방법으로
		//Card.width = 8;
		//Card.height = 4;

		Card card2 = new Card("heart",2);
		cardPrint(card2);

	}
	static void cardPrint(Card card){
		//main안의 card1을 모르니까 입력값을 넣어야함
		System.out.println("숫자 : "+card.getNumber());
		System.out.println("모양 : "+card.getKind());
		System.out.printf("카드크기(%d, %d)\n",card.width,card.height);
		System.out.println();
	}
}
