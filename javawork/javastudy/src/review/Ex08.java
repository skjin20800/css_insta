package review;

public class Ex08 {
	
	//void�� return�� ����. add�� �����̸�, () �Լ�, 
	// int n1, n2, �Ű�����(argument)�̴�
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	int minus(int n1, int n2) {
		return n1-n2; // �Լ��� ȣ���� ������ ���� n1-n2�� �����
	}
	
public static void main(String[] args) {
	Ex08 e = new Ex08();
	//2,4�� �μ���� �θ�.
	e.add(2, 4);//�Լ��� ȣ��(13�� ���ο��� 7������ ������ �ٽ� 13���������� ���ƿ´�)
	
	int result = e.minus(10,5);
	System.out.println(result);
	
}
}
