package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnableA implements Runnable{
	private JLabel timerLabel;//Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerRunnableA(JLabel timerLabel) {
		this.timerLabel = timerLabel; // Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; // Ÿ�̸� ī��Ʈ ��
		while(true) {
			timerLabel.setText(Integer.toString(n));
			//timerLabel.setText(n+""); //�̰��ص� �Ȱ���
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame{	
	public ThreadInterruptEx() {
	setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	//Ÿ�̸� ���� ����� ���̺� ����
	JLabel timerLabel = new JLabel();
	timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
	
	
	// Ÿ�̸� ������� ����� th ��ü ����. Ÿ�̸� ���� ����� ���̺� �����ڿ� ����
	Thread th = new Thread(new TimerRunnableA(timerLabel));
	
	c.add(timerLabel);
	
	//��ư�� �����ϰ� Action ������ ���
	JButton btn = new JButton("kill Timer");
	btn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			th.interrupt();
			JButton btn = (JButton)e.getSource();
			btn.setEnabled(false); // ��ư ��Ȱ��ȭ
		}
	});
	c.add(btn);
	
	setSize(300,170);
	setVisible(true);
	
	th.start();//Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	
	public static void main(String[] args) {
	new ThreadInterruptEx();
}
}
