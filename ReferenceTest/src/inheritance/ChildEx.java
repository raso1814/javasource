package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		// Child ��ü ���� 2����
		
		// 1)super(); -> Object ������ ȣ��
		// 2)this.age =age
		// 3)super(age); -> Parent ������ ȣ��
		// 4)Child ��ü ����
		
		
		Child child = new Child(25);
		System.out.println("child age "+child.getAge());
		child.play();
				
		Parent parent = new Child(26);
		System.out.println("child age "+parent.getAge());
		// parent.play(); ���θ�
		
		
		child.print();
		parent.print();
		// parent�� override�� �ڽ�Ŭ������ print�� �θ�?
		// �������̵��� ���� : 
		// 1. �̸��� ���ƾ� �Ѵ�.
		// 2. �Ű������� ���ƾ� �Ѵ�.
		// 3. ��ȯŸ���� ���ƾ� �Ѵ�. 
		
		// �����ε� VS �������̵�
		// �����ε� : ���ο� �޼ҵ� ����(���� �̸����� �Ű������� �ٸ���)
		// �������̵� : ��ӹ��� �޼ҵ��� ������ �����ϴ� �� 
	}

}
