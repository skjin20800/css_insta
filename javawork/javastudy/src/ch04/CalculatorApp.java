package ch04;

//���� 10, 5�� ���ؼ�!1
//�� ������� ���� 20�� ���ؼ�
//�� ������� ���� 5�� ������
//�� ������� 100�� �� ���� ȭ�鿡 ����Ͻÿ�.

public class CalculatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 0;
		
		Calculator a = new Calculator();
		sum = a.add(10, 5);
		sum = a.multi(sum, 20);
		sum = a.divid(sum, 5);
		sum = a.minus(sum, 100);
		System.out.println(sum);
		
	}
}
