package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch03.example;




public class Example extends JFrame {


		public Example(){
			setTitle("����");
			setSize(300, 500);
			
			
			Container c = getContentPane(); 
			JPanel d = new JPanel();
			d.setLayout(new FlowLayout());
			// Jpanel = (JFram�� �⺻���� ������ �ִ� �г�)
			
			JButton btn1 = new JButton("��ư3");
			JButton btn2 = new JButton("��ư4");
			JButton btn3 = new JButton("��ư5");
			JButton btn4 = new JButton("��ư3-1");
			JButton btn5 = new JButton("��ư3-2");
			JButton btn6 = new JButton("��ư3-3");
			JButton btn7 = new JButton("��ư623");
			
			JPanel jp1 = new JPanel();
			JPanel jp2 = new JPanel();
			JPanel jp3 = new JPanel();
			JPanel jp4 = new JPanel();
			JPanel jp5 = new JPanel();
			JPanel jp6 = new JPanel();
			JPanel jp7 = new JPanel();
			jp1.add(btn3);
			jp2.add(btn4);
			jp3.add(btn5);
			jp4.add(btn6);
			
		
			c.setLayout(new BorderLayout(30,20));
			c.add(jp1, Batch.NORTH);

			c.add(btn1,Batch.CENTER);
			c.add(d,BorderLayout.SOUTH);
			d.add(jp2);
			d.add(jp3);
			d.add(jp4);
			
			
			
			setVisible(true); //ȭ�鿡 ǥ���ϴ� �Լ�
		}
	
	public static void main(String[] args) {
		new Example();

	}

}
