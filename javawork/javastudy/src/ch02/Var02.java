package ch02;

public class Var02 {
	public static void main(String[] args) {
		// Code �κ�
		int num = 10; //4Byte = 32bit = 42��9õ(-21��~ =21��)
		
		long num2 = 100; // 8Byte = 64bit = ����� ����
		
		char s = 'A'; //2Byte = 8bit
		
		double d = 7.5; //8Byte = 64bit = 42�� 9õ (20�� ~ +20��) �߰� �Ҽ��� ����
		
		boolean b = true; // 1bit
		
		num = (int)d; // �� 7 (����� ����ȯ (�ٿ� ĳ���� - �ڷ� ����))
		
		num = (int)num2; // ����� ����ȯ (�ٿ� ĳ����)
									//����������� (4Byte) ���� ū �������(8Byte)�� ������ ����,
									//ū�ʿ��� �������� ������ ���� so ����� ����ȯ �ʿ�
		
		num2= num; //������ ����ȯ (�� ĳ����)
	} // end of main
}