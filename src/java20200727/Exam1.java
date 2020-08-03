package java20200727;

public class Exam1 {

	public static void main(String[] args) {
		
//		길동 b = new 길동();
//		영희 c = new 영희();
//		수빈 d = new 수빈();
		
		사람 a아무개 = new 사람(); //아무것도 아님. 비어있음.
		
		
		사람 a길동 = new 사람();
		a길동.age = 24;
		a길동.name = "길동";
		
		사람 a수빈 = new 사람();
		a수빈.age = 27;
		a수빈.name = "수빈";
		
		a수빈 = a길동;
		
		System.out.println(a길동.age);
		System.out.println(a길동.name);
		
		System.out.println(a수빈.age);
		System.out.println(a수빈.name);
		
		
	}
}

class 사람 {
	int age;
	String name;
	String address;
}
