package chap10.lecture.p03cheked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("");
			fr.read();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
