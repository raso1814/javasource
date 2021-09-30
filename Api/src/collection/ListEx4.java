package collection;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * - ���������� �߰�/���� �� ArrayList�� �� �� ���� -> size ũ�� ��� �� �߿�
 * - �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ����
 * 
 * */


public class ListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();
		
		list.add("���"); 
		list.add("��"); 
		list.add("������"); 
		list.add("����"); 
		list.add("����"); 
		list.add("�ٳ���"); 
		
		for (String string : list) {
			System.out.println(string);
		}

		
	}

}
