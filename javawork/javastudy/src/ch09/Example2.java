package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class Example2 extends JFrame {


		public Example2(){
			setTitle("제목");
			setSize(500, 200);
			
			
			Container c = getContentPane(); 
			JPanel a = new JPanel();
			JPanel b = new JPanel();
			a.setLayout(new FlowLayout());
			b.setLayout(null);
			
			b.setBounds(50, 100, 200, 200);
			a.setPreferredSize(new Dimension(200, 10));
			
			
			// Jpanel = (JFram이 기본으로 가지고 있는 패널)
			
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
		
			c.setLayout(new BorderLayout(30,20)); // 간격주는함수
			c.add(a, BorderLayout.CENTER);
			c.add(b,BorderLayout.SOUTH);
			a.setBackground(Color.gray);		
			a.add(btn1);
			a.add(btn2);
			a.add(btn3);
			
						
			setVisible(true); //화면에 표시하는 함수
		}
	
	public static void main(String[] args) {
		new Example2();

	}

}
