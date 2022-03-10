package chap06.lecture.p03constructor;

public class Star {
	String stars;
	
	Star(int number){
		/*String init = "";
		for (int i = 0; i < number; i++) {
			init += "*";
		}
		
		this.stars = init;
		*/
		this("*", number); // this에 ( ) 괄호를 붙이면 다른 생성자 호출
	}
	
	Star(String shape, int number){
		String init = "";
		for(int i = 0; i < number; i++) {
			init += shape;
		}
		this.stars = init;
	}
}
