package interfaceTest;

public interface PlayingCard {

	int SPADE = 4;
	// �⺻�� public static final�̶� ���� ����, abstract methodó��

	final int DIAMOND = 3;

	static int HEART = 2;

	public abstract String getCardNumber();

	String getCardKind(); // public abstract ��������

}
