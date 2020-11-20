package ch07;

import lombok.Data;

//제네릭
// 뭐가들어올지 모를때
//1. Object를 사용 - 번거러워서 사용안한다
//2. <>타입사용한다
//2-1 <>타입은 들어올때 <>타입안에 명시된 타입으로 들어온다
//2. T(대문자 아무거나 사용 사용
//2-1 T.는 정해지지 않은 타입
@Data
class ResponseDto<T>{
	private int statusCode;// 200(성공), 300(다시요청), 400(잘못된 요청)
	private T data;
}



public class Generic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResponseDto <Integer>dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
		
		
		
		System.out.println(dto.getStatusCode());
		
		
		if(dto.getStatusCode() ==200) {
			System.out.println(dto.getData());	
		}
		
	}
}
