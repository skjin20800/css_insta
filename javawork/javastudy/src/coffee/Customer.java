package coffee;

//����
//å�� : �ֹ�(), �Ա�()
public class Customer {

	public void order(Barista b1) {
		//�ٸ���Ÿ���� �޼����� ����
		Coffee c = b1.makeCoffe();
		System.out.println(c.getName()+"�� ���Խ��ϴ�.");
		eat(c);
	}
	
	public void eat(Coffee c) {
		System.out.println(c.getName()+"�� �Խ��ϴ�.");
	}
}