// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
package java20200728;

class Exam2 {
	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		c1.max_velo = 220;
		c1.run();
		Car c2 = new Car();
		c2.max_velo = 250;
		c2.run();
		
		// 출력 : 자동차가 최대속력 220km로 달립니다.
		// 출력 : 자동차가 최대속력 250km로 달립니다.
	}
}

class Car {
	int max_velo;
	
	void run() {
		System.out.println("자동차가 최대속력 " + max_velo + "km로 달립니다!!!!!!.");
	}
}
