package java20200721;

public class Exam6 {
	public static void main(String args[]) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum = sum + i; // 합알고리즘
		}

		System.out.println(sum);

		int n = 5;
		int m = 80;
		int k = 3;
		int sum2 = 0;
		
		for(int i = n; i <= m; i++) {
			if(i % k == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum2);
		

	}
}
