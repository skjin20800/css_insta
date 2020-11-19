package ch05;

interface Nife{
	void 요리();
	default void 상해() {};
}

// 어댑터 용도


class 백종원 implements Nife{

	@Override
	public void 요리() {
System.out.println("요리해봅시다");
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		백종원 종원 = new 백종원();
		종원.요리();
	}
}
