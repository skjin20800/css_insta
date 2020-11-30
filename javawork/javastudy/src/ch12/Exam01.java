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

public class Exam01 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JPanel mp1, p1, p2;
		
	
private JButton click;
	public Exam01() {

		
		mp1 = new JPanel();

		p2 = new JPanel();

		setTitle("JPanel�� paintComponet() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mp1);

		mp1.setLayout(new BorderLayout());
		mp1.add(panel, BorderLayout.CENTER);
		mp1.add(p2, BorderLayout.SOUTH);

		click = new JButton("Ŭ��");
		click.setPreferredSize(new Dimension(200, 50));		
		p2.add(click);
		click.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
				
			}
		});
		setSize(500, 500);
		panel.setVisible(false);
		setVisible(true);
		
	}

	// JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel {
		List<Integer> list1 = new ArrayList<>();
public MyPanel() {
	this.list1.add(100);
	this.list1.add(90);
	this.list1.add(65);
	this.list1.add(80);
	this.list1.add(30);
}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g); // �г� ���� ������ �׷��� �ܻ��� ����� ���� ȣ��
			g.setColor(Color.blue);
			g.drawLine(140, list1.get(0), 140, 300);
			g.drawLine(190, list1.get(1), 190, 300);
			g.drawLine(240, list1.get(2), 240, 300);
			g.drawLine(290, list1.get(3), 290, 300);
			g.drawLine(340, list1.get(4), 340, 300);

		}
	}

	public static void main(String[] args) {

		new Exam01();

	}
}
