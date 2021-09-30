package collection;

import java.util.Set;
import java.util.TreeSet;
//HashSet과의 차이 정렬 / 그외는 Set의 특징(중복안담음, 순차적 담기X)

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
