package ch06;



public class Wrapper {
	public static void main(String[] args) {
		int num = 10;
		
		//Integer = reference�̴�
		//���� - > ���ڷ� �ٲ۴�
		Integer num2 = 20;
		String num3 = num2.toString();
		
		//��� A
		//Integer�� String������ �ٲٴ¹�
		System.out.println(num3);
		// ���B
		//Int���� String������ �ٲٴ¹�
		String num4 = num +"";
		System.out.println(num4);
		
		//Integer�� ����ִ� �Լ�(parseInt())�� String�� int������ �ٲ۴�
		//���� -> ���ڷ� �ٲ۴�
		String num5 = "50";
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
	}
}
