package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
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
	
	private JButton left, middle, right;
	
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("Disable middle button");
		left.setActionCommand("disable");
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		left.setMnemonic('D');
		left.addActionListener(this);
		contentPane.add(left);
		
		middle = new JButton("Middle Button");
		middle.setActionCommand("middle");
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		middle.setMnemonic('M');
		middle.addActionListener(this);
		contentPane.add(middle);
		
		right = new JButton("Enable middle Button");
		right.setActionCommand("enable");
		right.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		right.setMnemonic('E');
		right.addActionListener(this);
		contentPane.add(right);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//disable 버튼 클릭이 되면 
		//middle 버튼 비활성화
		//disable 버튼 비활성화 // enable 버튼 활성화
		String cmd = e.getActionCommand();
		
		if(cmd.equals("disable")) {
			middle.setEnabled(false);
			left.setEnabled(false);
			right.setEnabled(true);
		} else {
			
			//enable 버튼 클릭 -> middle, disable 활성화, enable 비활성화
			right.setEnabled(false);
			middle.setEnabled(true);
			left.setEnabled(true);
		}
		
	}

}
