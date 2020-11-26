package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame{
	private String [] fruits = {"apple","banana","kiwi","mango"};
	private ImageIcon [] images = {new ImageIcon("D:/image/apple.jpg"),new ImageIcon("D:/image/banana.jpg"),
			new ImageIcon("D:/image/kiwi.jpg"),new ImageIcon("D:/image/mango.jpg")
};
	private JLabel imgLabel = new JLabel(images[0]);//이미지 레이블 컴포넌트
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);// 문자열 콤보박스
	
	public ComboActionEx() {
	setTitle("콤보박스 만들기 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(strCombo);
	c.add(imgLabel);
	
	// Action 리스너 등록
	strCombo.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> cb = (JComboBox<String>)e.getSource();// Action 이벤트가 발생한 콤보박스 알아내기
			int index = cb.getSelectedIndex();
			imgLabel.setIcon(images[index]);//인덱스의 이미지를 이미지 레이블 컴포넌트에 출력
			
		}
	});
	setSize(300,250);
	setVisible(true);
	

	}	
	public static void main(String[] args) {
	new ComboActionEx();	
	}

}
