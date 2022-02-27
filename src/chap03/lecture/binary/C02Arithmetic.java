package chap03.lecture.binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		int n1 = 2000000000;
		int n2 = 1000000000;
		
		System.out.println(n1 + n2); // overflow , 계산가능한 값 이상으로 넘침

		int n3 = -2000000000;
		int n4 = -1000000000;
		
		System.out.println(n3 + n4); // underflow , 표현 가능한 범위를 넘어섬 아래로
		
		long n5 = 2000000000;
		long n6 = 1000000000;
		System.out.println(n5 + n6);
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		System.out.println((-n7) + (-n8)); // 값이 int 로 바껴서 long을 다시 앞에서 설정해주고 계산
	}
}
