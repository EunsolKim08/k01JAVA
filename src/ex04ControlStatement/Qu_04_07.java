package ex04ControlStatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		/*
		 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 
		 구하는 프로그램을 작성하시오. 
		 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
		 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
		 */
		
		int sum = 0;
		//1~100까지의 반복
		for(int num=0;num<=100; num++) {
			//3의 배수 혹은 7의 배수
			if((num%3 ==0) || (num%7 ==0)) {
				//3과 7의 공배수가 아닌 정수
				if(!(num%3 == 0 && num%7 == 0)) {
				System.out.print(num);
				sum+= num; //누적합
				 if(num != 99) {
					System.out.print(" + "); 
					/*if가 99일때는 =인 경우, 
					  else는 +로도 가능*/ 
				 }
				}
			}
		}
		System.out.printf(" = " + sum); //결과출력
	}
}
