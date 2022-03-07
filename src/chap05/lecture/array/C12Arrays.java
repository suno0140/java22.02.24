package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		int[] a = {-1, 9, 2, 3, 10};
		System.out.println(a); //[I@15db9742 (타입 @ 참조값)
		System.out.println(Arrays.toString(a)); // [-1, 9, 2, 3, 10]
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); // [-1, 2, 3, 9, 10]
		
		int[] b = new int[10];
		//for (int i = 0; i < b.length; i++) {
		//b[i]=5;
		//}
		Arrays.fill(b, 5);
		
		System.out.println(Arrays.toString(b));
	}
}
