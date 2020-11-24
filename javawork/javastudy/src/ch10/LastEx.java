package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LastEx extends JFrame{
JLabel la1, la2, la3, la4;
private JLabel la = new JLabel("Hello");

public LastEx() {
	
	setTitle("Open Challenge 10");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(null);
	
	la1 = new JLabel("0");
	la2 = new JLabel("0");
	la3 = new JLabel("0");
	la4 = new JLabel("시작합니다");

	
	la1.setLocation(100,100);
	la1.setSize(50,50);
	la1.setFont(new Font("Times",Font.BOLD,50));
	la1.setOpaque(true);// 배경색이 보이도록 불투명 속성 설정
	la1.setBackground(Color.pink);

	la2.setLocation(200,100);
	la2.setSize(50,50);
	la2.setFont(new Font("Times",Font.BOLD,50));
	la2.setOpaque(true);// 배경색이 보이도록 불투명 속성 설정
	la2.setBackground(Color.pink);
	
	la3.setLocation(300,100);
	la3.setSize(50,50);
	la3.setFont(new Font("Times",Font.BOLD,50));
	la3.setOpaque(true);// 배경색이 보이도록 불투명 속성 설정
	la3.setBackground(Color.pink);
	
	la4.setLocation(150,200);
	la4.setSize(100,20);
	
	c.add(la1);
	c.add(la2);
	c.add(la3);
	c.add(la4);
	
	
	
	c.addKeyListener(new KeyAdapter() {
//		keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(KeyEvent.getKeyText(keyCode)=="Enter") {
				int a = (int) (Math.random()*5);
				la1.setText(a+"");
				int b = (int) (Math.random()*5);
				la2.setText(b+"");
				int c = (int) (Math.random()*5);
				la3.setText(c+"");
			}
			if(la1.getText().equals(la2.getText())&&la2.getText().equals(la3.getText())) {
				la4.setText("축하합니다");
			}
			else {
				la4.setText("아쉽군요");
			}
			
		}
	});
	
	

	setSize(500, 300);
setVisible(true);
c.setFocusable(true);
c.requestFocus();


}


public static void main(String[] args) {
	new LastEx();
}
}
