package shop;

public class ShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//�����̸� ����
		shop.setTitle("JAVA Shop");
		
		//�� ����
		shop.genUser();
		
		//��ǰ ����
		shop.genProduct();
		
		shop.start();
		
		shop.productList();
		
		
	}

}
