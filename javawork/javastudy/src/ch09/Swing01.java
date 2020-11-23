package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing�� ���������� while�� ���� ����. ���� ���μ���
public class Swing01 extends JFrame {

	public Swing01(){
		setTitle("����");
		setSize(300, 500);
		
		
		Container c = getContentPane();
		
		// Jpanel = (JFram�� �⺻���� ������ �ִ� �г�)
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		
		JPanel jp1 = new JPanel();
		
		jp1.add(btn6);
		
		c.add(btn1, Batch.WEST);
		c.add(btn2, Batch.EAST); 
		c.add(btn3, Batch.NORTH);
		c.add(btn4, Batch.CENTER); //���Ƿ� �������̽��� ����� �Ǽ�����
		c.add(btn5, BorderLayout.SOUTH); // �⺻���� �������� �������̽�
		
		
		setVisible(true); //ȭ�鿡 ǥ���ϴ� �Լ�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing01();
	}

}
