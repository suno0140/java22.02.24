package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리연산자
		// &&(and short circuit), ||(or short circuit) 
		// &(and), |(or), ^(XOR), !
		// 피연산자 : boolean
		// 연산결과 : boolean
		
		// and &&
		// 양변 모두 ture일 때만 true, 나머지 모두 false
		System.out.println("and &&");
		System.out.println(true && true); //true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// or ||
		// 양변 모두 false일 때만 false, 나머지 모두 true
		System.out.println("or ||");
		System.out.println(true || true); //true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// short circuit (앞 에 트루 펄스 만 보고 결과를 알수 있다면 뒤를 보지않음)
		int i = 3;
		System.out.println((i > 0)&&(i++ > 0)); // true
		System.out.println(i); // 4
		
		System.out.println((i < 0)&&(i++ < 0)); // false 단락연산(short circuit)이 일어남
		System.out.println(i); // 4 (단락연산 아니였다면 5 가 나타남)
		
		System.out.println((i < 0) || (i++ < 0));
		System.out.println(i); //5
		
		System.out.println((i > 0) || (i++ > 0)); // short circui
		System.out.println(i); // 5 (단락연산)
		
		System.out.println((i > 0) && (i++ > 0)); // true
		System.out.println(i); // 6
		
		System.out.println((i < 0) & (i++ < 0)); // 이건 short circuit XX
		System.out.println(i); // 7
		
		// ^(XOR) 
		// 양변이 다를 때만 true, 같으면 false
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
		
		
	}
}
