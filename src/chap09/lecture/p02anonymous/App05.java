package chap09.lecture.p02anonymous;

import chap09.lecture.p02anonymous.MyAbstracClass1;

public class App05 {
	public static void main(String[] args) {
		MyAbstracClass1 o1 = new MyAbstracClass1() {
			@Override
			public void method1() {
				System.out.println("퍼블릭 메소드 재정의");
			}
			
			@Override
			public void method2() {
				System.out.println("프로텍티드 메소드 재정의");
			}
			
			@Override
			public void method3() {
				System.out.println("패키지프라이빗 메소드 재저의");
			}
		}; //하나의 명령문 뒤에는 세미콜론이 붙어야한다.
		
		o1.method1();
		o1.method2();
		o1.method3();
	}
}
