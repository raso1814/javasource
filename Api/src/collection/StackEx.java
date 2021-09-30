package collection;

import java.util.Stack;

//Stack : LIFO(Last in First Out) / push and pop
//		: ���İ��, ���İ�ȣ �˻�, Undo, Redo, �������� �ڷ�/������


public class StackEx {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// ������ ����
		stack.push("���");
		stack.push("����");
		stack.push("�ٳ���");
		stack.push("��");

		// ������ ��������
		System.out.println(stack);

		System.out.println();

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

	}

}
