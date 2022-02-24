package Chep02.lecture;

public class C03LiteralValue {
	public static void main(String[] args) {
		// 정수 literal
		System.out.println(10);
		
		// 실수 literal
		System.out.println(3.14);
		System.out.println(0.1);
		System.out.println(1.137294);
		
		// 문자 literal (하나의 문자)
		System.out.println('a');
		System.out.println('b');
		System.out.println('A');
		//System.out.println('AB'); // XX
		
		//System.out.println(''); // 빈문자도 불가능
		System.out.println(' '); // 스페이스 라는 문자 가능
		System.out.println('가');
		System.out.println('0'); // 0(숫자) 이라는 하나의 문자 가능
		System.out.println(); // 빈줄 하나 표현
		System.out.println('나');
		
		// 문자열 literal (0개 이상의 문자 나열)
		System.out.println("");
		System.out.println("A");
		System.out.println("ABC");
		System.out.println("가나다");
		System.out.println("🎂🎂🎂?"); // win + . (이모티콘 가능)
		System.out.println("Hello World#$@@");
		System.out.println("Hello\tWorld"); // \t 탭 (띄어씌기)
		System.out.println("Hello\nWorld"); // \n 다음줄
		System.out.println("I'm ironman");
		System.out.println("I am \"ironman\""); // \" 쓰면 큰 따옴표 안에 큰따옴표 가능
		System.out.println("backslash \\"); // \\ 연속 쓰면 하나 역슬래쉬 하나를 표현 가능
		
		// 논리(boolean) literal (true, false)
		System.out.println(true);
		System.out.println(false);?
	}
}
