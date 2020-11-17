package ch05;
//다형성 성립하는 상속

class 지구인 {
	String name = "지구인";
}

class 한국인 extends 지구인 {
	String name = "한국인";
}

class 부산인 extends 한국인 {
	String name = "부산인";
}

public class Inherit02 {
	public static void main(String[] args) {
		// heap (한국인, 지구인) -> 포인터(지구인)
		지구인 b = new 한국인();

		// 포인터가 상위개념이면 다운캐스팅하여 동등개념으로 맞춘다
		// 1. b는 한국인(자식), 지구인(부모)이 메모리에 다 있기 때문에
		// 다운캐스팅 가능
		한국인 h = (한국인) b;
		
		try {
			//컴파일적으로는 문제없으나 실제 메모리 heap에 지구인, 한국인밖에 존재하지않기때문에 실행시 런타임 오류가난다.
			// 그래서 try/catch문을 이용해서 관리한다.
			부산인 busan = (부산인) b;	
		} catch (Exception e) {
			//개발자가 핸들링 할 수 있음 (로그 파일)
			System.out.println("오류 발생했는데 무시해도 돼");
		}
		
	}
}
