package java20200720;

public class Exam2 {

	public static void main(String[] args) {
		int age = 74; // 이 값을 바꿔가면서 실행해보세요.
		
		// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
//		if(age <= 19) {
//			System.out.println("할인대상");
//		}
//		else if(age >= 60) {
//			System.out.println("할인대상");
//		}
//		else {
//			System.out.println("비할인대상");			
//		}
		
		
		String s = (age <= 19) ? "할인대상" : (age >= 60) ? "할인대상" : "비할인대상";

		System.out.println(s);
		
	}

}
