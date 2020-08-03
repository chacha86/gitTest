package java20200728;

public class Exam1 {

	// 메서드
	public static void main(String[] args) {
		
//		길동 b = new 길동();
//		영희 c = new 영희();
//		수빈 d = new 수빈();
		
		
		//사람 a아무개 = new 사람(); 
		
		사람 a길동 = new 사람();
		a길동.age = 24;
		a길동.name = "길동";
		
		
//		사람 a수빈 = new 사람();
//		a수빈.age = 27;
//		a수빈.name = "수빈";
//		
//		a수빈 = a길동;
		
		System.out.println(a길동.age);
		System.out.println(a길동.name);

		a길동.increaseAge();
		a길동.increaseAge();
		a길동.introduce();
		
		System.out.println(a길동.age);
		System.out.println(a길동.name);
		
//		System.out.println(a수빈.age);
//		System.out.println(a수빈.name);
//		
		
	}
}

class 사람 {
	int age; // 나이
	String name; // 이름
	String address; // 주소
	
	// 나이를 증가시키는 메서드
	void increaseAge() {
		age++;
		System.out.println("길동의 나이가 한살 증가했습니다.");	
	}
		
	void introduce() {
		System.out.println("안녕하세요");
	}
}
