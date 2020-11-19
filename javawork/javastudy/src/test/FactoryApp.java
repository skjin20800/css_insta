package test;

import ch05.BlueCloth;
import ch05.Factory;
import ch05.RedCloth;

// protected는 같은 패키지+ 자식만 상속
public class FactoryApp {
	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
		Factory f2 = new RedCloth();
		
		f1.가동();
		f2.가동();

	}
}
