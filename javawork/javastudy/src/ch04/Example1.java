package ch04;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
class TV{
	String name;
	int year;
	int inch;
	

	void show() {
		System.out.println(name + "���� ���� "+year+"����"+inch+"��ġ TV");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
	}
}
