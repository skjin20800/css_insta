package ch04;

 class TVa{
	int size;
	String mf;
	
	public TVa() {
		this("LG");
		
	}
	
	public TVa(String mf) {
		this(32, mf);
	}
	
	public TVa(int size, String mf) {
		this.size = size;
		this.mf = mf;
		System.out.println(size+"��ġ"+mf);
	}
	
	
}


public class TVApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TVa();
		new TVa("�Ｚ");
		new TVa(65, "�Ｚ");
		
	}
}