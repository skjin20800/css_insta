package ch10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame{	
	public ClickAndDoubleClickEx() {
	setTitle("Click and DoubleClick 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.addMouseListener(new MyMouseListener());
	
	setSize(300,300);
	setVisible(true);
	}
	
	// Mouse 리스너 구현
	class MyMouseListener extends MouseAdapter{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {// 더블클릭일경우
				int r = (int)(Math.random()*256); // 0~255사이의 랜덤한 rgb정수 얻기
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
