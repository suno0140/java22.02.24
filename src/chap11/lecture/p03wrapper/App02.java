package chap11.lecture.p03wrapper;

public class App02 {
	public static void main(String[] args) {
		//기본타입을 참조타입으로 변환 방법
		byte b1 = 127;
		Byte b2 = new Byte(b1); //boxing
		
		int i1 = 365;
		Integer i2 = new Integer(i1); //boxing	
		Integer i3 = Integer.valueOf(i1); //boxing 또다른 방법
		
		//auto boxing : 기본타입이 참조타입으로 자동변환
		int i4 = 99;
		Integer i5 = i4; //auto boxing
	}
}
