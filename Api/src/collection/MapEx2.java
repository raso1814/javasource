package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		// ��� �߰�
		map.put("id_0123", "ȫ�浿");
		map.put("id_0124", "��浿");
		map.put("id_0125", "�۱浿");
		map.put("id_0126", "�ֱ浿");

		// ��������
		Set<String> keys = map.keySet();

		// List, Set, Map �� ����� �����͵��� ǥ��ȭ�� ������� ������ �� �ֵ��� ����
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			// System.out.println(iter.next());

			String userId = iter.next();
			String value = map.get(userId);
			System.out.println(userId + " : " + value);
		}

		System.out.println();

		// Map.Entry ��ü ���
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iter2 = entrySet.iterator();


		while (iter2.hasNext()) {

			Entry<String, String> entry = iter2.next();
							
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}

}
