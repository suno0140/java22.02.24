package chap10.lecture.p03cheked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";
		
		int i = Integer.parseInt(s); 
		//NumberFormatException 이 발생 가능
		//NumberFormatException 은 RuntimeException(unchecked exception)
		//이기때문에 컴파일러가 검사 안함
		
		
		try {
			FileReader fr = new FileReader("");
		//FileNotFoundException 이 발생 가능
		//FileNotFoundException 은 RuntimeException을 상속받지 않았음(check exception)
		//그래서 컴파일러가 검사함(check)	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
