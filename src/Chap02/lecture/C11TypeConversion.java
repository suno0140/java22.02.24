package Chap02.lecture;

public class C11TypeConversion {
	public static void main(String[] args) {
		// 정수 < == > 실수
		// 가장 많이 쓰니는 인트와 더블로 비교
		int i1 = 21_0000_0000;
		double d1 = 2_100_000_000.12345;

		// 실수가 더 넓은범위를 표현 그래서 정수 -> 실수 가능 : 자동 형변화

		int i2;
		double d2;

		i2 = i1;
		d2 = i1; // ok
		System.out.println(i2);
		System.out.println(d2);

		// 실수 -> 정수 : 강제 형변환

		i2 = (int) d1; // type casting
		d2 = d1;
		System.out.println(i2);
		System.out.println(d2);
		
	}
}
