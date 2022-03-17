package chap08.lecture.p03extends;

public class App01 {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MySubInterface1 sub1 = o1;
		MySuperInterface1 super1 = o1;
		
		sub1.subMethod1(); //서브 인터페이스 메소드 재정의!
		o1.subMethod1(); //서브 인터페이스 메소드 재정의!
		//super1.subMethod(); //XXX
		
		sub1.superMethod1(); //슈퍼 인터페이스 메소드 재정의!@
		o1.superMethod1(); //슈퍼 인터페이스 메소드 재정의!@
		super1.superMethod1(); //슈퍼 인터페이스 메소드 재정의!@
		
		MySuperInterface2 super2 = o1;
		//superMethod2() 호출
		//o1, sub1, super1, super2
		
		o1.superMethod2(); //슈퍼 인터페이스2 메소드 재정의###
		sub1.superMethod2(); //슈퍼 인터페이스2 메소드 재정의###
		super2.superMethod2(); //슈퍼 인터페이스2 메소드 재정의###
		//super1.superMethod2();//XXxx
		
		//default method
		o1.superDefaultMethod1(); //서브인터페이스에서 재정의한 메소드
		sub1.superDefaultMethod1(); //서브인터페이스에서 재정의한 메소드
		super1.superDefaultMethod1(); //서브인터페이스에서 재정의한 메소드
	}
}
