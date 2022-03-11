package chap06.lecture.p05Static;

public class MyClass03 {
	static {
		//static block
		//정적 초기화 블럭 (인스턴스 에서 생성자 역할)
		int sum = 0;
		for(int i = 0; i < 30; i++) {
			sum +=i;
		}
		field2=sum;
	}
	static int field2;
	
	int field1;
	
	MyClass03(){
		field1 = 10;
	}
}
