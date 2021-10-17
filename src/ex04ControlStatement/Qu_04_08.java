package ex04ControlStatement;

public class Qu_04_08 {

	public static void main(String[] args) {
		
		/*	
		문제1) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

	       *****
	       ****
	       ***
	       ***
	       *
		*/
		
		/*
		 	*를 출력할 행의 갯수를 상수로 표현 (게시판)
		 	ROW(행의 갯수) - x +1
		 		: 변수 x가 증가함에 따라 
		 		점점 감소하는 y를 표현하기 위한 일반식정의
		 	x가 1가 일일: 5-1 + 1 = 5
		 	
		 	x가 5일때 : 5 - 5+1 = 1
		 */
		
		/*
		final int Row = 5;
		for(int x=1; x<=ROW; x++{
		for(int y = 1; y< ROW-x+1;y++{
			System.out.print("*");
		}
		}
		 */
		
		
		/*
		 n과 m의 크기를 통해 반복횟수를 제한한다.
		 */
		for(int i = 1; i<=5 ; i++) {
			for(int j =1; j<=5 ;j++ ) {
				if(i<=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		

	}

}
