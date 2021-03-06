package SMS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id; // 번호 1, 2, 3, 4
	private String text; // 문자 메시지 내용
	private String to;// 누구한테 보낼지
	private int  errorCode; //
	private String sendTime;
}
