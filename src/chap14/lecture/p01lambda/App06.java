package chap14.lecture.p01lambda;

public class App06 {
	public static void main(String[] args) {
		int local = 0; //만약 로컬변수를 쓴다면 final or effectively final 이여야한다.
		MyInterface6 o1 = new MyInterface6() {
			@Override
			public void method1() {
				System.out.println(local);
			}
		};
		//local = 4; 로벌이 변하면 사용 불가
		MyInterface6 o2 = () -> System.out.println(local);
		
	}
}

@FunctionalInterface
interface MyInterface6 {
	void method1();
}
