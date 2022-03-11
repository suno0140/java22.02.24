package chap06.lecture.p04method;

public class Phone {
	//method overloading : method명이 같은 메소드를 여러개 만듦
	//같은 메소드명을 가져도
	//파라미터의 타입, 개수, 순서로 구분됨
	
	
	void call(String name) {
		System.out.println(name + "에게 전화검");
	}
	
	void call(int number) {
		System.out.println(number + "로 전화검");
	}
	
	void call(String name, int number) {	
	}
	
	void call(int number, String name) {
	}
	
	//int call(int number) {
	//	return 0;  리턴타입 다르다해도 불가능.
	//}
}
