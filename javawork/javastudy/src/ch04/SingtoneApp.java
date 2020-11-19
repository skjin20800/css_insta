package ch04;

import java.util.prefs.PreferenceChangeEvent;

class President{
	
	private static President instance = new President();

	public static President getInstance() {
		return instance;
	}
	
	private President() {
		System.out.println("¥Î≈Î∑…¿Ã¥Â");
	}
}


public class SingtoneApp {
	public static void main(String[] args) {
		President p = President.getInstance(); 
		
	}
}
