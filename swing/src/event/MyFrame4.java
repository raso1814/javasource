package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener {

	Container container;
	
	public MyFrame4() {
		setTitle("������ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������� ���̾ƿ� ����
		container = getContentPane();
		container.setLayout(new FlowLayout());

		// ��ư 2�� ����
		// �ؽ�Ʈ ���,����
		JButton btn1 = new JButton("���");
		add(btn1);
		btn1.addActionListener(this);
	

		JButton btn2 = new JButton("����");
		add(btn2);
		btn2.addActionListener(this);

		setBounds(200, 100, 300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("���")) { // ������ ������ ��������� ����
		container.setBackground(Color.YELLOW);
			
		} else { //���� ����
			container.setBackground(Color.RED);
		}


	}

	public static void main(String[] args) {
		new MyFrame4();
	}

}
