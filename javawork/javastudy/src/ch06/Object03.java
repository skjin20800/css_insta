package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "홍길동"; //str1은 주소를 가지고있음
		String str2 = "홍길동";
		
		int num = 10;  //num은 값을 들고있음
		
		// ==은 최초 액세스한 메모리 공간의 내용을 비교
		// String은 주소값을 비교, num은 값을 비교

		System.out.println(str1 == str2);

		// String str3은 String Constant Pool에 저장된다
		// String str4는 heap에 저장된다
		// heap 내부의 Constant pool이 존재한다.
		String str3 ="임꺽정";
		String str4 = new String("임꺽정");
		
		// String의 Hash함수는 오버라이딩되서
		// 같은 문자열이면 같은 해쉬를 뽑아낸다.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		//때문에 값은 같지만 str3과 str4의 주소값이 달라 false이다
		System.out.println(str3 == str4);
		
		// equals
		// - ==으로 먼저 비교 같으면 true
		// - ==으로 비교했는데 false가 나오면 최종목적지의 값을 비교
		System.out.println(str3.equals(str4));
}
	
}
