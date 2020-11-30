package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame{
	int x = 10;
	int y =10;
	
	private MyPanel panel;
	
public Gra02(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("repaint 예제");
	setSize(400,500);
	panel = new MyPanel();
	setContentPane(panel);
	
	
	setVisible(true);
	
	
}

class MyPanel extends JPanel{
	
	public MyPanel() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				x = e.getX();
				y = e.getY();
				System.out.println("x : " + x);
				System.out.println("y : " + y);
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g); //이전 그림 지우기
		g.setColor(Color.blue);
		g.drawRect(x, y, 50,50);
	}
	
}
public static void main(String[] args) {
	new Gra02();
}
}
