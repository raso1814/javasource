package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {

	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300, 300);

		//컴포넌트 : JButton,JCheckBox,JRadio,....
		
		//컴포넌트 부착
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
				
		setVisible(true);
	}

	public static void main(String[] args) {

		FrameTest3 f = new FrameTest3();
		
	}

}
