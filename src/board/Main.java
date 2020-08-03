package board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("명령어를 입력해주세요");
			String s = sc.nextLine();

			if (s.equals("exit")) {
				
				System.out.println("프로그램 종료!");
				break;

			} else if(s.equals("help")) {
				
				System.out.println("exit : 프로그램 종료");
				
			} else {
				
				System.out.println("올바른 명령어가 아닙니다.");
				
			}
		}
	}
}
