package ch04;

//숫자 10, 5를 더해서!1
//그 결과값과 숫자 20을 곱해서
//그 결과값을 숫자 5로 나누고
//그 결과값에 100을 뺀 값을 화면에 출력하시오.

public class CalculatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 0;
		
		Calculator a = new Calculator();
		sum = a.add(10, 5);
		sum = a.multi(sum, 20);
		sum = a.divid(sum, 5);
		sum = a.minus(sum, 100);
		System.out.println(sum);
		
	}
}
