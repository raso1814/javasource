package classTest;

public class GoodsStock2 {

	// 속성 : 상품코드(p12345), 재고수량(100)
	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음),
	// 재고수량 감소(입력값 수량, 출력값은 현재 재고수량)

	private String goods;
	private int stock;

	// 기본생성자
	GoodsStock2() {
	}

	// 생성자 오버로딩
	// this = 내꺼
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

	
	//현재 재고수량을 리턴하는 기능
	int getStockNum() {
		return stock;
	}
	
}
