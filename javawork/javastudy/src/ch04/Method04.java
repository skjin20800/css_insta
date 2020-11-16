package ch04;

// ctrl+shift+f 정렬
//메서드안에 메서드를 정의할 수 없다.
// 변수에 메서드를 담을수 없다
public class Method04 {

	static int money = 10000; //heap
	
	int add(int num) {// int num stack, add() heap // 
					// 함수형프로그램은 상태(heap)에게 영향을 주지않는다[순수하다, 순수하게 money2를 리턴한다]
					// 객체지향인 java는 상태(heap)에게 영향을 주는 프로그램만 만든다 [순수하지못하다]
		int money2 = money + num;
		return money2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m = new Method04();
		int money2 = m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
		
	}
}
