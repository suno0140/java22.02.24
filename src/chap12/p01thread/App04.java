package chap12.p01thread;

public class App04 {
	public static void main(String[] args) {
		
		System.out.println("쓰레드 실행 중 ....");
		
		//sleep 현재 쓰레드 실행을 milliseconds 만큼 멈춤 (static메소드)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //3초 멈춤
		
		System.out.println("쓰레드 실행 계속......");
	}
}
