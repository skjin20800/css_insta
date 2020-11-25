package coffee;

//고객
//책임 : 주문(), 먹기()
public class Customer {

	public void order(Barista b1) {
		//바리스타에게 메세지를 보냄
		Coffee c = b1.makeCoffe();
		System.out.println(c.getName()+"이 나왔습니다.");
		eat(c);
	}
	
	public void eat(Coffee c) {
		System.out.println(c.getName()+"을 먹습니다.");
	}
}
