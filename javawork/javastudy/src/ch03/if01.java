package ch03;

public class if01 {
public static void main(String[] args) {
	
	//ǥ���� if������ �ɸ��� ���ν��� �ٷν��� ,���϶��� ����
	if(true)
		{System.out.println("Ʈ���ӵ�");
	}
		if(false){
			System.out.println("Ʈ���ӵ�");
			
}
		int num = 0;
		if(num>1) {
			System.out.println("num�� 1���� Ů�ϴ�");
		} else {
			//�װ� �ƴ϶��
			System.out.println("num�� 1���� �۽��ϴ�");
		}

		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum�� 10�ӵ�");
		}
		else if (sum == 20) {
			System.out.println("sum�� 20�ӵ�");
		}
		else {
			System.out.println("sum�� 30�ӵ�");
		} 
}}
