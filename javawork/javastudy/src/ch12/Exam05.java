package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam05 extends JFrame {
	private JPanel mp1, p1, p2;
	private MyPanel panel = new MyPanel();
	private JButton click;
	List<Integer> list1 = new ArrayList<>();
	private int a1 = 0;

	public Exam05() {

		list1.add(300);
		list1.add(300);
		list1.add(300);
		list1.add(300);
		list1.add(300);

		mp1 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();

		setTitle("하나씩 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mp1);

		mp1.setLayout(new BorderLayout());
		mp1.add(panel, BorderLayout.CENTER);
		mp1.add(p2, BorderLayout.SOUTH);

		click = new JButton("클릭");
		click.setPreferredSize(new Dimension(200, 50));
		click.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t1.start();
				t2.start();
				t3.start();
				t4.start();
				t5.start();
				repaint();
			}
		});
		p2.add(click);

		setSize(500, 500);
		setVisible(true);

	}

	
	class MyPanel extends JPanel {
	
			@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub

			g.setColor(Color.blue);
			g.drawLine(140, list1.get(0), 140, 300);
			g.drawLine(190, list1.get(1), 190, 300);
			g.drawLine(240, list1.get(2), 240, 300);
			g.drawLine(290, list1.get(3), 290, 300);
			g.drawLine(340, list1.get(4), 340, 300);

			
			
		}
	}

	Thread t1 = new Thread(new aniThread(0,100));
	Thread t2 = new Thread(new aniThread(1,90));
	Thread t3 = new Thread(new aniThread(2,65));
	Thread t4 = new Thread(new aniThread(3,80));
	Thread t5 = new Thread(new aniThread(4,30));
	
	class aniThread implements Runnable 
	{
		private int z1,z2;
public aniThread(int a, int b) {
z1 = a;
z2 = b;
}
		@Override
		public void run() {
			if (a1 == 0) {
				for (int i = 300; i > z2; i = i-20) {
					list1.set(z1,i);
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}	
				}
				a1++;
			}
			
		}}
	
	
	public static void main(String[] args) {

		new Exam05();

	}
}
