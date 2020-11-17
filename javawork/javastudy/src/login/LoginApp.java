package login;

//사용자가 로그인할 때 -> 페이스북, 네이버
public class LoginApp {

	static void userInfo(OAuth o) {
		System.out.println( "로그인한 사용자 = " + o.oauthProvider());
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	
	public static void main(String[] args) {
		Facebook f = new Facebook(); //로그인하면 자동으로 만들어짐
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);
		
	}

}
