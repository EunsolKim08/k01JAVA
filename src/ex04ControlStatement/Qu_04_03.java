package ex04ControlStatement;

public class Qu_04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 아래 코드의 삼항연산자를 if~else문으로 변경하시오. 
		 단, 실행결과는 동일해야 합니다.
		 */
		
		
		int num1=50, num2=100;
		int big, diff;
		
		if(num1>num2) {
			big = num1;
			diff = num1 - num2;
		}else {
			big = num2;
			diff = num2 - num1;
		}

		System.out.println(big);
		System.out.println(diff); 

	}

}
