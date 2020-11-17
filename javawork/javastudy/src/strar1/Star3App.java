package strar1;
// 1. Zealot, Drgoon, Tank, SCV, DarkTempler => StarUnit으로 묶는다 타입 일치 [상속 or 인터페이스]
// 2.



public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		// 구동에 필요한것
		// 1. 객체들을 묶을 상위 추상클레스 필요 (StarUnit 클레스)
		// 2. StarUnit클래스에서 공격에 사용할 attack(){} 추상 메소드 구현
		// 3. 자식 클래스들은 모두  attack(){} 메소드 구현 및 각 상태 getter, setter 구현
		// 4. 자식 클래스간 상태를 각자의 행위로 변환시키기위해서 StarUnit클래스에서 getter와 setter구현
		// 4-1. 이러한 이유는 오버라이딩시 최하위 메소드만 실행하기 때문임
		// 4-2. getter와 setter을 기반으로 attack함수 스텍부분 구현
		// 5. 마지막으로 실행시킬 메인클레스위에 
		
		u1.attack(u1,u2);
	}
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1", 100, 10);
		Zealot z2 = new Zealot("질럿2", 100, 10);
		Tank t1 = new Tank("탱크1", 200, 20);
		SCV SC1 = new SCV("SCV1", 50, 5);
			
		Star3App.attack(z1,z2);
		Star3App.attack(SC1, t1);
		Star3App.attack(t1, SC1);
		Star3App.attack(t1, z2);
		Star3App.attack(t1, z2);
	}
}
