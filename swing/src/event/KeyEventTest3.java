package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {

	private JLabel lb1 = new JLabel("HELLO");

	public KeyEventTest3() {
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);

		// ���̺� ��ġ
		lb1.setLocation(50, 50);
		lb1.setSize(100, 20);
		add(lb1);

		// ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyAdapter());
		contentPane.setFocusable(true);
		// Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();

		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new KeyEventTest3();
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			// ��,��,��,�� Ű�� ���缭 ���ڸ� �̵�
			// ��� Ű�� ���������� Ȯ��
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_UP:
				lb1.setLocation(lb1.getX(), lb1.getY() - 10);
				break;
			case KeyEvent.VK_DOWN:
				lb1.setLocation(lb1.getX(), lb1.getY() + 10);
				break;
			case KeyEvent.VK_LEFT:
				lb1.setLocation(lb1.getX() - 10, lb1.getY());
				break;
			case KeyEvent.VK_RIGHT:
				lb1.setLocation(lb1.getX() + 10, lb1.getY());
				break;

			default:
				break;
			}

		}
	}

}
