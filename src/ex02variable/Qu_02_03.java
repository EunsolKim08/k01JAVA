package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 반지름이 10인 원의 넓이를 구해 출력하시오.
			단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.
			변수명] 
			
			int형 : area_int
			double형 : area_double
			
			공식]
			원의넓이 = 반지름 * 반지름 * 3.14
		 */	
		
		int area_int, r = 10; 
		double area_double;
		// final double PI = 3.14; 상수로 선언하기.
		//따라서 area_x = r*r*PI;
		
		area_int = (int) (r* r* 3.14); //형변환 한거 맞음
		area_double = r* r*3.14; 
		System.out.println("int형 넓이: " + area_int);
		System.out.println("double형 넓이: "+area_double);
	}

}
