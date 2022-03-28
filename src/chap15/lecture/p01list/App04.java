package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App04 {
	//List : 순서가 있고, 중복 허용됨. (제네릭타입)
	//구현 클래스: ArrayList, Vector, LinkedList
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		//element 추가
		list1.add("jimin"); //index 0
		list1.add("v"); //index 1
		list1.add("jungkuk"); //index 2
		
		//element 탐색
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
		//String s1 = list1.get(3); //Exception발생
		System.out.println(s1); //jimin
		System.out.println(s2); //v
		System.out.println(s3); //jungkuk
		
		//element 변경
		list1.set(0, "suga");
		System.out.println(list1); //suga, v, jungkuk
		
		//element 삭제
		list1.remove(1); //지우면 지운칸을 한칸씩 앞당긴다.
		System.out.println(list1); //suga, jungkuk
		System.out.println(list1.get(1)); //jungkuk
	}
}
