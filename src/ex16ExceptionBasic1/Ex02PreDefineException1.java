package ex16ExceptionBasic1;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PreDefineException1 {

	static Date toDay;
	public static void main(String[] args) {
		
		System.out.println("###ArrayIndexOutOfBoundsException ###");
		//크기가 2인 배열을 선언
		int[] intArr = new int[2];
		try {
			/*
			 항상 try문으로 진입 후 예외가 발생하면 
			 catch문 실행함.
			 */
			intArr[0] = 100;
			System.out.println("0번방은: "+ intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은: "+ intArr[1]);
			//예외가 발생하는 지점
			intArr[2]= 300; //JVM이 throw한 예외객체를 catch절에서 잡아 처리한다.
			//예외가 발생하기 때문에 앗~ 이방은?의 문장은 실행되지 않는다.
			System.out.println("앗~ 이방은? " + intArr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했어요");
			System.out.println("예외메세지: "+e.getMessage());
			e.printStackTrace(); //예외메세지3(가장 많이 사용됨)
		}
		System.out.println("0번방 재출력: " + intArr[0]);
		System.out.println("==ArrayindexOutOfBoundsException발생 후 ==");
		//실행의 흐름이 중단되지 않으므로 마지막까지 실행된 후 종료된다.
		
		}
	}


