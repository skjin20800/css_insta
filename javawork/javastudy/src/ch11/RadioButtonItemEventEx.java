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
	private JRadioButton [] radio = new JRadioButton[3]; // üũ�ڽ� �迭
	private String [] text = {"���", "��", "ü��"}; //üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭
	private ImageIcon [] image = {//�̹��� ��ü�迭
		 new ImageIcon("D:/image/apple.jpg"),
		 new ImageIcon("D:/image/pear.jpg"),
		 new ImageIcon("D:/image/cherry.jpg")};
	
	private JLabel imageLabel = new JLabel();//�̹����� ��µ� ���̺�
	
	public RadioButtonItemEventEx() {
		setTitle("������ư ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);// text[]�� ���ڿ��� üũ�ڽ� ����
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);// ü�� ������ư�� ���� ���·� ����
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//�̹����� �߾� ����
		setSize(250,200);
		setVisible(true);
						
			}
	
	//Item ������ ����
	class MyItemListener implements ItemListener{
				// �����ڽ��� ���� ���°� ���ϸ� itemStateChanged()�� ȣ���
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()== ItemEvent.DESELECTED) {//������ ��� �׳� ����
				return;}
			if(radio[0].isSelected())//����� ���õ� ���
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())//�谡 ���õ� ���
				imageLabel.setIcon(image[1]);
			else {// ü���� ���õȰ��
				imageLabel.setIcon(image[2]);
			}
		}
		
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
	}
