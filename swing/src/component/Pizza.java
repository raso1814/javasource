package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Pizza extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;

	private JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnNewRadioButton_2, rdbtnNewRadioButton_3,
			rdbtnNewRadioButton_4, rdbtnNewRadioButton_5, rdbtnNewRadioButton_6, rdbtnNewRadioButton_7,
			rdbtnNewRadioButton_8, rdbtnNewRadioButton_9;

	private JButton btnNewButton_1, btnNewButton;

	private JLabel lblNewLabel_1;

	private ButtonGroup group1, group2, group3;

	// 그룹별 주문금액 변수 설정
	private int kindMoney, toppingMoney, sizeMoney;
	// 그룹별 제품선택 변수 설정
	private String kind, topping, size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		rdbtnNewRadioButton_1 = new JRadioButton("\uCF64\uBCF4");
		rdbtnNewRadioButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdbtnNewRadioButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton_2);

		rdbtnNewRadioButton = new JRadioButton("\uBD88\uACE0\uAE30");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uCD94\uAC00 \uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		rdbtnNewRadioButton_4 = new JRadioButton("\uD53C\uB9DD");
		rdbtnNewRadioButton_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_4);

		rdbtnNewRadioButton_3 = new JRadioButton("\uCE58\uC988");
		rdbtnNewRadioButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_3);

		rdbtnNewRadioButton_5 = new JRadioButton("\uD398\uD37C\uB85C\uB2C8");
		rdbtnNewRadioButton_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_5);

		rdbtnNewRadioButton_6 = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdbtnNewRadioButton_6.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		rdbtnNewRadioButton_6.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_6);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD06C\uAE30", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		rdbtnNewRadioButton_8 = new JRadioButton("Small");
		rdbtnNewRadioButton_8.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		rdbtnNewRadioButton_8.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_8);

		rdbtnNewRadioButton_9 = new JRadioButton("Medium");
		rdbtnNewRadioButton_9.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		rdbtnNewRadioButton_9.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_9);

		rdbtnNewRadioButton_7 = new JRadioButton("Large");
		rdbtnNewRadioButton_7.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		rdbtnNewRadioButton_7.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_7);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);

		btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(this);
		panel_1.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("\uAE08\uC561 : ");
		panel_1.add(lblNewLabel_1);

		group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton);
		group1.add(rdbtnNewRadioButton_1);
		group1.add(rdbtnNewRadioButton_2);

		group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_3);
		group2.add(rdbtnNewRadioButton_4);
		group2.add(rdbtnNewRadioButton_5);
		group2.add(rdbtnNewRadioButton_6);

		group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_7);
		group3.add(rdbtnNewRadioButton_8);
		group3.add(rdbtnNewRadioButton_9);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 이벤트 처리
		String cmd = e.getActionCommand();
		if (cmd.equals("주문")) {

			String orderList = "주문내역\r\n종류 : " + kind + "";
			orderList += "\r\n추가토핑 : " + topping + "\r\n크기 : " + size;
			orderList += "\r\n주문하시겠습니까?";

			int result = JOptionPane.showConfirmDialog(getParent(), orderList, "주문완료", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE);

			if (result == 0) {
				JOptionPane.showMessageDialog(getParent(), "주문이 완료되었습니다.");
				clear();

			} else {
				clear();
			}

		} else {
			clear();
		}

	}

	public void clear() {

		// 라디오 버튼 해제
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();

		// 그룹별 주문금액 변수 초기화
		kindMoney = 0;
		toppingMoney = 0;
		sizeMoney = 0;

		// 그룹별 주문메시지 변수 초기화
		kind = "";
		topping = "";
		size = "";

		lblNewLabel_1.setText("금액 : ");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 라디오 버튼 이벤트 처리
		// 종류 : 콤보(10,000), 포테이토(12000), 불고기(13000)
		// 추가토핑 : 피망(2000), 치즈(2000), 페페로니(1000), 베이컨(3000)
		// 크기 : small(1000), medium(2000), large(3000)

		JRadioButton btn = (JRadioButton) e.getItem();

		// JRadioButton, JCheckBox 상태의 변화가 선택, 해제가 존재
		if (e.getStateChange() == ItemEvent.SELECTED) {

			switch (btn.getText()) {
			case "콤보":
				kindMoney = 10000;
				kind = btn.getText();
				break;
			case "포테이토":
				kindMoney = 12000;
				kind = btn.getText();
				break;
			case "불고기":
				kindMoney = 13000;
				kind = btn.getText();
				break;
			case "피망":
				toppingMoney = 2000;
				topping = btn.getText();
				break;
			case "치즈":
				toppingMoney = 2000;
				topping = btn.getText();
				break;
			case "페퍼로니":
				toppingMoney = 1000;
				topping = btn.getText();
				break;
			case "베이컨":
				toppingMoney = 3000;
				topping = btn.getText();
				break;
			case "Small":
				sizeMoney = 1000;
				size = btn.getText();
				break;
			case "Medium":
				sizeMoney = 2000;
				size = btn.getText();
				break;
			case "Large":
				sizeMoney = 3000;
				size = btn.getText();
				break;

			default:
				break;

			}

			int total = kindMoney + toppingMoney + sizeMoney;

			lblNewLabel_1.setText("금액 : " + total);

		}

	}

}
