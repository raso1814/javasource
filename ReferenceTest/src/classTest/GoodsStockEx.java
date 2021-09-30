package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//첫번째 상품 재고관리
		GoodsStock goods1 = new GoodsStock();
		goods1.goods = "p12345";
		goods1.stock =100;
		 
		//상품판매 ->재고감소
		//메소드호출 -> 리턴값이 있다면 리턴값을 받기(syso, 변수)
		//System.out.println(goods1.decrease(50));
		//int stockNum = goods1.decrease(50);
		//System.out.println(stockNum);
		goods1.decrease(50);
		//리턴값을 따로 받는 이유	: 이후 stockNum을 계속 사용	
		
		
		//반품 ->재고증가
		//메소드 호출 -> 리턴타입이 없으면 호출만 하면 됨
		//void면 syso도 안되고 변수도 못받음
		goods1.increase(5); // 호출만 가능
		//System.out.println(goods1.increase(5)); 불가
		
		System.out.println(goods1.stock);
		
	}

}
