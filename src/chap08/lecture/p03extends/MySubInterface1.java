package chap08.lecture.p03extends;

public interface MySubInterface1 extends MySuperInterface1, MySuperInterface2 {

	void subMethod1();

	@Override
	default void superDefaultMethod1() {
		System.out.println("서브인터페이스에서 재정의한 메소드");
	}

	//MySuperInterface1의 요소 다 가지고 있다.
	//MySuperInterface2의 요소 다 가지고 있다.

	//슈퍼인터페이스 의 추상메소드를 가지고 있지만 보여지지않는다.
	//클래스였다면 추상메소드를 재정의해야 했지만 인터페이스라서 안해도된다.
}
