package ex04ControlStatement;

public class E03While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//작성1: 1번 반복하기 위한 while문을 만든다.
		int sum =0;
		int i = 1;
	
		while(i<=10) {
			System.out.println("변수 i = "+ i);
			i++;
		}
		
		//작성2 수열문제 구현
		int j =1;
		while(j<=10) {
			sum += j;
			j++;
		}
		System.out.println("1~10까지의 합은: " + sum);
	/*
	 시나리오] 1~100까지의 정수 중 3의 배수이거나 4의 배수인
	 정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
	 */
		
	//작성1 : 100번 반복해서 3 혹은 4의 배수 출력하기
	int k=1, total =0;
	
	while(k<=100) {
		if(k%3==0 || k%4 ==0) {
			System.out.println("k = "+ k);
			total += k;
		}
		k++;
	}
	System.out.println("total = " + total);
		
	/*
	 시나리오] 구구단을 출력하는 프로그램을 작성하시오.
	 단 while문을 이용하시요.
	 */
	
		int dan = 2;
		
		//왜 su의 선언이 안으로 들어가야 하지?
		//결과 값이 달라지는 이유는?
		/*
		 su가 while안에서 한번 돌때부터 reset되어야
		 2단 다음에 다시 3단에서도 3*1~ 3*9가 출력되는거임!
		 */
		while(dan<=9) {
			int su = 1;	
			while(su<=9) {
				System.out.printf("%-2d*%-2d=%2d",dan,su,(dan*su));
				System.out.printf(" "); //공백출력
				su++;
			}
			System.out.println(); //줄바꿈
			dan++;
		}
	System.out.println("=======================\n");
	
	/*
	 시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
	 	출력 결과
	 
	 1 0 0 0
	 0 1 0 0
	 0 0 1 0
	 0 0 0 1
	 */
	
	int x= 1;
	
	while(x<= 4) {
		int y=1; // 구구단처럼 한바퀴돌고 행이 바뀔때 다시 1로 초기화
		while(y<=4) {
			if(x == y) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
			y++;
		}
		System.out.println(); // 4번 찍고 줄바꿈
		x++;
	}
	
	}

}
