package jumpKing;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Data;

@Data
public class Princess extends JLabel {
	public Princess princess = this; // �÷��̾� ���ؽ�Ʈ
	private final static String TAG = "princess"; 
	private ImageIcon icPlayerLS, icPlayerRS, icPlayerLR, icPlayerRR; // ��,�� �̵� �̹���
	private  int princessX = 630; // ĳ���� �⺻ ���� X��
	private  int princessY = 430; // ĳƽ�� �⺻ ���� Y�� 
	
	public Princess() {
		init();
		setIcon(icPlayerRS);
		setSize(70, 70); // ������� ũ��
		setLocation(princessX, princessY); // �⺻ ������ġ
	}

	void init() {
		// ���� �̹���
		icPlayerRS = new ImageIcon("images/icPlayerRS.png"); // �̵�-������
		icPlayerRR = new ImageIcon("images/icPlayerRR.png"); // �̵�-��
	

		// ���� �̹���
		icPlayerLS = new ImageIcon("images/icPlayerLS.png");// �̵�- ������
		icPlayerLR = new ImageIcon("images/icPlayerLR.png");// �̵�- ��
	
	};
		
}
