package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Button extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button frame = new Button();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Disable middle button");
		btnNewButton.setIcon(new ImageIcon(Button.class.getResource("/component/left.gif")));
		btnNewButton.setMnemonic('D');
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Middle Button");
		btnNewButton_1.setIcon(new ImageIcon(Button.class.getResource("/component/middle.gif")));
		btnNewButton_1.setMnemonic('M');
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Enable middle Button");
		btnNewButton_2.setIcon(new ImageIcon(Button.class.getResource("/component/right.gif")));
		btnNewButton_2.setMnemonic('E');
		contentPane.add(btnNewButton_2);
		
		pack();
	}

}
