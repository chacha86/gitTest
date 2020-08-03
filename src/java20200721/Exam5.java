package java20200721;

public class Exam5 {

	public static void main(String[] args) {
		// 아래 세 정수의 값을 바꿔가면서 테스트해보세요.
		int a = 13;
		int b = 2;
		int c = 4;
		
		// 2, 4, 13
		
		if(a > b) {
			int tmp = a;
			b = a;
			a = tmp;
		}
		
		if(b > c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		
		if(a > c) {
			int tmp = a;
			a = c;
			c = tmp;
		}
		
		System.out.println("두번째 수 : " + b);
	}
	
}
