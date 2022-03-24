package chap13.lecture.p01generic;

public class App14 {
	public static void main(String[] args) {
		App14.<String>method("java"); //원래는 이게 정석코드.
		method("java"); //보통은 생략해서 작성한다.
		
		String s1 = App14.<String>method2(); //정석코드
		String s2 = method2(); //보통 생략해서 사용
		
		String s3 = App14.<String>method3("java"); //정석코드
		String s4 = method3("java"); //99.9퍼센트 생략해서사용
		
		System.out.println(s1); //null
		System.out.println(s2); //null
		System.out.println(s3); //null
		System.out.println(s4); //null
	}

	//method에 type parameter을 리턴타입 전에 추가하면
	//generic method가 됨.
	
	public static <T> void method(T param){
		
	}
	
	public static <T> T method2() {
		return null;
	}
	
	public static <T> T method3(T param){
		return null;
	}
}
