package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		
		
		Set<Member> set = new HashSet<Member>();
		
		
		//hashCode() / equals() -> �Ѵ� ���ٸ� �������� ����
		set.add(new Member("hong123", "hong123", "ȫ�浿"));
		set.add(new Member("hong124", "hong123", "ȫ�浿"));
		set.add(new Member("hong125", "hong123", "ȫ�浿"));
		set.add(new Member("hong123", "hong123", "ȫ�浿"));
		
		
		for (Member member : set) {
			System.out.println(member+" "+member.hashCode());
		}

	}

}
