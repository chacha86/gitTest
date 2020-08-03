package java20200729;

public class Exam1 {
		
	public static void main(String[] args) {
		KukuMachine km = new KukuMachine();
		
		km.kuku(3 ,100);
		
		System.out.println("code1");
		
		km.kuku(4, 50);

    	System.out.println("code2");
    	
    	km.kuku(5, 30); // 메서드 호출
    	
    	
    	int a = km.multiple(5, 4);
    	System.out.println(a);
    	
	}
	
	
	
}

class KukuMachine {
	
	void kuku(int dan, int limit) { // 정의
		
		for(int i = 1; i <= limit; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
	}
	
	int multiple(int dan, int i) {
		return dan * i; 
	}
}





