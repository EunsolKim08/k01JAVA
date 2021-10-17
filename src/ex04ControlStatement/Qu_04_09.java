package ex04ControlStatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		/*
		 문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
			2*1 = 2 3*1 =3 .... + 9* 9 = 9
			2* 2 = 4 .............+ 9*2 = 10
			.
			.
			2*9 = 18 ..............9*9 =81
		 */

		int multiple;
		for(int i = 2; i<=9 ; i++) {
			for(int j = 1; j<=9 ; j++) {
				multiple = i*j;
				System.out.print(i + " * "+ j + " = "+ multiple+"  ");
			}
			System.out.println();
		}
	}
}
