package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Event02 extends JFrame implements ActionListener{
	private JLabel laTitle;
	private JButton btn1, btn2, btn3;
	private Container c;
	public Event02() {
		laTitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		c = getContentPane();
		
		c.add(laTitle, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.CENTER);
		c.add(btn3, BorderLayout.EAST);
		


		btn1.addActionListener(this);
		
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
	
		
		setTitle("이벤트02");
		setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Event02();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource()의 리턴타입은 Object임.
		// 왜냐면 getSouce입장에서는 버튼일지 체크박스인지 모르기때문
		System.out.println("클릭됨 : " + e.getSource());
		Object ob = e.getSource();
		//불가능 System.out.println(ob.getText()); 
		JButton btn =(JButton)e.getSource();
		System.out.println(btn.getText());
		
		//조건문으로
		if (btn.getText().equals("딸기 클릭")) {
			laTitle.setText("스트로베리");
		}
		else if(btn.getText().equals("바나나 클릭")) {
			laTitle.setText("벌내너");
		}
		else if(btn.getText().equals("참외 클릭")) {
			laTitle.setText("차매");
		}
		
		
	}
}
