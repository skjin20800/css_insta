package review;

import lombok.Data;

/*
 *@author ����ȣ
 * static�� main�� �����ϱ� ���� �޸𸮿� �ε��ȴ�.
 * �� ���� static �����ʹ� �ߺ��� �� ����, �� �ѹ��� �޸𸮿� �ε��Ǳ� ����!!
 * �ΰ��� �޸𸮿� �� �� ����. => static �����ʹ� ������ �� �ִ� ������!!
 * 
 * heap�� new�� �� �޸𸮿� ���. Ÿ�̹��� ������ static���� ����
 * �����ڰ� ���ϴ� ��ŭ �޸𸮿� �ε��� �� ����.
 * ���� �����Ͱ� �ƴϰ� �� ���� �����͸� ���� ������ ����.
 * �ڵ��� ���忡�� �ҳ�Ÿ 3�븦 ���� �Ǹ� �ϸ� 3���� �ҳ�Ÿ�� �ٸ� �ҳ�Ÿ�̴�.
 * 
 */

@Data
public class Ex07 {

	int num = 10; // �ȶ� new�ؾ� �� (heap����, �ʵ�,[�Ӽ�, ������Ƽ, ������� �� ��������])
	static int sum = 20; //main�� ���۵Ǳ� ���� ��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ex07.sum);
		
		Ex07 e = new Ex07();
		System.out.println(e.toString());
		
	}

}
