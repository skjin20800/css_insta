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
	private int code; // 200(정상), 400(실패) //enum으로 만들면 더 좋음
	private T data;
}

public class Generic04 {
	//RespDto의 타입이 뭘로들어올지 모르겠다
	//RespDto의 내부변수 T타입의 data로 값을 보고 판단하겠다
	// 즉 들어오는 String 인자값이 아래 조건문과 일치하는 데이터타입을 정의하겠다.
	static RespDto<?> getData(String username) { //물음표는 함수에만 걸수있다
		
		// 만약 이름이 ssar이면
		// RespDto의 타입을 User로 정의하고 dto 변수에 해당 생성자 값을 저렇게넣겠다.
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
			//아니면
			//RespDto의 타입을 Error로 정의하고 dto 변수에 해당 생성자 값을 저렇게넣겠다.
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar2");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}


