package shop;

// �����߻�ȭ -> ����ʵ�, �߻�޼��常 ����
// jdk8 -> default, static ���� �� �ֱ�� ��


public interface Ishop {

	void setTitle(String title); // public abstract �κ� ������
	
	void genUser();
	
	void genProduct();
	
	void start();
	
}
