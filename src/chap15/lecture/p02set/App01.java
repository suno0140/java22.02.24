package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		//Set : 순서 없고, 중복 X
		//구현클래스 : HashSet
		
		Set<String> set = new HashSet<>();
		
		//add : element 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		//size : 크기
		System.out.println(set.size()); //4
		
		set.add("rm"); //중복XX
		System.out.println(set.size()); //4
		
		//탐색 (set에는 인덱스가 없기때문에 get메소드가 없고 그냥for문도 불가능)
		//향상된for문 또는 Iterator
		for(String item : set) {
			//순서 보장 안됨
			System.out.println(item);
		}
		
		//Iterator (while문과 궁합이 잘 맞음)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//remove 삭제
		set.remove("rm");
		System.out.println(set.size()); //3
		set.remove("winter");
		System.out.println(set.size()); //3
		
		//element 있는지? true,false
		System.out.println(set.contains("rm")); //false
		System.out.println(set.contains("jin")); //true
	}
}
