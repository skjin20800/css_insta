package ch03;

public class if01 {
public static void main(String[] args) {
	
	//표현식 if라인이 걸리면 내부스텍 바로실행 ,참일때만 실행
	if(true)
		{System.out.println("트루임둥");
	}
		if(false){
			System.out.println("트루임둥");
			
}
		int num = 0;
		if(num>1) {
			System.out.println("num은 1보다 큽니다");
		} else {
			//그게 아니라면
			System.out.println("num은 1보다 작습니다");
		}

		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum은 10임둥");
		}
		else if (sum == 20) {
			System.out.println("sum은 20임둥");
		}
		else {
			System.out.println("sum은 30임둥");
		} 
}}
