package classTest;

public class GoodsStock2 {

	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	// ��� : ������ ����(�Է°� ����, ��°��� ����),
	// ������ ����(�Է°� ����, ��°��� ���� ������)

	private String goods;
	private int stock;

	// �⺻������
	GoodsStock2() {
	}

	// ������ �����ε�
	// this = ����
	GoodsStock2(String a, int b) {
		goods = a;
		stock = b;
	}

	void increase(int num) {
		stock += num;
	}

	int decrease(int num) {
		if (stock > num) {
			stock -= num;
		}
		return stock;
	}

	
	//���� �������� �����ϴ� ���
	int getStockNum() {
		return stock;
	}
	
}
