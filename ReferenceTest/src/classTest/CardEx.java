package classTest;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card1 = new Card("spade",7);
		cardPrint(card1);
	

		//card1.width =8;���� static�� �������
		//Card.width = 8;
		//Card.height = 4;

		Card card2 = new Card("heart",2);
		cardPrint(card2);

	}
	static void cardPrint(Card card){
		//main���� card1�� �𸣴ϱ� �Է°��� �־����
		System.out.println("���� : "+card.getNumber());
		System.out.println("��� : "+card.getKind());
		System.out.printf("ī��ũ��(%d, %d)\n",card.width,card.height);
		System.out.println();
	}
}
