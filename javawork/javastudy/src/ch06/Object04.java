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
		// User2Ŭ������ ������ �ڷ����� �ٸ��⶧���� �ٻ簪���� ��µȴ�
		// ������ toString�� �������̵��Ѵٸ� ������µȴ�
		User2 user = new User2(1,"ssar","1234");
		System.out.println(user);
		
		
		// String���� reference�������̱⶧���� 
		// �ڵ����� toString();�� �����Ѵ�
		String s = "�ȳ�";
		System.out.println(s); // System.out.println(s.toString()); �Ͱ��� ����� ������

		
	}
}
