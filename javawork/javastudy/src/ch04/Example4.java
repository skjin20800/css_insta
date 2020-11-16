package ch04;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
class Rectangle {
	int x;
	int y;
	int width;
	int height;

	int square() {
		int a = width * height;
		return a;
	}

	void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}

	boolean contains(Rectangle r) {
		int a1 = r.width * r.height;
		int a2 = this.width * this.height;

		int h1 = this.x + (this.width / 2);
		int h2 = this.x - (this.width / 2);

		int hh1 = r.x + (r.width / 2);
		int hh2 = r.x - (r.width / 2);

		int yh1 = this.y + (this.height / 2);
		int yh2 = this.y - (this.height / 2);

		int yhh1 = r.y + (r.height / 2);
		int yhh2 = r.y - (r.height / 2);

		if (a2 > a1 && h1 >= hh1 && h2 <= hh2 && yh1 >= yhh1 && yh2 <= yhh2) {
			return true;
		} else {
			return false;
		}
	}
}

public class Example4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");

	}

}
