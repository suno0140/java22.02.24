package chap15.lecture.p01list;

import java.util.ArrayList;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); //auto boxing
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);
		
		//최대값, 최소값 구하는 코드를 작성
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.size(); i++) {
			max = Math.max(list.get(i), max);
			min = Math.min(list.get(i), min);			
		}
		System.out.println(max); //8
		System.out.println(min); //1
		
		//향상된 for 문으로도 구해볼 수 있음
		for(Integer e : list) {
			max = Math.max(e, max);
			min = Math.min(e, min);
		}		
		System.out.println(max); //8
		System.out.println(min); //1
	}
}
