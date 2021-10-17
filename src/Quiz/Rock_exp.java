package Quiz;
import java.util.InputMismatchException;
/*
 강사님 예제를 바탕으로 예외처리하기
 */
import java.util.Random;
import java.util.Scanner;
//개발자 정의 예외 클래스
class WrongNumberException extends Exception{
	public WrongNumberException() {
		super("[예외발생]숫자를 잘못 입력햇습니다.");
	}
}
public class Rock_exp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; 
		
		
		while(true) {
			//1. 난수생성 - 컴퓨터입장에서 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의 난수
			System.out.println("컴퓨터:"+ com);
		
			int user = 0;
			try {
			//2. 사용자입력 
			System.out.println("가위바위보를 입력하세요.");
			System.out.print("가위(1), 바위(2), 보(3)=>");
			user = scanner.nextInt();
			/*
			 숫자외에 문자를 입력하면 메서드내에서 예외가 발생하므로
			 엔터키가 버퍼에 남게된다.
			 */
			//사용자가 1미만 혹은 3초과된 숫자를 내는 경우
			if(user<1 || user>3) {
				WrongNumberException wne = new WrongNumberException();
				throw wne;
			}
			}catch (InputMismatchException e) {
				scanner.nextLine(); // 무한루프공백오류해결, 버퍼에 남아있는 엔터키를 제거
				System.out.println("가위바위보 입력오류(숫자만 입력)");
			}
			catch(WrongNumberException e) {
				System.out.println("게임과 관련된 숫자만 입력하세요(1~3사이");
			}
			//3.승부판단		
			//사용자가 정상적으로 입력한 경우
			if(!(user<1 || user>3)) {
				//승부판단 로직2 : 입력한 수의 차를 이용해 승부를 판단한다. 
				System.out.printf("사용자:%s, 컴퓨터:%s ", displayRPS(user), displayRPS(com));	
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}
				
				gameCount++;//게임카운트 증가		
			}
			else {
				System.out.println("가위바위보 할줄 몰라요?? 제대로 내세요 ㅋ");
			}
			
			//4.게임재시작 여부 확인			 
			if(gameCount>=5) {
				int restart;
				while(true) {
					//0과 1을 입력해야지만 재시작 되도록 무한루프로 구성한다. 
					try {
					System.out.print("게임재시작(1), 종료(0):");
					restart = scanner.nextInt();
					}catch(InputMismatchException e) {
						
					}
					if(restart==0 || restart==1) {
						//정상입력이면 루프탈출
						break;
					}
					else {
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}								
				if(restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임 재시작^^");
					gameCount=0;
				}
			}
		}		
	}
	
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str="가위";break;
		case 2: str="바위";break;
		case 3: str="보";break;
		}
		return str;
	}
}
