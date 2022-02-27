package Chep02.lecture;

public class C09TypeConversion {
	public static void main(String[] args) {
		byte b1 = 120;
		short s1 = 30000;
		int i1 = 2100000000;
		long l1 = 4200000000L; // long type의 literal 은 끝에 L 을 붙여야 한다.
		
		byte b2;
		short s2;
		int i2;
		long l2;
		
		b2=b1;
		System.out.println(b2);
		s2 = b1;
		System.out.println(s2);
		i2 = b1;
		System.out.println(i2);
		l2 = b1;
		System.out.println(l2);
		
		s2 = s1;
		i2 = s1;
		l2 = s1;
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		
		
		b2 =(byte) s1; // b=1byte, s=2byte 라서원래 안되는데 강제 형변환(type casting), 값이 의도한대로 안나올수있다.
		System.out.println(b2);
		
		b2 = (byte) i1; // 강제 형변환
		s2 = (short) i1; // 강제 형변화
		i2 = i1;
		l2 = i1;
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		
		b2 = (byte) l1;
		s2 = (short) l1;
		i2 = (int) l1;
		l2 = l1;
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		
		
		// char -> int 변환 가능
		// char -> long 변환 가능
		char c1 = '가';
		i2 = c1;
		l2 = c1;
		System.out.println(i2);
		System.out.println(l2);
		
	}
}
