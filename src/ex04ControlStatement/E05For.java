package ex04ControlStatement;

public class E05For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 for문의 실행순서
		 1. 반복을 위한 변수 i를 1로 초기화
		 2. 조건을 검사
		 3. 조건이 참일때 실행문을 실행한다.
		 4.증가(감소식)실행
		 5.조건을 검사 후(3,4,5)를 반복횟수만큼 실행
		 6.조건이 false면탈출
		 */
		
		
		/*
		 for 지역변수 안에서 선언된 변수는 그 지역을 벗어나는 순간
		 메모리에서 소멸된다.
		 */
		for(int i =1; i<=5; i++) {
			System.out.println("i = " + i);
		}
		
		int sum = 0;
		for(int j = 1; j <= 100; j++)
		{
			sum += j;
		}
		
		System.out.println("1~100까지의 합: " +sum);
		
		/*
		 시나리오] for문을 이용하여 1~10까지의 정수중 2배수의 합을
		 구하는 식을 작성하시요
		 */
		//방법1
		int total = 0;
		for(int j =1; j<=10; j++) {
			if(j % 2 == 0) {
				total += j;
				}
		}
		System.out.println("1~10사이의 2의 배수의 합: " +total);
		
		//방법2
		total = 0;
		for(int j =0; j<=10; j+=2) { // k는 2의 배수라서 k =0부터 시작해야함!
				total += j;      //복합대입 연산자 사용가능함.
		}
		System.out.println("1~10사이의 2의 배수의 합: " +total);
	/*
	  for문으로 무한루프를 만들 때 사용함,
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다.");
			a++;
		}
		
		for(int j = 0; j<=5; j++);   <=얘는 실수로 마지막에 ;써서 오류
		{
		 System.out.println("어랏 나는 누구? 여긴어디?");
		}
		
		System.out.println("위 for문에서 선언한 변수 j =" + j);
		System.out.println("위 main함수 지역에서 선언한 변수 total =" + total);
	*/
	
		/*
		for(int j = 0; j<=5; j++)  // <=얘는 실수로 마지막에 ;써서 오류
		{
		 System.out.println("어랏 나는 누구? 여긴어디?");
		}
		
	/*	System.out.println("위 for문에서 선언한 변수 j =" + j); 
	    지역변수는 그안에서만 안식됨
	*/
		System.out.println("위 main함수 지역에서 선언한 변수 total = " + total);
	
	/*
	 연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시요.
	 */
	System.out.println("for문으로 제작한 구구단");
	
	
	for(int x = 2; x<=9 ; x++) {
	for(int y = 1;y<=9 ;y++) {
		System.out.print(x + " * " + y +" = " + (x*y) + "  ");
	}
		System.out.println();
	}
	/*
	 연습문제2]다음의 출력결과를 보이는 for문을 작성하시오
	 출력결과
	 
	 0 0 0 1
	 0 0 1 0
	 0 1 0 0
	 1 0 0 0
	 
	 해법 x와 y를 더해서 5가될때 1을 출력한다.
	 */
	System.out.println("\n");
	System.out.println("for문으로 바둑판 출력하기\n");
	
	 for(int x = 1; x<=4;x++) {
		 for(int y =1 ; y<=4; y++){
			 if((x+y) == 5) {
				 System.out.printf("1 ");
			 }
			 else {
				 System.out.printf("0 ");
			 }
		 }
		 System.out.println();
	  }
	}

}
