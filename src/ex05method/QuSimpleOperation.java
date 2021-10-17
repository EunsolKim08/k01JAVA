package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	/*
	 두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와
	  main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	  파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	 메소드명 arithmetic()	
	 */
	public static void main(String[] args) {
 //반환값은 없고, 매개변수만 있는 메소드
	Scanner scanner = new Scanner(System.in);
	System.out.print("두개의 정수를 입력하시오(단, 두 숫자는 모두 0이상의 정수: ");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	arithmetic(num1,num2);
	
	}
	
	static void arithmetic(int a, int b) {
		
		int sum, sub, multiple, quo, remain;
		
		if(a>= b) {
			sum = a+b;
			sub = a-b;
			multiple = a*b;
			quo = a/b;
			remain =  a%b;
		}
		else {
			sum = a+b;
			sub = b-a;
			quo = b/a;
			multiple = a*b;
			remain =  b%a;	
		}
		
		System.out.println("덧셈결과-> " + sum);
		System.out.println("뺄셈결과-> " + sub);
		System.out.println("곱셈-> " + multiple);
		System.out.println("나눗셈 몫-> " + quo);
		//%기호를 콘솔에 출력하기 위해서 이스케이프 시퀀스를 사용함(%두개: %%)
		System.out.println("나눗셈 나머지-> " + remain);
		
	}

}
