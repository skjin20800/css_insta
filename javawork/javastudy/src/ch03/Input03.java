package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
	public static void main(String[] args) {
		InputStream in = System.in; //int�� ���� 1���޴µ� �ƽ�Ű�ڵ� ���ڷι���
		InputStreamReader ir = new InputStreamReader(in); // �ƽ�Ű�ڵ���ڸ� ���ڷ� �ٲٴµ� 1���� ����
		BufferedReader br = new BufferedReader(ir); //1���� �޴µ� ������ ��Ҵٰ� �ѹ��� �������
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
