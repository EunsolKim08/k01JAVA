package ex04ControlStatement;

import java.util.Scanner;
/*
 switch문
  if문처럼 조건에 따라 분기하는 제어문으로, 정수식의 값고
  동일한 부분을 찾아 실행하는 형태를 가지고있다.
  형식]
  	switch(산술식 또는 정수식){
  	case 값 1:
  		실행문; break;
  	case 값 2:
  		실행문; break;
  	default:
  		위의 값과 매칭되지 않을 대, 실행되는 문장으로
  		else와 같은 의미로 사용됨.
  		
  	※만약 break가 없을시 break를 만날때 까지 실행된다.
  	}
 */

public class E02Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
 		Scanner 클래스
 			: JDK5.0부터 추가된 클래스로 키보드를 통해
 			사용자로부터 값을 입력받을 때 사용한다.
 			nextLine():문자열을 입력받음
		 	nextInt(): 정수를 입력받음
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는: "+ iNum);
		
		//정수를 3으로 나누면 나머지는 0,1,2만 생성된다.
		int remain = iNum % 3;
		
		switch(remain) {
		case 0:
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
		default:
			System.out.println("나머지는 2입니다.");
		}
		
		
	long Ln = 100;
	/*
	 switch문 사용시 주의사항
	 -long 타입의 변수는 사용할 수 없다.
	 -byte,short, int, char, String만 사용할 수 있다.
	 */
	
	/*
	switch(Ln){
	case 100:
		System.out.println("long타입 사용??");
	default
		System.out.println("안되는군!");
	}
	switch(iNum%3==0) { =>에러발생.
	System.out.println("논리식도 안되는군~");
	}
	*/
	String title = "자바";
	switch(title) {
	case "자바" : System.out.println("자바 좋아");
		break;
	case "Java" : System.out.println("JAVA Goood");
		break;
	}
	int season = 4;
	switch(season) {
	case 3: case 4:case 5:
		System.out.println("봄입니다.");
		break;
	case 6: case 7:case 8: case9:
		System.out.println("여름입니다.");
		break;
	case 10:
		System.out.println("가을입니다.");
		break;	
	case 11: case 12: case 1: case2:
		System.out.println("겨울입니다.");
	default:
	}
	}
}
	
	
