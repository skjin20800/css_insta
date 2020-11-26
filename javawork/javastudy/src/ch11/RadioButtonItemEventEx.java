package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton[3]; // 체크박스 배열
	private String [] text = {"사과", "배", "체리"}; //체크박스 문자열로 사용할 문자열 배열
	private ImageIcon [] image = {//이미지 객체배열
		 new ImageIcon("D:/image/apple.jpg"),
		 new ImageIcon("D:/image/pear.jpg"),
		 new ImageIcon("D:/image/cherry.jpg")};
	
	private JLabel imageLabel = new JLabel();//이미지가 출력될 레이블
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);// text[]의 문자열로 체크박스 생성
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);// 체리 라디오버튼을 선택 상태로 결정
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//이미지의 중앙 정렬
		setSize(250,200);
		setVisible(true);
						
			}
	
	//Item 리스너 구현
	class MyItemListener implements ItemListener{
				// 라디오박스의 선택 상태가 변하면 itemStateChanged()가 호출됨
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()== ItemEvent.DESELECTED) {//해제된 경우 그냥 리턴
				return;}
			if(radio[0].isSelected())//사과가 선택된 경우
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())//배가 선택된 경우
				imageLabel.setIcon(image[1]);
			else {// 체리가 선택된경우
				imageLabel.setIcon(image[2]);
			}
		}
		
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
	}
