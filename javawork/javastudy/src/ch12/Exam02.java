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

import lombok.AllArgsConstructor;
import lombok.Data;

public class Exam02 extends JFrame {
	private JPanel mp1, p1, p2;	
	private MyPanel panel = new MyPanel();
private JButton click;
List<Integer> list1 = new ArrayList<>();
private int a1= 0;
	public Exam02() {
		
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
				
				if(a1==0)
				{list1.set(0, 100); a1++;}
				else if(a1==1)
				{list1.set(1,90); a1++;}
				else if(a1==2)
				{list1.set(2,65); a1++;}
				else if(a1==3)
				{list1.set(3,80); a1++;}
				else if(a1==4)
				{list1.set(4,30);}
				panel.paintComponent(getGraphics());
			}
		});
		p2.add(click);
		
		
		
		setSize(500, 500);
		setVisible(true);
		
		
	}

	
	@AllArgsConstructor
	@Data
class MyPanel extends JPanel {
	private int a, b, c, d, e;
	
	public MyPanel(){
	
		
	}

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
	
	
	public static void main(String[] args) {

		new Exam02();

	}
}
