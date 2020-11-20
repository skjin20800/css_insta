package ch06;



public class Wrapper {
	public static void main(String[] args) {
		int num = 10;
		
		//Integer = reference이다
		//숫자 - > 문자로 바꾼다
		Integer num2 = 20;
		String num3 = num2.toString();
		
		//방법 A
		//Integer를 String형으로 바꾸는법
		System.out.println(num3);
		// 방법B
		//Int형을 String형으로 바꾸는법
		String num4 = num +"";
		System.out.println(num4);
		
		//Integer가 들고있는 함수(parseInt())로 String을 int형으로 바꾼다
		//문자 -> 숫자로 바꾼다
		String num5 = "50";
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
	}
}
