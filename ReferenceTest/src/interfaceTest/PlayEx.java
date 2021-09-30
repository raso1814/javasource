package interfaceTest;

public class PlayEx {

	public static void main(String[] args) {

		//Cannot instantiate the type PlayingCard
		//abstract 클래스 처럼 객체 생성 불가
		//PlayingCard card = new PlayingCard();
		
		PlayingCard card = new Playing();
		card.getCardKind();
		
		
	}

}
