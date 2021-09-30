package interfaceTest;

public interface PlayingCard {

	int SPADE = 4;
	// 기본이 public static final이라 생략 가능, abstract method처럼

	final int DIAMOND = 3;

	static int HEART = 2;

	public abstract String getCardNumber();

	String getCardKind(); // public abstract 생략가능

}
