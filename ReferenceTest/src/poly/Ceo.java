package poly;

public class Ceo extends Employee {
	
	@Override
	public void work() {
		System.out.println(super.getPosition()+"에서"+super.getName()+"이 일한다");
		
	}

}
