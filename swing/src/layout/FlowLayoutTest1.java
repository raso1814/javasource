package layout;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest1 extends JFrame{

	
	public FlowLayoutTest1() {
		setTitle("BorderLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//�⺻ ���̾ƿ� getContentPane() = BorderLayout
		//���̾ƿ� ����
		//���� �������� contentPane��������
		//Container container = getContentPane();
		//contentPane�� ���ο� ���̾ƿ� ����
		//container.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(); //�⺻���̾ƿ� FlayLayout
		//panel.setLayout(mgr);
		setContentPane(panel);
		
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
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		FlowLayoutTest1 f = new FlowLayoutTest1();

	}

}
