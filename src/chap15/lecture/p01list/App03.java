package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		//처음인사람은 합계만 구해보기
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		
		//향상된for문으로 구하는방법
		sum = 0;
		for(int item : list) {
			sum += item;
		}
		System.out.println(sum);
		
		//평균내는법
		System.out.println(sum / (double) list.size());
	}
}
