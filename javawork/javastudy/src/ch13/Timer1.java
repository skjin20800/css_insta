package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

//������
//1. ���� UI�� �����ؼ� Ʋ�� �����
//2. Ʋ�� ������ �������� ��Ҹ� ã�´�.
//3. ��Ҹ� �����忡 �־��ش�
//4. �����忡 �ش����� Ÿ�԰� ��ġ�ϴ� ���¸� ���Ѵ�
//5. �����ڸ� ����� �������� ���¿� ��ġ��Ų��
//6. run()�Լ��� �̿��ؼ� ��������¸� �����Ѵ�
//7. ������ ����-> GUI���°� ���յǾ�
//    ������ ���¸� �����ϸ� GUI���µ� ����ȴ�.
class TimerTime extends Thread {
	//4. �����忡 �ش����� Ÿ�԰� ��ġ�ϴ� ���¸� ���Ѵ�
	private JLabel hour;
	private JLabel minute;
	private JLabel Second;

	//5. �����ڸ� ����� �������� ���¿� ��ġ��Ų��
	public TimerTime(JLabel hour, JLabel minute, JLabel Second) {
		this.hour = hour;
		this.minute = minute;
		this.Second = Second;
	}
	
	//6. run()�Լ��� �̿��ؼ� ��������¸� �����Ѵ�
	//  ������ ����-> GUI���°� ���յǾ� run()�Լ��� ����Ͽ�
	//  ������ ���¸� ����� GUI���µ� ����ȴ�.
	@Override
	public void run() {
		while (true) {
			LocalDateTime now = LocalDateTime.now();
			hour.setText(now.getHour()+"");
			minute.setText(now.getMinute() + "");
			Second.setText(now.getSecond() + "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			return;
			}
		}
	}
	
}
	public class Timer1 extends JFrame {
		//1. ���� UI�� �����ؼ� Ʋ�� �����
		private JLabel hour, minute, second, a1, a2;
		private Container c;

		public Timer1() {
			setTitle("���� �ð�");	
			initObject();
			initSetting();
			initAdd();
			//2. Ʋ�� ������ �������� ��Ҹ� ã�´�.
			//3. ��Ҹ� �����忡 �־��ش�
			Thread th = new Thread(new TimerTime(hour, minute, second));
			setSize(500, 300);
			setVisible(true);
			th.start();

		}

		void initObject() {
			c = getContentPane();
			hour = new JLabel();
			minute = new JLabel();
			second = new JLabel();
			a1 = new JLabel(":");
			a2 = new JLabel(":");
		}
		
		void initSetting() {
			c.setLayout(new FlowLayout());
			hour.setFont(new Font("Gothic", Font.ITALIC, 80));
			minute.setFont(new Font("Gothic", Font.ITALIC, 80));
			second.setFont(new Font("Gothic", Font.ITALIC, 80));
			a1.setFont(new Font("Gothic", Font.ITALIC, 80));
			a2.setFont(new Font("Gothic", Font.ITALIC, 80));
			hour.setSize(100, 100);
			minute.setSize(100, 100);
			second.setSize(100, 100);
		}
		void initAdd() {
			c.add(hour);
			c.add(a1);
			c.add(minute);
			c.add(a2);
			c.add(second);
		}
		
public static void main(String[] args) {
		new Timer1();
}
}