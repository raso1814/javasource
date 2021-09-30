package classTest;

public class Card {
//멤버변수
	//객체 생성해야 
	private String kind; // 카드모양 지정
	private int number; // 카드 숫자 지정

//	int width=10;
//	int height=7;

	// static(정적) : 클래스에 고정된 멤버
	// 객체를 생성하지 않고 사용
	// 클래스가 메모리에 로드될 때 생성

	//클래스변수
	static int width = 10; // 고정
	static int height = 7;

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}


	public String getKind() {
		return kind;
	}

	//static(정적) 메소드 : 객체를 생성하지 않고 사용
	//클래스가 메모리에 로드될 때 생성		
	//static 메소드 안에서 인스턴스 멤버 사용 불가
	
	public int getNumber() {
		return number;
	}

	public static int getWidth() {
		//kind = "";    ->X
		//getNumber();  ->X
		// getHeight(); ->O
		return width;
	}

	public static int getHeight() {
		return height;
	}

	
	
}
