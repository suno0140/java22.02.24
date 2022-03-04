package chap05.lecture.reftype;

public class C03ReferenceType {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		// 둘다 java 이지만 둘의 주소값이 다르기 때문에 false﻿		﻿
		int i1 = 3;
		int i2 = 3;
		
		System.out.println(i1 == i2);// true, 결국 stack 영역을 비교해서 같으면 true, 다르면 false	﻿
	}
}
