package chap05.lecture.array;

import java.util.Arrays;

public class C13ArrayCopy {
	public static void main(String[] args) {
		int[][] a = { { 3, 5 }, { 10, 11, 12 }, { 10, 20 } };
		int[][] b = a;

		b[0][0] = 99;
		System.out.println(a[0][0]); // 99

		int[][] c = Arrays.copyOf(a, a.length); // a와는 다른 주소의 c가 만들어진다.
		System.out.println(c[0][0]); // 99

		c[0][0] = 999;
		System.out.println(c[0][0]); // 999
		System.out.println(a[0][0]); // 999
		// a 와 c 의 참조값은 다르다. 하지만 [n][n] 참조값 안의 참조값은 같은상황

		c[0] = new int[] { 22, 23 };
		System.out.println(c[0][0]); //22
		System.out.println(a[0][0]); //999
		
		b[0] = new int[] { 11, 12 };
		System.out.println(b[0][0]); //11
		System.out.println(a[0][0]); //11
	}
}
