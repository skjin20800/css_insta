package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
		public String getData() {
			InputStream in = System.in; //int�� ���� 1���޴µ� �ƽ�Ű�ڵ� ���ڷι���
			InputStreamReader ir = new InputStreamReader(in); // �ƽ�Ű�ڵ���ڸ� ���ڷ� �ٲٴµ� 1���� ����
			BufferedReader br = new BufferedReader(ir); //1���� �޴µ� ������ ��Ҵٰ� �ѹ��� �������
		
			try {
			return br.readLine();
			}catch (IOException e) {
				System.out.println("������");
			}
			return "";
			
	}
}
