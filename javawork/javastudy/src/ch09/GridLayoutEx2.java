package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutEx2 extends JFrame{
	public GridLayoutEx2() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ưŬ���ϸ� main�� �����.

		// 4x2 ������ GridLayout ��ġ������ ����
		GridLayout grid = new GridLayout(1,9);
		grid.setVgap(5);
		
		Container c = getContentPane();
		JPanel a = new JPanel();
		
		c.setLayout(new BorderLayout());
		
		c.add(a,BorderLayout.CENTER);
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		JButton btn7 = new JButton("��ư7");
		JButton btn8 = new JButton("��ư8");
		JButton btn9 = new JButton("��ư9");
		btn1.setBackground(new Color(0,0,0));
		btn2.setBackground(new Color(0,255,0));
		btn3.setBackground(new Color(0,0,255));
		btn4.setBackground(new Color(0,255,255));
		btn5.setBackground(Color.white);
		a.setLayout(grid);
		a.add(btn1);
		a.add(btn2);
		a.add(btn3);
		a.add(btn4);
		a.add(btn5);
		a.add(btn6);
		a.add(btn7);
		a.add(btn8);
		a.add(btn9);
			
		
		setSize(1500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx2();
	}

}
