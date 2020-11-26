package conn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn011 {

	public static void main(String[] args) {
		try {
			// 1. 주소설정 URL 클래스 사용
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%A4%EB%8A%98%EC%9D%98+%EC%98%A8%EB%8F%84");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			FileWriter fout = null;
			
			//3. 버퍼 쓰기
			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bww = new BufferedWriter(osw);
			bww.write("아아아아무개");
			
		//3. 버퍼읽기
			InputStream in = conn.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader brr = new BufferedReader(ir);
			brr.read();
		
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
// 