package event;

import java.awt.event.ActionEvent;


/*
 /* ActionListener
 * JButton, JMenuItem, JTextField 컴포넌트의 이벤트 담당
 * 
 * JButton -> 마우스나 enter 버튼 선택
 * JMenuItem -> 메뉴 선택
 * JTextField -> Enter 키 입력 
 * */

/*
 * KeyEvent : 키가 눌러지거나 눌러진 키가 떼어질 때
 * ItemEvent : JCheckBox, JRadioButton, JCheckBoxMenuItem의 상태가 변활때
 * MouseEvent : 마우스 버튼이 눌러지거나 떼어질 때, 클릭, 더블클릭, 드래그...
 * KeyListener
 * KeyAdapter : 추상클래스, 클래스와 비슷하지만 직접 객체 생성은 안됨 (new KeyAdaper 안됨)
 * */

import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//액션이 일어난 객체의 command 가져옴
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		System.out.println("e.getID()"+e.getID());
		System.out.println("e.getSource()"+e.getSource());

	}

}
