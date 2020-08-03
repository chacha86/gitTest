package java20200728;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 4;
		// 배열의 값 출력
		
		int[][] arr1 = new int[n][n];
		int k = 1;
		for(int col = 0; col < n; col++) {
			for(int row = n - 1; row >= 0; row--) {
				arr1[row][col] = k;
				k++;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr1[i][j] + " ");				
			}
			System.out.println();
		}
		
	    /*
	      4 8 12 16
	      3 7 11 15
	      2 6 10 14
	      1 5 9 13

	    */
	}

}
