package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class job {
	String name = "����";


}

class Police extends job {

	String name = "����";

	public String getName() {
		return name;
	}
}

class Docter extends job {
	String name = "�ǻ�";

	public String getName() {
		return name;
	}
}

public class Array02 {

	public static void main(String[] args) {

		job[] a = new job[2];

		a[0] = new Police();
		a[1] = new Docter();

		System.out.println(a[0].getName());
		System.out.println(a[1].getName());

	}
}
