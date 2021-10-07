package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {

	private JLabel lb1 = new JLabel("HELLO");

	public KeyEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 현재 설정된 레이아웃 없애기
		setLayout(null);

		// 레이블 배치
		lb1.setLocation(50, 50);
		lb1.setSize(100, 20);
		add(lb1);

		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyAdapter());
		contentPane.setFocusable(true);
		// 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();

		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new KeyEventTest3();
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			// 상,하,좌,우 키에 맞춰서 글자를 이동
			// 어느 키가 눌러졌는지 확인
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
