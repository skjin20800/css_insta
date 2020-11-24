package ch10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerALLEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerALLEx() {
	setTitle("MouseListener와 MouseMotionListener");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	MyMouseListener listener = new MyMouseListener();
	c.addMouseListener(listener);
	c.addMouseMotionListener(listener);
	
	c.add(la);
	setSize(300,300);
	setVisible(true);
	}
	
	// Mouse 리스너 구현
	class MyMouseListener implements MouseListener, MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		la.setText("mousePressed ("+e.getX()+","+e.getY()+")");//마우스 눌러진 값 출력	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased ("+e.getX()+","+e.getY()+")"); //마우스 떼어진 값 출력
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
		Component c = (Component)e.getSource(); //마우스가 올라간 컴포넌트를 알아낸다
		c.setBackground(Color.CYAN);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource(); //마우스가 내려간 컴포넌트를 알아낸다
			c.setBackground(Color.yellow);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {//마우스 드래깅되는 동안 계속 호출
		la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {// 마우스가 움직이는 동안 계속 호출
			la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");
		}
		
	}
		
	
public static void main(String[] args) {
	new MouseListenerALLEx();
}
}
