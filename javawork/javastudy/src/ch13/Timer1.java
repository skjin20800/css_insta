package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

//구상방법
//1. 먼저 UI를 구축해서 틀을 만든다
//2. 틀에 데이터 전송을할 요소를 찾는다.
//3. 요소를 쓰레드에 넣어준다
//4. 쓰레드에 해당요소의 타입과 일치하는 상태를 정한다
//5. 생성자를 만들어 쓰레드의 상태와 일치시킨다
//6. run()함수를 이용해서 쓰레드상태를 조작한다
//7. 쓰레드 상태-> GUI상태가 결합되어
//    쓰레드 상태를 변경하면 GUI상태도 변경된다.
class TimerTime extends Thread {
	//4. 쓰레드에 해당요소의 타입과 일치하는 상태를 정한다
	private JLabel hour;
	private JLabel minute;
	private JLabel Second;

	//5. 생성자를 만들어 쓰레드의 상태와 일치시킨다
	public TimerTime(JLabel hour, JLabel minute, JLabel Second) {
		this.hour = hour;
		this.minute = minute;
		this.Second = Second;
	}
	
	//6. run()함수를 이용해서 쓰레드상태를 조작한다
	//  쓰레드 상태-> GUI상태가 결합되어 run()함수를 사용하여
	//  쓰레드 상태를 변경시 GUI상태도 변경된다.
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
		//1. 먼저 UI를 구축해서 틀을 만든다
		private JLabel hour, minute, second, a1, a2;
		private Container c;

		public Timer1() {
			setTitle("전자 시계");	
			initObject();
			initSetting();
			initAdd();
			//2. 틀에 데이터 전송을할 요소를 찾는다.
			//3. 요소를 쓰레드에 넣어준다
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