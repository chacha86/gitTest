package java20200721;

/*
세 개의 직선이 있습니다.

숫자의 의미는 직선의 길이. 이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성해주세요

* 삼각형 성립조건
가장 긴 변 길이 < 나머지 변의 길이 합 

*/
public class Exam2 {
	public static void main(String[] args) {

		int a = 12;
		int b = 9;
		int c = 7;
		
		int max = a;// 가장 긴변의 길이
		int others = b + c;
		
		if(b > a) {
			if(c > b) {
				max = c;
				others = a + b;
			} else {
				max = b;
				others = a + c;
			}
		}
		
		
		if(max < others) {
			System.out.println("성립");
		} else {
			System.out.println("성립x");
		}
		
	}
}
