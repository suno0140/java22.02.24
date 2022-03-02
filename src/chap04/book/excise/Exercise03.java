package chap04.book.excise;

public class Exercise03 {
	public static void main(String[] args) {
		// 1 ~ 100 까지의 정수 중에서 3의 배수의 총합
		
		int sum = 0;
		
		int i = 0;
		for (i = 0; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("1 ~" + " 100까지 3의 배수의 합 :" + sum);
	}
}
