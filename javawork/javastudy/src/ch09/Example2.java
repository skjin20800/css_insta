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
			setTitle("����");
			setSize(500, 200);
			
			
			Container c = getContentPane(); 
			JPanel a = new JPanel();
			JPanel b = new JPanel();
			a.setLayout(new FlowLayout());
			b.setLayout(null);
			
			b.setBounds(50, 100, 200, 200);
			a.setPreferredSize(new Dimension(200, 10));
			
			
			// Jpanel = (JFram�� �⺻���� ������ �ִ� �г�)
			
			JButton btn1 = new JButton("��ư1");
			JButton btn2 = new JButton("��ư2");
			JButton btn3 = new JButton("��ư3");
		
			c.setLayout(new BorderLayout(30,20)); // �����ִ��Լ�
			c.add(a, BorderLayout.CENTER);
			c.add(b,BorderLayout.SOUTH);
			a.setBackground(Color.gray);		
			a.add(btn1);
			a.add(btn2);
			a.add(btn3);
			
						
			setVisible(true); //ȭ�鿡 ǥ���ϴ� �Լ�
		}
	
	public static void main(String[] args) {
		new Example2();

	}

}
