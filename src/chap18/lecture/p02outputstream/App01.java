package chap18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
	public static void main(String[] args) {
		//OutputStream : byte 단위 출력할 때 사용하는 클래스
		
		String fileName = "output/OutputStreamEx01.txt";
		try (OutputStream os = new FileOutputStream(fileName);){
			
			os.write(99); //1byte 쓰기(int는 4byte 그중 마지막1byte만 쓴다 나머지3은버려진다.)
			os.write(99999999); //1byte 쓰기
			os.write(98798798); //1byte 쓰기
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		//os.close();
		
		System.out.println("프로그램 종료...");
	}
}
