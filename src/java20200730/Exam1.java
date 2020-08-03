package java20200730;

public class Exam1 {
	public static void main(String[] args) {

		수학 a수학 = new 수학();

		int rst1 = a수학.약수의합(1000);
		System.out.println(rst1); // 2340 출력

		boolean rst2 = a수학.소수판별(10);
		System.out.println(rst2); // false

		boolean rst3 = a수학.소수판별(7);
		System.out.println(rst3); // true

		int rst4 = a수학.n까지의_소수의개수(1000);
		System.out.println(rst4); // 168

		int rst5 = a수학.n까지의_소수의합(1000);
		System.out.println(rst5); // 76127
		
		영어 a영어 = new 영어();
		int rst6 = 

	}
}

class 수학 {

	int 약수의합(int num) {
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {				
				sum += i;
			}
		}
		
		return sum;
	}

	boolean 소수판별(int num) {
			
		if(약수의합(num) == num + 1) {
			return true;
		}
		return false;
	}

	int n까지의_소수의개수(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(소수판별(i)) {
				count++;
			}
		}
		
		return count;
	}

	int n까지의_소수의합(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(소수판별(i)) {
				sum += i;
			}
		}
		
		return sum;
	}

}