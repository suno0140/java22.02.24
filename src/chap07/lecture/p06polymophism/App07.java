package chap07.lecture.p06polymophism;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;

public class App07 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		chihuahua.cry();
		chihuahua.angry();
		
		Animal animal = chihuahua;
		animal.breathe();
		animal.cry();
		//animal.angry(); //XXX animal 이 chihuahua는 아니기때문
		
		
	}
}
