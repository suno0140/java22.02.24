package chap09.lecture.p01nested;

public class MyClass7 {
	void method1(final int param) {
		//지역 클래스에서 지역변수(또는 파라미터)사용시 주의할점
		//지역변수(또는 파라미터)는 final 이어야함
		//단, 값이 변경 되지 않으면 생략 가능(effectively final)
		final int i = 3; //앞에 final이 생략되어있다면 값 변경불가능
		
		
		class LocalClass1 {
			void method2() {
				System.out.println(i);
			}
			
			void method4() {
				System.out.println(param);
				//param = 4;//xx 값 변경불가능
			}
		}				
	}
}
