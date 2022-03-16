package chap07.lecture.p06polymophism;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;

public class App08 {
	public static void main(String[] args) {
		Animal animal = new Chihuahua();
		animal.breathe();
		animal.cry();
		
		//angry 메소드를 실행하고 싶을때
		Chihuahua chihuahua = (Chihuahua) animal; //강제 형변환(casting)
		chihuahua.angry();
	}
}
