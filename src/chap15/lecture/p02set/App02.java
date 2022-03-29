package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		//Lotto : 1~45의 임의의 값 6개

		//1~45의 임의의 값 6개를 중복업시 출력 하는 코드작성
		Set<Integer> set = new HashSet<>();

		while (set.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);
			
			set.add(num);

		}

		System.out.println(set.size()); //6 or not(중복시)
		
		System.out.println(set); //임의의 값 6개
	}
}
