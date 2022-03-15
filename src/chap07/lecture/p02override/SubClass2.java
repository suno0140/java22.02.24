package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {

	@Override
	public void method1() {
		
		//super : 상위 클래스 멤버(필드or메소드)에 접근하기 위해서 사용한다.
		
		System.out.println("서브클래스으2의 메소드 하는 일...");
		super.method1(); //재정의할때 상위클래스메소드를 그대로 쓰고싶을때(위치순서는 중요치않음)
	}
}
