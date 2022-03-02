package chap04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
		// 9단 ~ 2단 거꾸로
		for (int m=9; m >=2; m--) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
		// 9 x 9 = 81 ~~ 2 x 1 = 2 완전 거꾸로
		for (int m=9; m >=2; m--) {
			System.out.println("***" + m + "단 ***");
			for (int n=9; n>=1; n--) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
