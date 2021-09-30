package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		// Child 객체 생성 2가지
		
		// 1)super(); -> Object 생성자 호출
		// 2)this.age =age
		// 3)super(age); -> Parent 생성자 호출
		// 4)Child 객체 생성
		
		
		Child child = new Child(25);
		System.out.println("child age "+child.getAge());
		child.play();
				
		Parent parent = new Child(26);
		System.out.println("child age "+parent.getAge());
		// parent.play(); 못부름
		
		
		child.print();
		parent.print();
		// parent가 override된 자식클래스의 print는 부름?
		// 오버라이딩의 조건 : 
		// 1. 이름이 같아야 한다.
		// 2. 매개변수가 같아야 한다.
		// 3. 반환타입이 같아야 한다. 
		
		// 오버로딩 VS 오버라이딩
		// 오버로딩 : 새로운 메소드 정의(같은 이름으로 매개변수만 다르게)
		// 오버라이딩 : 상속받은 메소드의 내용을 변경하는 것 
	}

}
