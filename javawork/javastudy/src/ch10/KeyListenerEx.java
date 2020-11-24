package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;
	
public KeyListenerEx() {
	setTitle("keyListener ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.addKeyListener(new MyKeyListener());
	
	// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
	keyMessage = new JLabel [3];
	keyMessage[0] = new JLabel(" getKeyCode() ");
	keyMessage[1] = new JLabel(" getKeyCode() ");
	keyMessage[2] = new JLabel(" getKeyCode() ");
	
	//3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
	for(int i=0; i<keyMessage.length; i++) {
		c.add(keyMessage[i]);
		keyMessage[i].setOpaque(true);// ������ ���̵��� ������ �Ӽ� ����
		keyMessage[i].setBackground(Color.yellow);//������ CYAN������ ���
	}
	
	setSize(300,150);
	setVisible(true);
	
	//����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
	c.setFocusable(true); // Ű �̺�Ʈ�� ��Ŀ���� ���� �� �ִ� ������Ʈ�� ������ ���� �� �켱������ �Է¹ޱ� ���� ����
	c.requestFocus();//Ű �̺�Ʈ�� ���� ������Ʈ�� ������ ����
	
	
}
	

//Key������ ����
class MyKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		keyMessage[0].setText(Integer.toString(keyCode));
		keyMessage[1].setText(Character.toString(keyChar));
		keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
		
		
		
		System.out.println("Keypressed ��������"); //�����¼��� �� ��������
	}
	@Override
	public void keyReleased(KeyEvent e) {
	System.out.println("KeyReleased ����"); //����
	}
	@Override
	public void keyTyped(KeyEvent e) {
	System.out.println("KeyTyped ������"); //Ÿ���εɶ�
	}
}

	public static void main(String[] args) {
		new KeyListenerEx();


	}

}
