package ex04ControlStatement;

import ex01start.E02SystemOutPrintln;

public class Qu_04_06 {

	public static void main(String[] args) {
		
	/*	
	문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
       
       *
       **
       ***
       ****
       *****
	*/
	
		 
		int i =1;
			while(i<=5) {
				int j = 1;
				while(j<=5){
					if(j <=i) {
					System.out.printf("*");
					}
					
					j++;
				}
		 
				System.out.println();
				i++;
			}	
	}
}
