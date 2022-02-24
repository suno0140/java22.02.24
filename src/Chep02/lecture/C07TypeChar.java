package Chep02.lecture;

public class C07TypeChar {
	public static void main(String[] args) {
		// 문자형 : char(2)
		char var1 = ' ';
		//char var2 = ''; // X
		char var3 = '\\';
		char var4 = 'a';
		char var5 = '가';
		char var6 = '나';
		char var7 = '\uac00'; // 역슬래쉬u + ac00 (16진법 코드값)
		System.out.println(var7);
		
		int var8 = var7;
		System.out.println(var8);
	}
}
