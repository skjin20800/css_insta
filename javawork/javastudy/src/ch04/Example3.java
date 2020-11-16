package ch04;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
class Song{
	String title;
	String artist;
	int year;
	String country;
	
	void show(String title, String artist, int year, String country) {
		System.out.println(year + "�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}

public class Example3 {

	public static void main(String[] args) {
		Song a = new Song();
		a.show("Dancing Queen","ABBA", 1978,"������");

	}

}
