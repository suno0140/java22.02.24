package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		//문자단위출력스트림(OutputStreamReader)로 변환
		//BufferedWriter로 변환
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (int i = 0; i < 1000_0000; i++) {
			bw.write('가');
			
		}
		
		//스트림닫기
		bw.close();
		osw.close(); //생략가능
		os.close();  //생략가능
		
		System.out.println("종료!!");
	}
}
