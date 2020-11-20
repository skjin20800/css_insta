package ch06;

class User2 {
	private int id;
	private String username;
	private String password;
	
	
	public User2(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		// User2클래스는 각각의 자료형이 다르기때문에 핵사값으로 출력된다
		// 하지만 toString을 오버라이딩한다면 정상출력된다
		User2 user = new User2(1,"ssar","1234");
		System.out.println(user);
		
		
		// String형은 reference참조형이기때문에 
		// 자동으로 toString();을 실행한다
		String s = "안녕";
		System.out.println(s); // System.out.println(s.toString()); 와같은 출력을 가진다

		
	}
}
