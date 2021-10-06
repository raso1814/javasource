package layout;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest1 extends JFrame{

	
	public FlowLayoutTest1() {
		setTitle("BorderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//기본 레이아웃 getContentPane() = BorderLayout
		//레이아웃 변경
		//현재 프레임의 contentPane가져오기
		//Container container = getContentPane();
		//contentPane에 새로운 레이아웃 설정
		//container.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(); //기본레이아웃 FlayLayout
		//panel.setLayout(mgr);
		setContentPane(panel);
		
		JButton btn1 = new JButton("버튼");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton("버튼");
		add(btn2,BorderLayout.SOUTH);
		
		JButton btn3 = new JButton("버튼");
		add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("버튼");
		add(btn4,BorderLayout.NORTH);
		
		JButton btn5 = new JButton("버튼");
		add(btn5,BorderLayout.CENTER);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		FlowLayoutTest1 f = new FlowLayoutTest1();

	}

}
