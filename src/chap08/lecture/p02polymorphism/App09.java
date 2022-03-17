package chap08.lecture.p02polymorphism;

import java.util.Scanner;

import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Pet;
import chap08.lecture.p01interface.example_class.Retriever;

public class App09 {
	public static void main(String[] args) {
		Pet pet1 = new Retriever();
		Pet pet2 = new Chihuahua();
		Pet pet3 = new Cat();
		
		pet1.sit(); //반려동물이 앉습니다.(default)
		pet2.sit(); //반려동물이 앉습니다.(default)
		pet3.sit(); //고양이가 도망갑니다.(재정의)
		
		
		//api source보기
		String str = "java";
		Scanner scanner;
	}
}
