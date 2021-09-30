package math;

// java.lang ��Ű���� �⺻������ import�� �Ǿ�����
// (Math Ŭ������ String Ŭ���� �� �� import ���� ������)

// �ϳ��� Ŭ������ ��� �޼ҵ尡 static �޼ҵ�� �����Ǿ� �ִٸ�
// import static ���� ��� ���� -> Math. ��������� �޼ҵ常 ��� ����

import static java.lang.Math.*;

public class MathEx3 {

	public static void main(String[] args) {

		double val = 90.7552;
		System.out.println("round() " + round(val)); // �ݿø�
		System.out.println("ceil() " + ceil(1.1)); // �ø�
		System.out.println("floor() " + floor(1.5)); // ����
		System.out.println("max() " + max(1.5, 1.2));
		System.out.println("min() " + min(1.5, 1.2));

	}

}
