package ch05;

import java.security.GeneralSecurityException;

public class GameApp {

	// ���̽�ƽ   
	static void start(Control c) {
		c.����();
		c.�극��ũ();
	}

	public static void main(String[] args) {
		Sonata s = new Sonata();
		start(s);
		
		Ferari g = new Ferari();
		start(g);
	}
}
