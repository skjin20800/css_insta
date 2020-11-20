package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO = Data Transfer Object = 통신에서 많이 사용됨.
@Data
@NoArgsConstructor
@AllArgsConstructor
class UserDto{
	private int id;
	private String name;
	
}
//파싱(구문 분석)
//문자열을 의미있는 데이터로 자르는것

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:홍길동      ";
		String data1 = new String(data);
		UserDto dto = new UserDto();
		
		data1 = data1.trim();
		String s1[] = data1.split(":");
		String s2[] = s1[1].split(",");
		//s2[0] == 1, s1[2] == 홍길동 
		
		try {
			dto.setId(Integer.parseInt(s2[0]));	

		} catch (Exception e) {
			System.out.println("다이죠부");
		}
		dto.setName(s1[2].toString());
		
		System.out.println(dto);
	}
}
