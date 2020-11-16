package ch04;

class Cal{//계산기
	
	 static void add(int n1, int n2) { //int n1, int2는 스택임 스택은 호출시에만 실행
		  int num1 = 0;
		System.out.println(n1+n2);
			}
	
	static int minus(int n3, int n4) {
		return n3 - n4;
	}
}

public class Method03 {

	public static void main(String[] args) {
		//Cal.add(2, 4);
		
		// minus 함수는 return타입이 int이기 때문에
		// Cal.minus(10,4)가 호출된 후 메서드가 종료되면
		// Cal.minus(10,4)--> 6으로 변경된다
		int result = Cal.minus(11,4);
		
		System.out.println(result);
	}

}
