package chap12.p01thread;

public class App08 {
	static int shareVar = 0; //스태틱은 final이 아니여도 가능(인스턴스에선 변수 변경X)
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i  = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("thread81 : " + shareVar);
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("thread81 : " + shareVar);
			};
		};
		t1.start();
		t2.start();
	}
}
