package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> {
	private int code; // 200(����), 400(����) //enum���� ����� �� ����
	private T data;
}

public class Generic04 {
	//RespDto�� Ÿ���� ���ε����� �𸣰ڴ�
	//RespDto�� ���κ��� TŸ���� data�� ���� ���� �Ǵ��ϰڴ�
	// �� ������ String ���ڰ��� �Ʒ� ���ǹ��� ��ġ�ϴ� ������Ÿ���� �����ϰڴ�.
	static RespDto<?> getData(String username) { //����ǥ�� �Լ����� �ɼ��ִ�
		
		// ���� �̸��� ssar�̸�
		// RespDto�� Ÿ���� User�� �����ϰ� dto ������ �ش� ������ ���� �����Գְڴ�.
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
			//�ƴϸ�
			//RespDto�� Ÿ���� Error�� �����ϰ� dto ������ �ش� ������ ���� �����Գְڴ�.
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar2");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}


