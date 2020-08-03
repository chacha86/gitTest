package java20200721;
// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

class Exam1 {
  public static void main(String[] args) {
	  int num1 = 30;
	  int num2 = 20;
	  int result = 0;
	  if(num1 > num2) {
		  result = num1 - num2;
	  } else {
		  result = num2 - num1;
	  }
	  
	  System.out.println(result);
  }
}