package java20200721;

public class Exam4 {
	public static void main(String[] args) {
		// 아래 세 정수의 값을 바꿔가면서 테스트해보세요.
		int a = 13;
		int b = 2;
		int c = 4;
		int second = a;
		// 출력 : 두번째로 작은 수는 12입니다.
		
		if(a > b) {
			if(b > c) { // a가 최대, b가 두번째
				second = b;
			} else { // c > b
				if(a > c) { // a 최대, c가 두번째
					second = c;
				} else { // c > a  c가 최대, a가 두번째
					second = a;
				}
			}
		} else { // b > a
			if(a > c) { // b가 최대, a가 두번째
				second = a;
			} else { // c > a
				if(b > c) { // b가 최대, c가 두번째
					second = c;
				} else { // c가 최대, b가 두번째
					second = b;
				}
			}
		}
		System.out.println("두번째 수 : " + second);

	}
}
