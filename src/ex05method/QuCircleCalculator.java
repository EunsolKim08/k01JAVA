package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {
	/*
	 원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 
	 반환하는 메소드를 각각 정의하자. 
	 이를 호출하는 main 메소드를 정의하라.
	 메소드명 : circleArea() > 원의넓이, 
	 circleRound() > 원의둘레
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시오: ");
		double R = scanner.nextDouble();
		System.out.println("원의 둘레("+R+") : "  + circleRound(R) );
		//반환값이 있는 메서드이므로 print문 안에서 호출한다.
		System.out.println("원의 넓이("+R+") :"+  circleArea(R));
	}
	static double circleArea(double r) {
		
		double area = r * r*3.14;
		
		return area;
	}
	/*
	 반환값이 없는 매개변수를 받은 후 결과를 즉시 출력하는 메소드
	 static void circleArea(double radian){
	 double result = 3.14*radian*radian;
	 System.out.println("원의 넓이는 "+ result);
	 }
	 */
	static double circleRound(double r) {
		
		double round = 2 * 3.14 * r;
		
		return round;
		//return (2*3.14*r);
	}
}
