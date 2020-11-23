package review;

//동기적 프로그램
class 저장소{
	
	String data;
	
	String 다운로드() {
		data = "GTA5 게임";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("다이죠부");
		} //1000 = 초
		return data;
	}
}


// 자바는 메서드를 함수의 매개변수로 전달할 수 없음
// 자바는 메서드를 함수의 매개변수로 전달하고 싶으면 무조건 인터페이스에 함수를 담아야한다.
// 그렇게 하기 위해선 인터페이스로 이루어진 익명클래스로 넘긴다

// 인터페이스는 메서드를 전달할때 사용한다,
// 메서드를 전달할때 인터페이스를 통해 함수만 전달하면 익명클래스로 구현한다.
public class Ex122 {

	public static void main(String[] args) {
		저장소 s = new 저장소();
		String game = s.다운로드();
		
		System.out.println(game+" 실행");
		
	}
}
