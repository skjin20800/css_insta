package conn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn01 {

	public static void main(String[] args) {
		try {
			// 1. 주소설정 URL 클래스 사용
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%A4%EB%8A%98%EC%9D%98+%EC%98%A8%EB%8F%84");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			// conn = URL 주소에대한 논리적 경로
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
			//3. 버퍼연결(8192Byte) //conn의 주소값을 모아서 br에 넘긴다
			BufferedReader br =
					new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input=null;
			String download = "";
			while((input = br.readLine()) != null) { 
				download = download + input;
			}
			System.out.println(download);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}