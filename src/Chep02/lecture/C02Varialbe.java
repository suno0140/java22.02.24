package Chep02.lecture;

public class C02Varialbe {
	public static void main(String[] args) {
		// 변수의 사용 범위 (scope) : 선언된 블럭 {} 안 에서만 사용 가능
		
		boolean b = true;
		
		// int a = 4;
		if (b) {
			int a = 3;
			System.out.println(a);
		}
		
		//System.out.println(a);
	}

}
