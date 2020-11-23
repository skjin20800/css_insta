package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing은 내부적으로 while이 돌고 있음. 데몬 프로세스
public class Swing01 extends JFrame {

	public Swing01(){
		setTitle("제목");
		setSize(300, 500);
		
		
		Container c = getContentPane();
		
		// Jpanel = (JFram이 기본으로 가지고 있는 패널)
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		
		JPanel jp1 = new JPanel();
		
		jp1.add(btn6);
		
		c.add(btn1, Batch.WEST);
		c.add(btn2, Batch.EAST); 
		c.add(btn3, Batch.NORTH);
		c.add(btn4, Batch.CENTER); //임의로 인터페이스를 만들어 실수방지
		c.add(btn5, BorderLayout.SOUTH); // 기본으로 만들어놓은 인터페이스
		
		
		setVisible(true); //화면에 표시하는 함수
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing01();
	}

}
