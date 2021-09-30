package shop;

public class ShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//惑痢捞抚 瘤沥
		shop.setTitle("JAVA Shop");
		
		//绊按 积己
		shop.genUser();
		
		//力前 积己
		shop.genProduct();
		
		shop.start();
		
		shop.productList();
		
		
	}

}
