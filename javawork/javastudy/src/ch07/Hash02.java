package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Hash02 {
public static void main(String[] args) {
	// �������� ���ڸ� �������ִ� Ŭ����
	Random r = new Random();
	Set<Integer> lotto = new HashSet<>();
	
	
	while(true) {
	
		int num = r.nextInt(45)+1;
	
	
				lotto.add(num);
	
			if(lotto.size() == 6) {
				break;
			}
		}
		
		
	
//	Collections.sort(lotto); //���������̴�
	//�ڱ� �÷���.iterator -> iterator�� �ٹٲ�
	Iterator<Integer> it = lotto.iterator();
	
	//9, 10, 20, 30, 40, 41
	while(it.hasNext()) {//���� ������ true, ������ flase
		System.out.print(it.next()+ " "); //���� �ε����� ���� ���� +�ε��� ���� 
	}

	
	
}}
