package ch05;

interface Nife{
	void �丮();
	default void ����() {};
}

// ����� �뵵


class ������ implements Nife{

	@Override
	public void �丮() {
System.out.println("�丮�غ��ô�");
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		������ ���� = new ������();
		����.�丮();
	}
}
