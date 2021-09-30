package poly;

public class Manager extends Employee {
	
	@Override
	public void work() {
		System.out.println(super.getPosition()+"¿¡¼­"+super.getName()+"");
		
	}

}
