package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ưŬ���ϸ� main�� �����.

		// 4x2 ������ GridLayout ��ġ������ ����
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		JPanel a = new JPanel();
		JPanel b = new JPanel();
		b.setSize(300,20);
		c.setLayout(new BorderLayout());
		b.setLayout(new FlowLayout());
		c.add(a,BorderLayout.CENTER);
		c.add(b,BorderLayout.SOUTH);
		
		a.setLayout(grid);
		a.add(new JLabel(" �̸�"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" �й�"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" �а�"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" ����"));
		a.add(new JTextArea(""));
		JButton btn1 = new JButton("��ư3");
		btn1.setPreferredSize(new Dimension(300, 40));
		b.add(btn1);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
