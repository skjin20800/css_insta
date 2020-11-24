package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();

	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű: �ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setSize(300, 150);
		setVisible(true);

		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true); // Ű �̺�Ʈ�� ��Ŀ���� ���� �� �ִ� ������Ʈ�� ������ ���� �� �켱������ �Է¹ޱ� ���� ����
		c.requestFocus();// Ű �̺�Ʈ�� ���� ������Ʈ�� ������ ����

	}

//Key������ ����
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			//la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Ű�� �ԷµǾ���");
			
			if(e.getKeyChar()=='%') {// �Էµ� Ű�� %�� ���
				contentPane.setBackground(Color.yellow);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F1){//�Էµ� Ű�� <F1> �ΰ�
				contentPane.setBackground(Color.GREEN);
			}
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
