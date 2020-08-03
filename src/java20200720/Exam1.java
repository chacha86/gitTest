package java20200720;

import java.util.Random;

public class Exam1 {

	public static void main(String[] args) {
		
		//정수, 실수, 문자열, 진리값(논리)
//		1
//		1.0
//		"aaaa"
//		true, false
		
		// 10이 50보다 작다 -> 참
		// 10이 50이 같다 -> 거짓
		
		// 비교연산자 : <, >, <=, >=, ==, !=, 
		System.out.println(10 < 50);
		System.out.println(10 == 50);
				
		// 조건
		int a = 10;
		System.out.println(a < 20);

		// 조건문
		if(a < 20) {			
			System.out.println("안녕~");
		}
		
		// 날씨에 따른 행동
		
		// 1. 비, 2.눈, 3.맑음
		Random ran = new Random();
		
		int weather = ran.nextInt(3);
		
		if(weather == 0) {
			System.out.println("우산을 쓴다");			
		}
		if(weather == 2) {			
			System.out.println("선크림을 바른다");
		}
		if(weather == 1) {
			System.out.println("목도리를 두른다");
		}

		
		
	}

}
