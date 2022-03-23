package chap11.lecture.p03wrapper;

public class App01 {
	public static void main(String[] args) {
		//java data type
		//primitive type(8개) : byte, short, int, long, char, float, double, boolean
		//reference type(무한) : 나머지 모두
		//많은 개발자들이 기본타입을 참조타입처럼 쓰고 싶었다.
		
		Object[] arr = new Object[3];
		arr[0] = "java";
		arr[1] = 3; //java5부터 가능 원래 int타입이 오브젝트에 상속되어있지않아 불가능.
		arr[2] = new Integer(3); //java4 
		
		//wrapper class(8개)
		//Byte, Short, Integer, Long, Character, Float, Double, Boolean
	}
}
