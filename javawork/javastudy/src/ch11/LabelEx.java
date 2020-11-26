package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�");
		
		//�̹��� ���Ը� ����
		ImageIcon beauty = new ImageIcon("D:/image/home2.png"); //�̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); //�̹��� ���̺� ����
		
		// ���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("D:/image/home2.png");// �̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);//���̺� ����
		
		// ����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
	}
