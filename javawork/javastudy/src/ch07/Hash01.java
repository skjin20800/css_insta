package ch07;

import java.util.HashMap;
import java.util.Map;

public class Hash01 {
public static void main(String[] args) {
	//해쉬맵은 key, value로 값을 입력할 수 있음
	// 찾을 때는 key 값으로 찾을 수 있음
	Map<String, String> hash = new HashMap<>(); // 좀더 큰 개념인 Map으로 타입을 잡는다
	
	hash.put("name", "홍길동");
	hash.put("username", "ssar");
	hash.put("phone", "01022227777");
	
	System.out.println(hash.get("phone"));
	System.out.println(hash.containsKey("name"));
	System.out.println(hash.containsValue("ssar"));
}
}
