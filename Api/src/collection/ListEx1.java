package collection;

import java.util.ArrayList;
import java.util.List;

/* �÷��� �����ӿ�ũ
 * ���� �����͵��� �����ϴ� Ŭ�������� ǥ��ȭ�� ����
 * Collection(interface) - List, Set(interface)
 * Map
 * 
 * List(�������̽�) : ������ �ִ�. �������� �ߺ� ����
 *    ����Ŭ���� : Vector, ArrayList, LinkedList, Stack...
 *    �迭�� ���� �����ε�, ����Ų ����
 *    
 *    E, T, K, V : ���� ��ü Ÿ���� ����
 *    
 *    �⺻Ÿ�� -> ��üŸ��(Wrapper Ŭ����)
 *    int -> Integer, float -> Float, double -> Double
 * 	  char -> Character, boolean -> Boolean
 * */

public class ListEx1 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		// parents obj = new child;

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// child obj = new child;
		// int�� �ȴ�� �⺻���� Ŭ�������·� �ٲ������

		// ������ �߰� add()
		list1.add("���"); // 0
		list1.add("��"); // 1
		list1.add("������"); // 2
		list1.add("����"); // 3
		list1.add("����"); // 4
		list1.add("�ٳ���"); // 5

		// ������ ��������
		for (String str : list1) {
			System.out.println(str);
		}

		System.out.println();

		System.out.println(list1); // toString() �������̵� �Ǿ�����

		System.out.println();

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println();

		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		for (Integer i : list2) {
			System.out.println(i);
		}

		System.out.println();

		// �հ� ���ϱ�

		int sum = 0;

		for (Integer i : list2) {
			sum += i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		for (int i = 0; i < list2.size(); i++) {
			sum += list2.get(i);

		}

		System.out.println(sum);
	}

}
