package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App07 {
	public static void main(String[] args) {
		// Exception

		String path = "picutre/다형성01.png";

		//try - with - resource
		//InputStream is = null; //이건 필요없어짐
		//아래 finally 코드도 필요없어짐
		try (
				//try block에서 사용하고 꼭 닫아야(close)하는 객체 선언/초기화 코드
				//여기서 선언된 타입은 AutoCloseable 타입이어야 함.

				InputStream is = new FileInputStream(path);

		/*InputStream is2 = new FileInputStream(""); //여러개도 가능하다
		InputStream is3 = new FileInputStream(""); */

		) {
			

			byte[] datas = new byte[100];
			int len = 0;
			int size = 0;

			while ((len = is.read(datas)) != -1) {
				System.out.println(Arrays.toString(datas));
				size += len;
			}

			System.out.println(size);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			{
			} /*finally {
				try {
					if (is != null)
					is.close(); //꼭 작성 (열었으면 반드시 닫아줘야한다. 주로 스트림)
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} */
		}
	}
}
