package ex04ControlStatement;

import java.io.IOException;
import java.util.Scanner;

import ex01start.E02SystemOutPrintln;

public class E04DoWhile {

	public static void main(String[] args) throws IOException {
		
	/*
	  do while문은 while문과는 달리 무조건 한번은 실행이 된다.
	 */

		int sum =0, i =1;
		
		do {
			sum+= i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 누적합: " + sum);
		
		/*
		 시나리오] 1부터 1000까지의 정수 중 4의 배수이거나 7의 배수인 수의
		 합을 구하여 출력하는 프로그램을 작성하시오.
		 단 do~while문을 사용해야한다.
		 */
		
		int j = 1, total = 0;
		do {
			if((j%4==0) || (j%7==0)) {
				System.out.println("j: " +j );
				total +=j;
			}
				j++;
		}while(j<=1000);
		System.out.println("1~ 1000까지의 4 or 7의 배수합: " + total);
		
		/*
		 국영수 점수를 사용자로부터 입력받은 후,
		 평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하라.
		 단, 사용자가 X, x(대소문자 구분없음)을 입력하면 프로그램을
		 종료하여야 하며, do~while문으로 구현해야 한다.
		 */
		 
		 /*
		  사용자로부터 키보드를 통해 입력값을 받기 위한 클래스
		  
		  */
		Scanner scanner = new Scanner(System.in);
		String s;
		int kor, eng, math, avg;
		int exitCode;
		
		do {
			System.out.print("국어점수: ");
			kor = scanner.nextInt();
			System.out.print("수학점수: ");
			eng = scanner.nextInt();
			System.out.print("영어점수: ");
			math = scanner.nextInt();
			
			/*
			 평균점수의 구간을 정하기 위해 10으로 나눠주는 연산을
			 진행한다. switch문은 조건식을 쓸 수 없고 산술식말 쓸수 있기때문에
			 몫이 9라는 사실을 통해 구간을 대체하는 산술결과를 얻을 수 있다.
			 */
			avg = (kor+eng+math)/(3 *10);
			
			switch(avg) {
			case 10: case 9: // case하고 띄어쓰기 하기
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");break;
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키를 입력하세요.");
			
			exitCode = System.in.read();
		}while(!(exitCode == 'x' || exitCode == 'X' ));
	/*
	 X를 입력한 경우
	 : !(false || true) => !(true) =>false반환.
	 `do while문을 탈출한다.
	 a를 입력한 경우
	 : !(false || false) => true 반환
	 do while문을 반복한다
	 */
				//왜 문자인데 scanner.nextLine();으로 입력받으면 안되는거지?
				//scanner. nextLine();과 System.in.read();의 차이
	 /*
	  문자열 입력: scanner. nextLine();과 
	  문자입력: System.in.read();, 아스키코드 값을 정수 형태로 반환
	  x랑 X 값도 아스키코드로 반환
	  */
		
		/*
		 이유는 모르지만 String s1을 받으려면
		 Scanner scanner2 = new Scanner(System.in);를 생성해야함
		 scanner2 따로받음
		 
		 그리고 문자열 비교는 do while이더라도
		 do{
		 }while((!s1.equals("xx"))); 
		 로 문자열 비교는 equal문을 사용해야함.
		 
		 따라서
		 while((!s1.equals("xx" || "XX"))); 는 오류남.  
		 while((!(s1.equals("xx") || s1.equals("XX")) ));
		 같이 객체에 다른 변수를 다시 담아주기
		 */
	}	
}
