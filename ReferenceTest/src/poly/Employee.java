package poly;

public class Employee {

	private String name;
	private String position;
	
	public void work() {
		System.out.println(name+" "+position+"���� ���Ѵ�");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	
	
}
