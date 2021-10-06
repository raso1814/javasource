package layout;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest1 extends JFrame{

//기본 레이아웃 = BorderLayout	
	
	public BorderLayoutTest1() {
		setTitle("BorderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		BorderLayoutTest1 f = new BorderLayoutTest1();

	}

}
