package ex16ExceptionBasic1;

import java.util.Scanner;

public class Ex02PreDefineException3 {
	public static void main(String[] args) {
		System.out.println("### InputMismatchException ###");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이를 입력하세요: ");
			int strAge = sc.nextInt(); // 10살과 같이 살이라는 글자가 붙으면 오류
			int ageAfter10 = strAge + 10;
			System.out.println("당신의 10년 후 나이는: " + ageAfter10);
		}catch(NumberFormatException e) {
			System.out.println("나이는 숫자로만 입력해야 합니다.");
			System.out.println("예외메세지: "+ e.getMessage());
			e.printStackTrace();
		}
}
