package ch09;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

public class Swing04 extends JFrame {
private JButton btnFlow1, btnFlow2, btnFlow3;
private JLabel laName1, laName2, laName3;
private Container Cmain;
private JPanel top, bottom;
	
	public Swing04() {
		initObject();
		initSetting();
		initBatch();
	}
	
	private void initObject(){
		Cmain = getContentPane();
		bottom = new JPanel();
		top = new JPanel();
		
		btnFlow1 = new JButton("1번 button");
		btnFlow2 = new JButton("2번 button");
		btnFlow3 = new JButton("3번 button");
		laName1 = new JLabel("1번 label");
		laName2 = new JLabel("2번 label");
		laName3 = new JLabel("3번 label");
	}
	
	private void initSetting(){
		setTitle("연습");
		setVisible(true);
		setSize(500,300);
		top.setBackground(Color.GRAY);
		bottom.setLayout(null);
		laName1.setBounds(98, 41, 57, 15);
		laName2.setBounds(63, 130, 57, 15);
		laName3.setBounds(279, 105, 57, 15);
	}
	
	private void initBatch(){
		Cmain.add(top, BorderLayout.NORTH);
		top.add(btnFlow1);		
		top.add(btnFlow2);		
		top.add(btnFlow3);		
		Cmain.add(bottom, BorderLayout.CENTER);	
		bottom.add(laName1);	
		bottom.add(laName2);		
		bottom.add(laName3);
	}
	
	public static void main(String[] args) {
		
		new Swing04();
	}
}
