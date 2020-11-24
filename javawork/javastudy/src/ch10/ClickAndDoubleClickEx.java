package ch10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame{	
	public ClickAndDoubleClickEx() {
	setTitle("Click and DoubleClick ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.addMouseListener(new MyMouseListener());
	
	setSize(300,300);
	setVisible(true);
	}
	
	// Mouse ������ ����
	class MyMouseListener extends MouseAdapter{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {// ����Ŭ���ϰ��
				int r = (int)(Math.random()*256); // 0~255������ ������ rgb���� ���
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,b,g));
			}
			}
		}
	
public static void main(String[] args) {
	new ClickAndDoubleClickEx();
}
}
