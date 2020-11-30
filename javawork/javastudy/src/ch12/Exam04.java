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

public class Exam04 extends JFrame {
	private JPanel mp1, p1, p2;
	private MyPanel panel = new MyPanel();
	private JButton click;
	List<Integer> list1 = new ArrayList<>();
	private int a1 = 0;

	public Exam04() {

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

				if (a1 == 0) {
					for (int i = 300; i > 100; i = i-20) {
						list1.set(0,i);
					panel.paintComponent(getGraphics());
				
						try {
							Thread.sleep(100);
							System.out.println(i);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
					}
					
					a1++;
				} else if (a1 == 1) {

					for (int i = 300; i > 90; i = i-20) {
						list1.set(1,i);
					panel.paintComponent(getGraphics());
				
						try {
							Thread.sleep(100);
							System.out.println(i);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
					}
					
					a1++;
				} else if (a1 == 2) {

					for (int i = 300; i > 65; i = i-20) {
						list1.set(2,i);
					panel.paintComponent(getGraphics());
				
						try {
							Thread.sleep(100);
							System.out.println(i);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
					}
					
					a1++;
				} else if (a1 == 3) {

					for (int i = 300; i > 80; i = i-20) {
						list1.set(3,i);
					panel.paintComponent(getGraphics());
				
						try {
							Thread.sleep(100);
							System.out.println(i);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
					}
					
					a1++;
				} else if (a1 == 4) {

					for (int i = 300; i > 30; i = i-20) {
						list1.set(4,i);
					panel.paintComponent(getGraphics());
				
						try {
							Thread.sleep(100);
							System.out.println(i);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
					}
					
					a1++;
				}
				panel.paintComponent(getGraphics());
			}
		});
		p2.add(click);

		setSize(500, 500);
		setVisible(true);

	}

	class MyPanel extends JPanel {


		@Override
		protected void paintComponent(Graphics g) {

			g.setColor(Color.blue);
			g.drawLine(140, list1.get(0), 140, 300);
			g.drawLine(190, list1.get(1), 190, 300);
			g.drawLine(240, list1.get(2), 240, 300);
			g.drawLine(290, list1.get(3), 290, 300);
			g.drawLine(340, list1.get(4), 340, 300);

		}
	}

	public static void main(String[] args) {

		new Exam04();

	}
}
