package ch02;

public class Var02 {
	public static void main(String[] args) {
		// Code 부분
		int num = 10; //4Byte = 32bit = 42억9천(-21억~ =21억)
		
		long num2 = 100; // 8Byte = 64bit = 경단위 저장
		
		char s = 'A'; //2Byte = 8bit
		
		double d = 7.5; //8Byte = 64bit = 42억 9천 (20억 ~ +20억) 추가 소수점 이하
		
		boolean b = true; // 1bit
		
		num = (int)d; // 값 7 (명시적 형변환 (다운 캐스팅 - 자료 유실))
		
		num = (int)num2; // 명시적 형변환 (다운 캐스팅)
									//작은저장공간 (4Byte) 에서 큰 저장공간(8Byte)을 담을순 없음,
									//큰쪽에서 작은쪽은 담을수 있음 so 명시적 형변환 필요
		
		num2= num; //묵시적 형변환 (업 캐스팅)
	} // end of main
}