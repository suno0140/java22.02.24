package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App06 {
	public static void main(String[] args) {
		Helper helper = new Retriever();
		
		helper.help();
		
		//helper.roll();//XX
		Pet pet = (Pet) helper; //강제형변환 (서로 상관없는 인터페이스를 사용하려면)
		pet.roll();
	
		
	}
}
