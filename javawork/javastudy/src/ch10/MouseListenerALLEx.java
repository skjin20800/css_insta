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
	setTitle("MouseListener�� MouseMotionListener");
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
	
	// Mouse ������ ����
	class MyMouseListener implements MouseListener, MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		la.setText("mousePressed ("+e.getX()+","+e.getY()+")");//���콺 ������ �� ���	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased ("+e.getX()+","+e.getY()+")"); //���콺 ������ �� ���
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
		Component c = (Component)e.getSource(); //���콺�� �ö� ������Ʈ�� �˾Ƴ���
		c.setBackground(Color.CYAN);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource(); //���콺�� ������ ������Ʈ�� �˾Ƴ���
			c.setBackground(Color.yellow);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {//���콺 �巡��Ǵ� ���� ��� ȣ��
		la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {// ���콺�� �����̴� ���� ��� ȣ��
			la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");
		}
		
	}
		
	
public static void main(String[] args) {
	new MouseListenerALLEx();
}
}
