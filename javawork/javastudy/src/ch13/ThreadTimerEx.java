package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	private JLabel timerLabel;//Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel) {
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

public class ThreadTimerEx extends JFrame{	
	public ThreadTimerEx() {
	setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	//Ÿ�̸� ���� ����� ���̺� ����
	JLabel timerLabel = new JLabel();
	timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
	c.add(timerLabel);
	
	// Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺� �����ڿ� ����
//	TimerThread th = new TimerThread(timerLabel);
	Thread th = new Thread(new TimerThread(timerLabel));
	
	setSize(300,170);
	setVisible(true);
	
	th.start();//Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	
	public static void main(String[] args) {
	new ThreadTimerEx();
}
}
