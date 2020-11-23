package review;

import lombok.Data;

@Data //toString()이 오버라이딩됨, Getter, Setter가 만들어짐
class Product{
	int no; //상품번호
	int price; //상품가격
	String name; //상품이름
}


public class Ex04 {
	
	public static void main(String[] args) {
		// 클래스 자료형(여러가지 데이터 타입이 섞여 있을때)
		Product a = new Product();
System.out.println(a);
	}

}
