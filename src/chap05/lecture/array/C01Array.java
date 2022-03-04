package chap05.lecture.array;

public class C01Array {
	public static void main(String[] args) {
			
		// 선언 후 초기화
		int[] arr2;
		arr2 = new int[] {11, 22, 33};
		
		// 배열 선언과 초기화
		int[] arr1 = new int[] {10, 20, 30};
		
		// 배열 선언과 초기화는 자주 일어나는일이여서 (new 생략 가능)
		int[] arr3 = {99, 88, 77};
		
		// 배열 선언
		int[] arr4;
		
		// 초기값 없이 배열 만들어서 할당 (배열의 길이만 지정 해주면 된다.)
		arr4 = new int[5]; // 길이가 5인 배열 , 초기값을 설정안해줘서 0 이 들어있다.
		
		arr4[0] = 2;
		arr4[1] = 99;
		arr4[2] = 100;
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		// 배열 선언 후 길이만 정해줌
		int[] arr5 = new int[10];
		
	}
}
