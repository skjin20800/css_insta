package ch07;

import lombok.Data;

//���׸�
// ���������� �𸦶�
//1. Object�� ��� - ���ŷ����� �����Ѵ�
//2. <>Ÿ�Ի���Ѵ�
//2-1 <>Ÿ���� ���ö� <>Ÿ�Ծȿ� ��õ� Ÿ������ ���´�
//2. T(�빮�� �ƹ��ų� ��� ���
//2-1 T.�� �������� ���� Ÿ��
@Data
class ResponseDto<T>{
	private int statusCode;// 200(����), 300(�ٽÿ�û), 400(�߸��� ��û)
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
