package chap03.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + (double)lengthBottom) * height / 2;
		System.out.println(area); // 원래는 52.5 인데 int 끼리 연산이여서 52로 나옴
		
		// 중간에 한번이라도 더블 타입이 포한되면 됨 또는 2 를 2.0으로 입력 해도 됨
	}
}
