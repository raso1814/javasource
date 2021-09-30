package homework;

public abstract class Product {
	
	
	String pname;
	int price;
	
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
	
	void printDetail(){
				
		System.out.println("��ǰ�� : "+pname);
		System.out.println("���� : "+price);
		printExtra();
		
	}
	
	abstract void printExtra();
	
	public String getPname() {
		return pname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
