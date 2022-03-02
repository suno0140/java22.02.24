package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i); // i = index 너무 많이 사용해서 i 로 자주씀
		} // 0 , 1 , 2
		
		int i; // for 문 종료 후에도 사용하기 원할 때 for문 이전에 선언
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		} // 0, 1, 2, 3, 4
		
		System.out.println(i); // 5
	}
}
