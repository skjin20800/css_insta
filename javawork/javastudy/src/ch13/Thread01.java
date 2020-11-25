package ch13;

class Another implements Runnable{ //Runnable 사용 추천
//또는 class Another extends Thread{ //Runnable타입이 되어야함	
	
	//실행단위 코드블록 = 스택(스레드)
	
	@Override
	public void run() {
		System.out.println("새로운 스레드실행됭");
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println("run : "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
System.out.println("새로운 스레드 종료");

	}
}

public class Thread01 {
	public static void main(String[] args) {
		System.out.println("main 스레드실행됭");
		
		//새로운 스레드 실행 1. 스레드 객체생성 2. 타겟 설정 3. 실행
		Thread t1 = new Thread(new Another());
		t1.start();//독립적인 스레드 실행
		
		Thread t2 = new Thread(new Another(),"스레드 이름");
		t2.start();
		System.out.println(t2.getName());
		
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println("main : "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
System.out.println("main 스레드 종료");
	}
}
