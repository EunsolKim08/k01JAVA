package Quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 	게임설명 : 업다운게임을 메소드를 이용해 구현한다.
	컴퓨터는 1~100사이의 숫자 하나를 생성한다.
	총 시도횟수는 7번을 부여한다.
	사용자는 7번의 시도안에 숫자를 맞춰야 한다.
	사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
	7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
	성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
	함수를 사용하여 구현한다.
	무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

	업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
	숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
	클래스명 : NumberRangeException
	게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.

 */
class NumberRangeException extends Exception{
	public NumberRangeException() {
	super("잘못 입력하셨습니다. 1과 100사이의 수를 입력하세요: ");
	}
}

public class QuUpDownGame {
	static boolean UpDownGame(int user, int com) {
		if(user == com) {
			System.out.println("컴퓨터의 숫자를 맞추는데 성공하셨습니다.");
			return true;
		}
		else if(user < com) {
			System.out.println("컴퓨터의 숫자는 사용자가 입력한 숫자 " +user + "보다 큽니다.");
			return false;
		}else {
			System.out.println("컴퓨터의 숫자는 사용자가 입력한 숫자 " + user + "보다 작습니다.");
			return false;
		}
	}
	static boolean judgeEnd(int j) {
		while(true) {
			if(j == 0) {
				return false;
			}
			else if(j == 1)
				return true;
			else 
				System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요..");
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		int user = 0;
		int cnt = 1;
		int continueGame = 0;
		boolean judge;
		int ranodom1 = 0;
		int com = random.nextInt(100)+ 1;
	
		System.out.print("컴퓨터에서 생성한 숫자를 맞추세요: ");
		
		// System.out.println(com); => 컴퓨터 랜덤숫자 확인용
		while( cnt<=7 ) {
			try {
				user = sc.nextInt();
			}
			catch(InputMismatchException e){
				e.printStackTrace();
				System.exit(0);
			}
		
			try	{
				if(!(user>=1 && user <=100)) {
					NumberRangeException ex1 = new NumberRangeException();

					throw ex1;
				}
			}
			catch(NumberRangeException e ) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			boolean game = UpDownGame(user,com);
			if(game == true) {
				break;
			}
			else 
				cnt++;
			
			if( cnt > 7) {
				System.out.println("7번의 게임이 끝났습니다. 게임을 계속하시겠습니까?"
						+ "재시작(1), 종료(0): ");
				try {
					continueGame = sc.nextInt();
				}catch(InputMismatchException e) {
					e.printStackTrace();
					System.exit(0);
				}
				judge= judgeEnd(continueGame);
				if(judge== false) {
					System.out.println("UpDownGame을 종료합니다.");
					return;
				}
				else {
					System.out.println("UpDownGame을 재시작합니다.");
					cnt = 1;
					com = random.nextInt(100)+ 1;
					//System.out.println(com); => 컴퓨터 랜덤숫자 확인용
					System.out.print("컴퓨터에서 생성한 숫자를 맞추세요: ");
				}
			}
		}
	}
}
