package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
	System.out.println("���ο� ������");
	
	}
}

public class Thread02 {
public static void main(String[] args) {
	//1. ������ ��ü ����
	//2. Ÿ�� ����
	//3. ����
	
	Thread t1 = new Thread(new NewThread()); //��õ
	t1.start();
	
	NewThread t2 = new NewThread(); //����õ
	t2.start();
}
}
