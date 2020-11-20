package SMS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test1 {
	String group_id;
	String error_list;
	String success_count;
	String error_count ;
	
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2Gi2Ec2aLXLuC2p\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
//		System.out.println(data.indexOf("{"));//0,55
		data = data.substring(1,89);
//		System.out.println(data.indexOf("}"));//0,55
//		System.out.println(data.lastIndexOf("}"));//0,55
		
		System.out.println(data);
		
		
		
		
		String [] a1 = data.split(",");
		String [] a2 = a1[0].split(":");
		String [] a3 = a1[1].split(":");
		String [] a4 = a1[2].split(":");
		String [] a5 = a1[3].split(":");
		a2[1] = a2[1].replace("\"", "");
		System.out.println(a2[1]);
		a3[2] = a3[2].replace("\"", "");
		System.out.println(a3[2]);
//		a4[1] = a4[1].replace("\"", "");
////		System.out.println(a4[1]);
//		a5[1] = a5[1].replace("\"", "");
////		System.out.println(a5[1]);
////		System.out.println(data);
//		Response res = new Response();
//		res.setGroup_id(a2[1]);
//		res.setError_list(a3[2]);
//		res.setSuccess_count(a4[1]);
//		res.setError_count(a5[1]);
		
//		System.out.println(res.error_list);
//		System.out.println("전체 리스트");
//		System.out.println(res);
		
//		if(!(res.getError_list().equals("") || res.getError_list() == null)){
//			//정상
//		} else {
//			//db에 넣기
//		}
		
		
	}
}
