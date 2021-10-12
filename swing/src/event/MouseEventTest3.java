package event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseEventTest3 extends JFrame {

	private JLabel label;

	public MouseEventTest3() {

		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		label = new JLabel("HELLO");
		label.setSize(40,10);
		label.setLocation(100, 100);
		add(label);

		Container contentPane = getContentPane();
		contentPane.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				label.setLocation(e.getX(), e.getY());
			}

		});

		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseEventTest3();

	}

}
