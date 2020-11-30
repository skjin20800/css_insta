package ch12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx() {
		setTitle("JPanel�� paintComponet() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250,220);
		setVisible(true);
	}
	//JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g); // �г� ���� ������ �׷��� �ܻ��� ����� ���� ȣ��
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
		}
	
	
public static void main(String[] args) {
	new paintJPanelEx();
	
}
}
