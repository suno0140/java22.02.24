package chap13.lecture.p01generic;

import chap07.lecture.p99polymophism_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Animal;

public class App04 {
	public static void main(String[] args) {
		Container4<String> o1 = new Container4<String>();
		Container4<Integer> o2 = new Container4<Integer>();
		Container4<Animal> o3 = new Container4<Animal>();
		
		//Container4<int> o4 = new Container4<int>();
		//기본타입은 type parameter로 사용 불가(참조타입만 가능)
		//8개 wrapper class 이용 (auto boxing, unboxing)
		
		Container4<Chihuahua> o4 = new Container4<>(); 
		//보통 type parameter 이 같기 때문에 생략가능(diamond 라고도한다.)
	}
}

class Container4<T> {
	public void method (T param) {
		
	}
}