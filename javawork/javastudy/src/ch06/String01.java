package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO = Data Transfer Object = ��ſ��� ���� ����.
@Data
@NoArgsConstructor
@AllArgsConstructor
class UserDto{
	private int id;
	private String name;
	
}
//�Ľ�(���� �м�)
//���ڿ��� �ǹ��ִ� �����ͷ� �ڸ��°�

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿      ";
		String data1 = new String(data);
		UserDto dto = new UserDto();
		
		data1 = data1.trim();
		String s1[] = data1.split(":");
		String s2[] = s1[1].split(",");
		//s2[0] == 1, s1[2] == ȫ�浿 
		
		try {
			dto.setId(Integer.parseInt(s2[0]));	

		} catch (Exception e) {
			System.out.println("�����Һ�");
		}
		dto.setName(s1[2].toString());
		
		System.out.println(dto);
	}
}
