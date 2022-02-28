package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		myMethod1(300);
		System.out.println("명령문2");
		myMethod1(3);
		System.out.println("명령문3");
	}
	
	// 메소드명 : lowerCamelCase
	// ( ) 에 파라미터 타입과 파라미터 이름 작성 가능
	// 파라미터가 명시되어 있으면 호출할때 파리미터값 반드시 작성
	
	public static void myMethod1(int i) {
		System.out.println("마이메소드 1");
		System.out.println("파라미터 i의 값 : " + 1);
		
	}
}
