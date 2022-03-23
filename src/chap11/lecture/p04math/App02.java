package chap11.lecture.p04math;

import static java.lang.Math.*;

public class App02 {
	public static void main(String[] args) {
		//static import
		Math.abs(-10);
		
		//클래스명을 생략 하고 싶을때
		//생략해서 쓸 수 있다.  import static를 지정했기때문에		
		abs(-20); 
		min(3, 5);
		max(1, 2);
	}
}
