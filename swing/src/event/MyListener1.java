package event;

import java.awt.event.ActionEvent;
/*
 * ActionListener
 * JButton, JMenuItem, JTextField ������Ʈ�� �̺�Ʈ ���
 * 
 * JButton -> ���콺�� enter ��ư ����
 * JMenuItem -> �޴� ����
 * JTextField -> Enter Ű �Է� 
 * */

import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�׼��� �Ͼ ��ü�� command ������
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		System.out.println("e.getID()"+e.getID());
		System.out.println("e.getSource()"+e.getSource());

	}

}
