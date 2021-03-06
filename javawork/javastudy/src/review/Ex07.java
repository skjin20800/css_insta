package review;

import lombok.Data;

/*
 *@author 최주호
 * static은 main이 시작하기 전에 메모리에 로딩된다.
 * 그 말은 static 데이터는 중복될 수 없음, 단 한번만 메모리에 로딩되기 때문!!
 * 두개가 메모리에 뜰 수 없음. => static 데이터는 공유될 수 있는 데이터!!
 * 
 * heap은 new할 때 메모리에 뜬다. 타이밍은 무조건 static보다 늦음
 * 개발자가 원하는 만큼 메모리에 로딩할 수 있음.
 * 공유 데이터가 아니고 각 각이 데이터를 따로 가지고 있음.
 * 자동차 공장에서 소나타 3대를 찍어내서 판매 하면 3개의 소나타는 다른 소나타이다.
 * 
 */

@Data
public class Ex07 {

	int num = 10; // 안뜸 new해야 뜸 (heap변수, 필드,[속성, 프로퍼티, 멤버변수 다 같은말임])
	static int sum = 20; //main이 시작되기 전에 뜸
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ex07.sum);
		
		Ex07 e = new Ex07();
		System.out.println(e.toString());
		
	}

}
