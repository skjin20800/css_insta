package review;

import lombok.Data;

@Data //toString()�� �������̵���, Getter, Setter�� �������
class Product{
	int no; //��ǰ��ȣ
	int price; //��ǰ����
	String name; //��ǰ�̸�
}


public class Ex04 {
	
	public static void main(String[] args) {
		// Ŭ���� �ڷ���(�������� ������ Ÿ���� ���� ������)
		Product a = new Product();
System.out.println(a);
	}

}
