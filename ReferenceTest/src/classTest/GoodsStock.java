package classTest;

public class GoodsStock {

	//속성 : 상품코드(p12345), 재고수량(100)
	//기능 : 재고수량 증가(입력값 수량, 출력값은 없음), 
	//      재고수량 감소(입력값 수량, 출력값은 현재 재고수량)
	
	String goods;
	int stock;
	
	void increase(int num) {stock+=num;}
	int decrease(int num) {
		if(stock>num) {stock-=num;}
		return stock;
	}
	
	
	
}
