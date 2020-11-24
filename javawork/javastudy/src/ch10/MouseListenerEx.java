package ch10;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("HELLO");
	
	public MouseListenerEx() {
	setTitle("Mouse 이벤트 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.addMouseListener(new MyMouserListener());
	
	
	c.setLayout(null);
	la.setSize(50,20);
	la.setLocation(30,30);
	c.add(la);
	
	setSize(250,250);
	setVisible(true);
	}
	
	// Mouse 리스너 구현
	class MyMouserListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
		
	
public static void main(String[] args) {
	new MouseListenerEx();
}
}
