package event;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

//MouseListener
//mouseClicked() : ���콺�� ������Ʈ�� Ŭ������ ��
//mousePressed() : ���콺��ư�� ����������
//mouseReleased() : ������ ��ư�� ������ ��
//mouseEntered() : ���콺�� ������Ʈ ���� �ö� ��
//mouseExited() : ���콺�� ������Ʈ���� ������ ��

//press->release>click

//MouseMotionListener 
//mouseDragged() : ���콺�� �巡�� �Ǵ� ����
//mouseMoved() : ���콺�� �����̴� ����

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseEventTest1 extends JFrame implements MouseListener, MouseMotionListener{

	private JTextField textField;
	
	public MouseEventTest1() {
		setTitle("���콺 �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Ŭ��");
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
