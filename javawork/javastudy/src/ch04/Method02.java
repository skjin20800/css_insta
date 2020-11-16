package ch04;

class Dog {
	int 배고픔 = 100; //상태 //상태는 행위에 의해서만 변경
	
	void eat() { //행위  
		배고픔 = 10;
	}
}


public class Method02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();

		//d1.배고픔 = 10; //변수를 직접적으로 바꾸는 짓은 금지 [마법]
		d1.eat();
		
		System.out.println("강아지의배고픔 : " + d1.배고픔);
	}
}
