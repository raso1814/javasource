package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		//왼쪽에 타입 지정하면 오른쪽은 생략가능
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");
		
		System.out.println(list);
		
		list.add(2, "oracle");
		System.out.println(list);
		
		//삭제
		list.remove(1);
		System.out.println(list);
		
		//list.remove("java");
		//System.out.println(list);
		
		//정렬
		list.sort(Comparator.reverseOrder()); //내림차순
		System.out.println(list);
		
		
	}

}
