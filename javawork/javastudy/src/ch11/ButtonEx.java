package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {

	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("D:/image/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("D:/image/pressedIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("D:/image/rolloverIcon.gif");

		// 3���� �̹����� ���� ��ư ����
		JButton btn = new JButton("call~~", normalIcon);// normalIcon�� �̹��� ���
		btn.setPressedIcon(pressedIcon); // pressedIcon�� �̹��� ���
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon�� �̹��� ���
		c.add(btn);

		setSize(200, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
