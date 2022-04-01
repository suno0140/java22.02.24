package chap18.lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class App01 {
	public static void main(String[] args) throws Exception{
		//Writer : 문자단위 출력 스트림
		
		String path = "output/WriterEx01.txt";
		Writer wr = new FileWriter(path);
		
		wr.write('a'); //write메소드는 int를 받는데 char를 넣어도 가능 자동형변환
		wr.write('z');
		wr.write('한');
		wr.write('글');
		wr.write("우크라이나");
		wr.write(new char[] {'자', '바', '스', '프', '링'});
		wr.write(8800);
		wr.write('\u2260');
		
		wr.close();
		
		System.out.println("프로그램 종료");
	}
}
