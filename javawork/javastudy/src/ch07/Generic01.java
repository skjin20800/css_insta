package ch07;

import lombok.Data;

//제네릭
// 뭐가들어올지 모를때
//1. Object를 사용 - 번거러워서 사용안한다
//2. <>타입사용한다
//2-1 <>타입은 선언시 <>타입으로 선언된 변수는 뭐가나올지 모를때 사용된다.
//2-2 <>타입은 main문에서 사용할 타입을 적어주면 그 타입으로 변수가 들어온다

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
