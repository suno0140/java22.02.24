package chap03.lecture.binary;

public class C07Assignment {
	public static void main(String[] args) {
		// 대입연산자(=할당연산자, assignment)
		// = , += , -= , *= , /= , %=
		
		int i = 100; // 100을 i 에 대입
		
		i += 3; // i가 원래 가진 값에 3을 더해서 대입
		        // i = i + 3; 과 같음
		
		System.out.println(i); // 103
		
		i -= 9; // i 가 원래 가진 값에 9를 빼서 대입
	            // i = i - 9; 와 같음
		System.out.println(i); // 94
		
		i *= 2; // i 가 원래 가진 값에 2 곱해서 대입
		        // i = i * 2; 와 같음
		System.out.println(i); // 188
		
		i /= 3; // i 가 원래 가진 값에 3 나눈 몫을 대입
		        // i = i / 3; 와 같음
		System.out.println(i); // 62 연산의 결과가 전부 int(인티저) 인것을 항상 생각 (소수점버림)
		
		i %= 3; // i 가 원래 가진 값에 3으로 나눈 나머지를 대입
		        // i = i % 3;
		System.out.println(i); // 2
		
		int j, k, l;
		j = k = l = i; // 오른쪽 부터 연산이 일어난다.
		System.out.println(j); // 2
		System.out.println(k); // 2
		System.out.println(l); // 2
		}
}
