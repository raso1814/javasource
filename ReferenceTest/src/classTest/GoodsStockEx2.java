package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 첫번째 상품 재고관리
		GoodsStock2 goods1 = new GoodsStock2("p12345", 100);
		
		//클래스 외부에서 속성을 직접 변경하는 것은 안됨
		//private -> GoodsStock2.code is not visible
		//goods1.goods = "p12345";
		//goods1.stock = 100;

		
		
		

		goods1.increase(5); // 호출만 가능
		// System.out.println(goods1.increase(5)); 불가
 
		goods1.decrease(50);
		System.out.println(goods1.getStockNum());

	}

}
