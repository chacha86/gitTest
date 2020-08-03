package java20200724;

public class Exam1 {
	public static void main(String[] args) {
	
		int n = 6;

	    // 배열의 값 입력
		 int[][] arr = new int[n][n];
		 int k = 1;
		 
		 for(int j = 0; j < n; j++) {			 
			 for(int i = 0; i < n; i++) {
				 arr[j][i] = k;
				 k++;
			 }
		 }

		 for(int j = 0; j < n; j++) {			 
			 for(int i = 0; i < n; i++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
	    // 배열의 값 출력
	    /*
	      1 2 3 4
	      5 6 7 8
	      9 10 11 12
	      13 14 15 16

	    */
		
		
	}
}
