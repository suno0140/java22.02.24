package chap08.book.exercise.p03;

public class SoundableExample implements Soundable {
  
	//메소드 순서는 상관없다.
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}