//한글
package chap18.lecture.p03reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class App03 {
	public static void main(String[] args) throws Exception{
		String name = "src/chap18/lecture/p03reader/App03.java";
		Reader rd = new FileReader(name);
		
		System.out.println((char)rd.read()); // "/"
		System.out.println((char)rd.read()); // "/"
		System.out.println((char)rd.read()); // 한
		System.out.println((char)rd.read()); // 글
		
		rd.close();
		
		//바이트 단위로 읽기 (한글은 바이트로 읽으면 문제가 생김)
		InputStream is = new FileInputStream(name);
		
		System.out.println((char) is.read()); // "/"
		System.out.println((char) is.read()); // "/"
		System.out.println((char) is.read()); // ??이상한문자로 뜸
		System.out.println((char) is.read());
		
		is.close();
	}
}
