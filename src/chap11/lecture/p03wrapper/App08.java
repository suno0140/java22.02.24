package chap11.lecture.p03wrapper;

public class App08 {
	public static void main(String[] args) {
		Integer i1 = new Integer(9999);
		Integer i2 = new Integer(9999);
		int i3 = 9999;
		
		System.out.println(i1 == i2); //false (참조값, 가능한 사용금지 =>equals메소드 사용)
		System.out.println(i1 == i3 ); //true (auto unboxing)
		
		Integer i4 = new Integer(8888);
		Integer i5 = new Integer(9999);
		
		System.out.println(i4 < i5); //크기비교는 또 가능하다(auto unboxing)
		
		//비교메소드 (스태틱메소드X 인스턴스메소드)
		//compareTo()  (0 아니면 음수 아니면 양수 세가지값중 하나)
		//결과는 int타입
		//0, 음수, 양수 셋중 하나로 결과가 나온다.
		//0 : 같으면
		//음수 : 이 객체가 작으면. (앞에값이 작으면)
		//양수 : 이 객체가 크면. (앞에값이 크면)
		
		System.out.println(i4.compareTo(i5)); //음수
		System.out.println(i5.compareTo(i4)); //양수
	}
}
