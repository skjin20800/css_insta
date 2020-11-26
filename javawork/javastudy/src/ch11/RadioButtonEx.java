package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {

	public RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// �̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("D:/image/cherry.jpg"); // ���� ���� �̹���
		ImageIcon selectedCherryIcon = new ImageIcon("D:/image/selectedCherry.jpg"); // ���� ���� �̹���

		// ��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup();

		// 3�� �����ڽ� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);

		cherry.setBorderPainted(true);// üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedCherryIcon); // ���� ���� �̹��� ���

		// ��ư �׷쿡 3���� ���� ��ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		// ����Ʈ�ҿ� 3���� ���� ��ư ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
