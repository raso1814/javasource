package classTest;

public class GoodsStock {

	//�Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	//��� : ������ ����(�Է°� ����, ��°��� ����), 
	//      ������ ����(�Է°� ����, ��°��� ���� ������)
	
	String goods;
	int stock;
	
	void increase(int num) {stock+=num;}
	int decrease(int num) {
		if(stock>num) {stock-=num;}
		return stock;
	}
	
	
	
}
