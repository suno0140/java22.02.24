package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300);
		myMethod1(900);
		//myMethod1(3.14); // 이건 불가능 int 타입을 받기로 했으니까 더블타입 불가능
		myMethod1('가'); // 이런건 자동형변환 가능 더 작은 바이트? 라서
		
		int j= 999;
		myMethod1(j);
	}
	
	public static void myMethod1(int i) {
		System.out.println(i);
	}
}
