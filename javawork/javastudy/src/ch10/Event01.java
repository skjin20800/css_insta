package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame{
	private JButton btn1;
	private JLabel la1;
	
public Event01() {
	setTitle("�̺�Ʈ");
	setSize(300,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	btn1 = new JButton("Ŭ���ϼ���");
	la1 = new JLabel("Ŭ�� �ȵ�");
	la1.setFont(new Font("Serif",Font.BOLD, 50));
	
	Container c = getContentPane(); //JFrame�� �⺻������ �������ִ� JPanel�� �����ϱ� ���� ���
	c.add(la1, BorderLayout.CENTER);
	c.add(btn1, BorderLayout.SOUTH);
	
	
	c.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
		}
	});
	
	// 1.������ ��� (������ =�������̽�(�޼��� ������ ���ؼ�))
	btn1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {//�������
			la1.setText("Ŭ����");
			
		}
	}); 
	
	//2. (OS���� ���ִ�)JVM�� � �̺�Ʈ�� �߻��ߴ����� Ȯ���ϰ�
	//3. �߻��� �̺�Ʈ�� �̺�Ʈ �й� �����忡 ��� (��⿭ ���)
	//4. ������� �����ʰ� �����.
	
	setVisible(true); // ������ ���� ��������!! �׸��� �׷���!!
}
	public static void main(String[] args) {
		new Event01();

	}

}
