package ch06;

public class Stringtest {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(" ,C++");

		System.out.println(a + "�� ���̴�" + a.length()); // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#")); // ���ڿ��� ���԰���
		
		a = a.concat(b); //���ڿ� ����
		System.out.println(a);
		
		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		
		a = a.replace("C#", "�̰ɷιٲ���"); //�ش� ���ڸ� �ٲٴ°�
		System.out.println(a);
		
		String s[] = a.split(","); //���ڿ� �и�
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		}
		
		//�ε����� 0���ͽ���
		char c = a.charAt(4); // �ε��� 4��°�� ���� ���� 
		System.out.println(c);
		
		a = a.substring(4); //�ε��� 4���� ������ ���
		System.out.println(a);
		
	 a = a.toLowerCase(); //�ҹ��ڷ� �ٲٱ�
	 System.out.println(a);
	 
	 a = a.toUpperCase(); //�빮�ڷ� �ٲٱ�
	 System.out.println(a);
	 
	 int z1 = a.compareTo(b); //���ڿ� ū�� ������ ��
	 System.out.println(z1); // a�� b���� ũ�� ���, ������ ����, ������ 0
	 
	}
}
