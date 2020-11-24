package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;
	
public KeyListenerEx() {
	setTitle("keyListener 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.addKeyListener(new MyKeyListener());
	
	// 레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생성
	keyMessage = new JLabel [3];
	keyMessage[0] = new JLabel(" getKeyCode() ");
	keyMessage[1] = new JLabel(" getKeyCode() ");
	keyMessage[2] = new JLabel(" getKeyCode() ");
	
	//3개의 레이블 컴포넌트를 컨텐트팬에 부착
	for(int i=0; i<keyMessage.length; i++) {
		c.add(keyMessage[i]);
		keyMessage[i].setOpaque(true);// 배경색이 보이도록 불투명 속성 설정
		keyMessage[i].setBackground(Color.yellow);//배경색을 CYAN색으로 밴경
	}
	
	setSize(300,150);
	setVisible(true);
	
	//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
	c.setFocusable(true); // 키 이벤트의 포커스를 받을 수 있는 컴포넌트가 여러개 있을 때 우선적으로 입력받기 위한 설정
	c.requestFocus();//키 이벤트를 받을 컴포넌트를 강제로 설정
	
	
}
	

//Key리스너 구현
class MyKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		keyMessage[0].setText(Integer.toString(keyCode));
		keyMessage[1].setText(Character.toString(keyChar));
		keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
		
		
		
		System.out.println("Keypressed 누르는중"); //누르는순간 및 누르는중
	}
	@Override
	public void keyReleased(KeyEvent e) {
	System.out.println("KeyReleased 땐당"); //땔때
	}
	@Override
	public void keyTyped(KeyEvent e) {
	System.out.println("KeyTyped 누른당"); //타이핑될때
	}
}

	public static void main(String[] args) {
		new KeyListenerEx();


	}

}
