package chap09.lecture.p01nested;

public class MyClass2 {
	//static 멤버에서 instance 멤버에 접근할 수 없다.

	//static 중첩 클래스
	static class NestedClass1 {
		//필드
		int field; //인스턴스 필드 작성 가능
		static int field2; //스태틱 필드도 작성가능

		//메소드
		//인스턴스 메소드,스태틱메소드 작성가능
		void method1() {

		}

		static void method2() {

		}
	}

	//intstance 중첩 클래스(앞에 static 이 붙지않은 중첩클래스)
	class NestedClass2 {
		//필드
		int field1;
		//static int field2; //static field 가질 수 없음
		static final int FIELD3 = 3; //static final 은 가능

		//메소드
		void method1() {

		}
		//static void method2() {//static method 가질수 없음

	}
}
