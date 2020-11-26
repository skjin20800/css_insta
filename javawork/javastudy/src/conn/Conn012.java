package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn012 {

	public static void main(String[] args) {
		try {
			// 1. 주소설정 URL 클래스 사용
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%A4%EB%8A%98%EC%9D%98+%EC%98%A8%EB%8F%84");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			FileWriter fout = null;
			
		
			//3. 버퍼연결(8192Byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input=null;
			String download = "";
			while((input = br.readLine()) != null) {
				download = download + input;
			}
			
			download = download.replace("<div class=\"info_data\"> <p class=\"info_temperature\"><span class=\"todaytemp\">", "JKBtoday");
			download = download.replace("</span><span class=\"tempmark\"><span class=\"blind\">도씨</span>℃</span> </p> <ul class=\"info_list\"> <li> <p class=\"cast_txt\">", "JKBendday");
			String s[] = download.split("JKBtoday");
			String s1[] = s[1].split("JKBendday");
			System.out.println("오늘의 온도 "+s1[0]);
			

			try {
				fout = new FileWriter("d://index.html");
							fout.write(download.toString());
						fout.close();
			} catch (Exception e) {
				System.out.println("오류");
				// TODO: handle exception
			}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
// 