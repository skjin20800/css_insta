package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
	public static void main(String[] args) {
		InputStream in = System.in; //int형 문자 1개받는데 아스키코드 숫자로받음
		InputStreamReader ir = new InputStreamReader(in); // 아스키코드숫자를 문자로 바꾸는데 1개만 받음
		BufferedReader br = new BufferedReader(ir); //1개씩 받는데 여러가 모았다가 한번에 출력해줌
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
