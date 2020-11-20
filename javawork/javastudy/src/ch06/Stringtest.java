package ch06;

public class Stringtest {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(" ,C++");

		System.out.println(a + "의 길이는" + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // 문자열의 포함관계
		
		a = a.concat(b); //문자열 연결
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "이걸로바꾸장"); //해당 문자를 바꾸는것
		System.out.println(a);
		
		String s[] = a.split(","); //문자열 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		
		//인덱스는 0부터시작
		char c = a.charAt(4); // 인덱스 4번째의 문자 리턴 
		System.out.println(c);
		
		a = a.substring(4); //인덱스 4부터 끝까지 출력
		System.out.println(a);
		
	 a = a.toLowerCase(); //소문자로 바꾸기
	 System.out.println(a);
	 
	 a = a.toUpperCase(); //대문자로 바꾸기
	 System.out.println(a);
	 
	 int z1 = a.compareTo(b); //문자열 큰지 작은지 비교
	 System.out.println(z1); // a가 b보다 크면 양수, 작으면 음수, 같으면 0
	 
	}
}
