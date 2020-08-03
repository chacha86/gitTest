package java20200722;

public class Exam4 {

	public static void main(String[] args) {
		
		// 성적 관리
		// 철수 영희 민수 선혜 , 90, 78, 86, 60
		// 총합
		
		
		
		int a = 90;
		int b = 78;
		int c = 85;
		int d = 60;
		int[] a반 = { a, b, c, d }; // 배열
		
		int sum = a + b + c + d;
		int sum2 = a반[0] + a반[1] + a반[2] + a반[3];
		
		int sum3 = 0;
		for(int i = 0; i <= 3; i++) {
			sum3 += a반[i];
		}
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		
		// 평균
		System.out.println(sum / 3);
		

	}

}
