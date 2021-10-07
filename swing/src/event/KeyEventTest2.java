package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//
////KeyListener
//
////KeyEvent�� �����ϴ� ������
////KeyEvent�� ��Ŀ���� ���� ������Ʈ������ �߻�
////keyPressed():Ű�� ������ ���� �߻�
////keyTyped(): ���� Ű�� �������� ���� ȣ��(��, �����ڵ��� ��츸 ȣ��)
////KeyReleased() : ����Ű�� ���� ���� ȣ��

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import event.KeyEventTest3.MyKeyAdapter;

public class KeyEventTest2 extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;

	public KeyEventTest2() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new JLabel("���ڸ� �Է��ϼ���"));

		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyAdapter());
		panel.add(textField);

		textArea = new JTextArea(3, 30);

		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);

		setTitle("Ű �̺�Ʈ");
		setSize(400, 500);
		setVisible(true);
	}

	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar(); // ���� ������ Ű ���ڰ�
		int keyCode = e.getKeyCode(); // ���� ������ Ű �ڵ尪

		// textArea.setText(t);
		String modifiers = "Alt : " + e.isAltDown() + " Ctrl : " + e.isControlDown() + " Shift : " + e.isShiftDown();
		textArea.append(str + " ���� : " + keyChar + "(�ڵ� : " + keyCode + ") " + modifiers + "\n");
	}

	public static void main(String[] args) {

		new KeyEventTest2();

	}

	class MyKeyAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "KeyPressed : ");
		}

	}

}
