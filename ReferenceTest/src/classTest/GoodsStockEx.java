package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ù��° ��ǰ ������
		GoodsStock goods1 = new GoodsStock();
		goods1.goods = "p12345";
		goods1.stock =100;
		 
		//��ǰ�Ǹ� ->�����
		//�޼ҵ�ȣ�� -> ���ϰ��� �ִٸ� ���ϰ��� �ޱ�(syso, ����)
		//System.out.println(goods1.decrease(50));
		//int stockNum = goods1.decrease(50);
		//System.out.println(stockNum);
		goods1.decrease(50);
		//���ϰ��� ���� �޴� ����	: ���� stockNum�� ��� ���	
		
		
		//��ǰ ->�������
		//�޼ҵ� ȣ�� -> ����Ÿ���� ������ ȣ�⸸ �ϸ� ��
		//void�� syso�� �ȵǰ� ������ ������
		goods1.increase(5); // ȣ�⸸ ����
		//System.out.println(goods1.increase(5)); �Ұ�
		
		System.out.println(goods1.stock);
		
	}

}
