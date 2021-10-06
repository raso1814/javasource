package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest1 extends JFrame {

	public GridLayoutTest1() {
		
		setTitle("GridLayout Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(3,4,5,5));
		
		for (int i = 0; i < 10; i++) {
			JButton btn = new JButton(i + "");
			add(btn);
		}
		
		
		setSize(500, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		GridLayoutTest1 f = new GridLayoutTest1();

	}

}
