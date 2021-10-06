package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCalculator extends JFrame implements ActionListener {

	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	public AddCalculator() {

		setTitle("덧셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();

		tf1 = new JTextField(10);
		panel1.add(tf1);

		JLabel lb1 = new JLabel("+");
		panel1.add(lb1);

		tf2 = new JTextField(10);
		panel1.add(tf2);

		JLabel lb2 = new JLabel("=");
		panel1.add(lb2);

		tf3 = new JTextField(10);
		panel1.add(tf3);

		add(panel1, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();

		JButton btn1 = new JButton("확인");
		btn1.addActionListener(this);
		panel2.add(btn1);

		JButton btn2 = new JButton("취소");
		btn2.addActionListener(this);
		panel2.add(btn2);

		add(panel2, BorderLayout.CENTER);

		setBounds(100, 100, 500, 150);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("확인")&& tf1 != null && tf2 != null) {
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			String result = String.valueOf(num1 + num2);
			tf3.setText(result);

		} else {
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			

		}

	}

	public static void main(String[] args) {
		new AddCalculator();
		System.out.println();

	}

}
