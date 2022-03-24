package chap13.lecture.p01generic;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;


public class App06 {
	public static void main(String[] args) {
		Container6<String, Integer> o1 = new Container6<>();
		o1.setField1("java");
		o1.setField2(999);
		String s1 = o1.getField1();
		Integer i1 = o1.getField2();
		
		Container6<Animal, Number> o2 = new Container6<>();
		o2.setField1(new Chihuahua());
		o2.setField2(3.14);
		Animal a = o2.getField1();
		Number n = o2.getField2();
		
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(a);
		System.out.println(n);
	}
}


class Container6<T, U>{
	private T field1;
	private U field2;
	
	public T getField1() {
		return field1;
	}
	public void setField1(T field1) {
		this.field1 = field1;
	}
	public U getField2() {
		return field2;
	}
	public void setField2(U field2) {
		this.field2 = field2;
	}
	
	
}