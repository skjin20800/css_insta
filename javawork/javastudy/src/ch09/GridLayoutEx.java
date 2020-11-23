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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼클릭하면 main이 종료됨.

		// 4x2 격자의 GridLayout 배치관리자 생성
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
		a.add(new JLabel(" 이름"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" 학번"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" 학과"));
		a.add(new JTextArea(""));
		a.add(new JLabel(" 과목"));
		a.add(new JTextArea(""));
		JButton btn1 = new JButton("버튼3");
		btn1.setPreferredSize(new Dimension(300, 40));
		b.add(btn1);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
