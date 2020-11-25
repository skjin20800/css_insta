package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {
public static void main(String[] args) {
	//ArrayList<String> list1 = new ArrayList<String>();//1.5버전엔 둘다 String 적어야함
	List<String> list1 = new ArrayList<>();
	list1.add("사과");
	list1.add("딸기");
	
	int size = list1.size();
	for (int i = 0; i < list1.size(); i++) {
		System.out.println(list1.get(i));
		
	}
	list1.add("바나나"); //추가
	System.out.println(list1.get(2));
	
	list1.add(1,"참외");
	System.out.println(list1.get(1));
	
	list1.remove(1);
	System.out.println(list1.get(1));
	
	list1.clear();
	System.out.println(list1.size());
}
}
