package ch05;

public abstract class Factory {
	protected abstract void ��ĥ();
	protected	void ����() {
		System.out.println("���� ��ī��");
	}
	
	public void ����() {
		��ĥ();
		����();
	}
	
}
