package inheritance;

public class SubListString extends ListString {

	String name = "성춘향";
	
	public void list() {
		super.list(); //부모의 list를 호출
		System.out.println(name + " 하위클래스");
	}
	
	public void writer() {
		//부모가 가지고 있는 이름 출력
		System.out.println(super.name);
				
		super.list();
	}
	
}
