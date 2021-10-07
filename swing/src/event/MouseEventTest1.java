package event;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

//MouseListener
//mouseClicked() : 마우스가 컴포넌트를 클릭했을 때
//mousePressed() : 마우스버튼이 눌러졌을때
//mouseReleased() : 눌러진 버튼이 떼어질 때
//mouseEntered() : 마우스가 컴포넌트 위에 올라갈 때
//mouseExited() : 마우스가 컴포넌트에서 내려올 때

//press->release>click

//MouseMotionListener 
//mouseDragged() : 마우스가 드래그 되는 동안
//mouseMoved() : 마우스가 움직이는 동안

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseEventTest1 extends JFrame implements MouseListener, MouseMotionListener{

	private JTextField textField;
	
	public MouseEventTest1() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭");
		btn.addMouseListener(this);
		add(btn,BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea(3,50);
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		add(textArea, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.addMouseListener(this);
		add(textField,BorderLayout.SOUTH);
		
		setSize(200,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventTest1();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		textField.setText("mouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		textField.setText("mouseExited");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	System.out.println("mouseDragged");}

	@Override
	public void mouseMoved(MouseEvent e) {
	System.out.println("mouseMoved");}

}
