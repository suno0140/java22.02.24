package chap18.lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class App02Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("172.30.1.37", 38080), 5000);
		
		System.out.println("[서버로 연결 성공]");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		System.out.println("[서버로 메시지전송]");
		bw.write("서버님 반갑습니다.");
		bw.newLine();
		
		bw.close();
		wr.close();
		os.close();
		socket.close();
		
		System.out.println("서버 프로그램 종료!!");
	}
}
