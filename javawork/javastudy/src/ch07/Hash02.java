package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Hash02 {
public static void main(String[] args) {
	// 랜덤으로 숫자를 생성해주는 클래스
	Random r = new Random();
	Set<Integer> lotto = new HashSet<>();
	
	
	while(true) {
	
		int num = r.nextInt(45)+1;
	
	
				lotto.add(num);
	
			if(lotto.size() == 6) {
				break;
			}
		}
		
		
	
//	Collections.sort(lotto); //오름차순이다
	//자기 컬렉션.iterator -> iterator로 다바뀜
	Iterator<Integer> it = lotto.iterator();
	
	//9, 10, 20, 30, 40, 41
	while(it.hasNext()) {//값이 있으면 true, 없으면 flase
		System.out.print(it.next()+ " "); //현재 인덱스의 값을 리턴 +인덱스 증가 
	}

	
	
}}
