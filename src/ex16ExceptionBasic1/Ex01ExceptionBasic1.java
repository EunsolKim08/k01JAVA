package ex16ExceptionBasic1;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args)  {
	
	/*
	 Syntax에러(구문에러, 문법에러)
		 : 실행자체가 안되는 코드로 오류로 구문을
		 수정해야만 프로그램이 실행됨
	 */
	/*Int number = 10;
	if(true);
	{}
	else
	{}
	*/
	
	int number = 10;
	if(true) {
		System.out.println("참이다");
	}
	else {
		System.out.println("거짓이다");
	}
	/*
	 외부자원을 사용할 때 발생되는 예외
	 처리방법1] main()메서드 밖으로 예외를 던진다. 이것을 "예외던지기"
	 라고 표현하고, 내부에서 예외를 처리하지 않고 무시하겠다는 의미이다.
	 이 경우 main()throws IOException처럼 작성하면 된다.
	 */
	
	/*
 	처리방법2]예외가 발생한 지점을 try~catch문으로 직접 예외처리한다.
	 */
	System.out.print("문자하나를 입력하세요: ");
	try {
		int iChar = System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
