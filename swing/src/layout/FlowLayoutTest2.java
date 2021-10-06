package layout;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest2 extends JFrame{

	
	public FlowLayoutTest2() {
		setTitle("BorderLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//�⺻ ���̾ƿ� getContentPane() = BorderLayout
		//���̾ƿ� ����
		//���� �������� contentPane��������
		Container container = getContentPane();
		//contentPane�� ���ο� ���̾ƿ� ����
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		JButton btn1 = new JButton("��ư");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton("��ư");
		add(btn2,BorderLayout.SOUTH);
		
		JButton btn3 = new JButton("��ư");
		add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("��ư");
		add(btn4,BorderLayout.NORTH);
		
		JButton btn5 = new JButton("��ư");
		add(btn5,BorderLayout.CENTER);
		
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		FlowLayoutTest2 f = new FlowLayoutTest2();

	}

}
