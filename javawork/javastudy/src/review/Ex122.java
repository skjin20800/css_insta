package review;

//������ ���α׷�
class �����{
	
	String data;
	
	String �ٿ�ε�() {
		data = "GTA5 ����";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("�����Һ�");
		} //1000 = ��
		return data;
	}
}


// �ڹٴ� �޼��带 �Լ��� �Ű������� ������ �� ����
// �ڹٴ� �޼��带 �Լ��� �Ű������� �����ϰ� ������ ������ �������̽��� �Լ��� ��ƾ��Ѵ�.
// �׷��� �ϱ� ���ؼ� �������̽��� �̷���� �͸�Ŭ������ �ѱ��

// �������̽��� �޼��带 �����Ҷ� ����Ѵ�,
// �޼��带 �����Ҷ� �������̽��� ���� �Լ��� �����ϸ� �͸�Ŭ������ �����Ѵ�.
public class Ex122 {

	public static void main(String[] args) {
		����� s = new �����();
		String game = s.�ٿ�ε�();
		
		System.out.println(game+" ����");
		
	}
}
