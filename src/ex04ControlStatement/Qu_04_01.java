package ex04ControlStatement;

import java.io.IOException;
import java.util.Scanner;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 
		 삼항연산자를 이용하여 구현하시오.	
          (System.in.read()를 사용하세요)
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("하나의 문자를 입력하세요: ");
	
		int input1 = System.in.read();

		if(input1>= 48 && input1 <=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		
	else {
		System.out.println("입력한 문자는 숫자가 아닙니다.");
	}		
	}
}
