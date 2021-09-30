package classTest;

public class Card {
//�������
	//��ü �����ؾ� 
	private String kind; // ī���� ����
	private int number; // ī�� ���� ����

//	int width=10;
//	int height=7;

	// static(����) : Ŭ������ ������ ���
	// ��ü�� �������� �ʰ� ���
	// Ŭ������ �޸𸮿� �ε�� �� ����

	//Ŭ��������
	static int width = 10; // ����
	static int height = 7;

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}


	public String getKind() {
		return kind;
	}

	//static(����) �޼ҵ� : ��ü�� �������� �ʰ� ���
	//Ŭ������ �޸𸮿� �ε�� �� ����		
	//static �޼ҵ� �ȿ��� �ν��Ͻ� ��� ��� �Ұ�
	
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
