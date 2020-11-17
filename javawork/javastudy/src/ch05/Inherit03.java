package ch05;

class Animal{
	void sound() {}
}

class Dog extends Animal{
	// 오버라이딩 (무효화 하다 - 부모의 함수)
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	// 오버라이딩 (무효화 하다 - 부모의 함수)
	void sound() {
		System.out.println("얏옹");
	}
}

class Bird extends Animal{
	// 오버라이딩 (무효화 하다 - 부모의 함수)
	void sound() {
		System.out.println("쮁쮁");
	}
}



public class Inherit03 {

	static void start(Animal a) {
		a.sound();
	}
	

	
	public static void main(String[] args) {
	
		Dog d = new Dog();
		Inherit03.start(d);
		
		Cat c = new Cat();
		Inherit03.start(c);
		
		
	}
}
