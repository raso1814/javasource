package collection;

import java.util.Set;
import java.util.TreeSet;
//HashSet���� ���� ���� / �׿ܴ� Set�� Ư¡(�ߺ��ȴ���, ������ ���X)

public class SetEx4 {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();

		while (set.size() < 6) {
			int lotto = (int) (Math.random() * 45) + 1;
			set.add(lotto);

		}
		System.out.println(set);
		
		

	}

}
