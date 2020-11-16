package ch04;

//자바 특징 =모든 코드는 class 내부에 둬야 한다
public class Method01 {
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Method01.add();
			
			Method01 m = new Method01();
			m.sound();
			//힙은 new Method01();을 하면 Method01클래쓰의 모든 힙을 호출함
			//Method01 m 은 어떤클래스를 사용할것인지, 변수명은 무엇인지를 물어본다
	}

}
