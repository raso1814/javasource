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

		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);

		// 현재 contentPane 가져오기
		Container contentPane = getContentPane();

		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(label, BorderLayout.NORTH); // add~가능

		// 가운데 이미지 출력
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

		// 하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
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
			textField.setText("게임자 바위, 컴퓨터 가위 : 게임자 승");
		} else if (cmd.equals("rock") && com == ROCK) {
			textField.setText("게임자 바위, 컴퓨터 바위 : 무승부");
		} else if (cmd.equals("rock") && com == PAPER) {
			textField.setText("게임자 바위, 컴퓨터 보 : 컴퓨터 승");
		} else if (cmd.equals("scissor") && com == SCISSOR) {
			textField.setText("게임자 가위, 컴퓨터 가위 : 무승부");
		} else if (cmd.equals("scissor") && com == ROCK) {
			textField.setText("게임자 가위, 컴퓨터 바위 : 컴퓨터 승");
		} else if (cmd.equals("scissor") && com == PAPER) {
			textField.setText("게임자 가위, 컴퓨터 보 : 게임자 승");
		} else if (cmd.equals("paper") && com == SCISSOR) {
			textField.setText("게임자 보, 컴퓨터 가위 : 컴퓨터 승");
		} else if (cmd.equals("paper") && com == ROCK) {
			textField.setText("게임자 보, 컴퓨터 바위 : 게임자 승");
		} else if (cmd.equals("paper") && com == PAPER) {
			textField.setText("게임자 보, 컴퓨터 보 : 무승부");
		}

	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

}
