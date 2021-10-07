package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {

	private JTextField textField;
	private JButton btnRock, btnScissor, btnPaper;
	
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;

	public RockScissorPaper() {

		setTitle("���������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);

		// ���� contentPane ��������
		Container contentPane = getContentPane();

		JLabel label = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(label, BorderLayout.NORTH); // add~����

		// ��� �̹��� ���
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));

		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);

		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);

		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);

		contentPane.add(panel, BorderLayout.CENTER);

		// �ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(textField, BorderLayout.SOUTH);

		pack();
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int com = (int) (Math.random() * 3);
		int user = 0;

		String cmd = e.getActionCommand();

		if (cmd.equals("rock") && com == SCISSOR) {
			textField.setText("������ ����, ��ǻ�� ���� : ������ ��");
		} else if (cmd.equals("rock") && com == ROCK) {
			textField.setText("������ ����, ��ǻ�� ���� : ���º�");
		} else if (cmd.equals("rock") && com == PAPER) {
			textField.setText("������ ����, ��ǻ�� �� : ��ǻ�� ��");
		} else if (cmd.equals("scissor") && com == SCISSOR) {
			textField.setText("������ ����, ��ǻ�� ���� : ���º�");
		} else if (cmd.equals("scissor") && com == ROCK) {
			textField.setText("������ ����, ��ǻ�� ���� : ��ǻ�� ��");
		} else if (cmd.equals("scissor") && com == PAPER) {
			textField.setText("������ ����, ��ǻ�� �� : ������ ��");
		} else if (cmd.equals("paper") && com == SCISSOR) {
			textField.setText("������ ��, ��ǻ�� ���� : ��ǻ�� ��");
		} else if (cmd.equals("paper") && com == ROCK) {
			textField.setText("������ ��, ��ǻ�� ���� : ������ ��");
		} else if (cmd.equals("paper") && com == PAPER) {
			textField.setText("������ ��, ��ǻ�� �� : ���º�");
		}

	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

}
