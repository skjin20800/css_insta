package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// �̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("D:/image/cherry.jpg"); //���� ���� �̹���
		ImageIcon selectedCherryIcon = new ImageIcon("D:/image/selectedCherry.jpg"); //���� ���� �̹���
		

		// 3�� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		
		cherry.setBorderPainted(true);//üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedCherryIcon); //���� ���� �̹��� ���

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
