package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment {
	private int id;
	private String content; //댓글
}

public class Json01 {
	public static void main(String[] args) {
		Comment ct1 = new Comment(1,"댓글1");
		//자바 -> JSON(String)
		Gson gson = new Gson(); // Gson클래스 객체생성
		String ct1Json = gson.toJson(ct1); //ct1Json이라는 문자열에 = toJson으로 ct1를 Json으로 변환
		System.out.println(ct1Json);
		
		// JSON(String)-> 자바
		
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		//Comment 클래스-ct2변수에 gson.fromJson을 이용해서 클래스삽입
		//gson.fromJson(json값,넣을클래스)
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
	}
}
