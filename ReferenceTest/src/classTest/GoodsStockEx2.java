package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ù��° ��ǰ ������
		GoodsStock2 goods1 = new GoodsStock2("p12345", 100);
		
		//Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�
		//private -> GoodsStock2.code is not visible
		//goods1.goods = "p12345";
		//goods1.stock = 100;

		
		
		

		goods1.increase(5); // ȣ�⸸ ����
		// System.out.println(goods1.increase(5)); �Ұ�
 
		goods1.decrease(50);
		System.out.println(goods1.getStockNum());

	}

}
