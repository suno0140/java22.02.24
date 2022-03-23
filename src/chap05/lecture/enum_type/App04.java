package chap05.lecture.enum_type;

public class App04 {
	//java.lang Enum 클래스 상속 받아 아래 여러메소드 사용가능
	
	public static void main(String[] args) {
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		
		//ordinal메소드
		System.out.println(s1.ordinal()); //0
		System.out.println(s2.ordinal()); //1
		System.out.println(s3.ordinal()); //2
		System.out.println(s4.ordinal()); //3
		
		//name메소드
		//toString메소드 등을 쓸수 있다.
		String str1 = s1.toString();
		System.out.println(str1); //SPRING
		System.out.println(s2); //SUMMER
		
		//valueOf 메소드 (String => enum 으로 변환)
		Season s5 = Season.valueOf("SUMMER");
		
		//values() : enum의 모든 상수를 배열로 리턴
		Season[] arr = Season.values();
		System.out.println(arr.length); //FALL
		
		for(Season season : arr) {
			System.out.println(season); //WINTER
		}
		
	}
}
