package chap09.book.exercis.p05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
			
			
			
	//지역클래스 이걸 제일 많이 접할거임		
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
				
				
		localVar.run();		
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
