package test;

import ch05.BlueCloth;
import ch05.Factory;
import ch05.RedCloth;

// protected�� ���� ��Ű��+ �ڽĸ� ���
public class FactoryApp {
	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
		Factory f2 = new RedCloth();
		
		f1.����();
		f2.����();

	}
}
