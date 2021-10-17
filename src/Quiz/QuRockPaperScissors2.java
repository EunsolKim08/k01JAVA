package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongNumberException extends Exception{
	public WrongNumberException() {
		super("가위바위보 할 줄 모르세요?"
				+ "제대로 내세요^^;");
	}
}
class WrongNumberException2 extends Exception{
	public WrongNumberException2() {
		super("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요..");
	}
}
public class QuRockPaperScissors2 {

	public static boolean judgeEnd() {
		Scanner scanner = new Scanner(System.in);
		int con;
		while(true) {
			con = scanner.nextInt();
			try {
				if(!(con == 0 || con == 1)) {
				WrongNumberException2 wr2 = new WrongNumberException2();
				throw wr2;
				}
			}catch(WrongNumberException2 e) {
				System.out.println("가위바위보 입력오류22(범위내숫자만 입력)");
				//System.out.println(e.getMessage());
			}
			if(con == 0) {
				return false;
			}
			else if(con == 1)
				return true;
			
		}
	}
	public static void rsepJudge(int me, int computer) {
		
		if((me==2 && computer ==1) || (me==3 && computer ==2) 
				|| (me==1 && computer ==3)){
			System.out.println("이겼습니다.");
		}
		else if((me==2 && computer ==2) || (me==3 && computer ==3) 
				|| (me==1 && computer ==1)) {
			System.out.println("비겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		boolean judge = true;
		
			while(judge = true){
			while(i<=5) {
				System.out.printf("무엇을 내겠습니까?(1:가위, 2:바위, 3:보) : ");
				int me = 0;
				try {
					me = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("가위바위보 입력오류22(숫자만 입력)");
					e.printStackTrace();
					System.exit(0);
				}
				try {
					if(!(me == 1 || me ==2 ||  me ==3)){
					WrongNumberException wr = new WrongNumberException();
					throw wr;
					}
					
				}catch(WrongNumberException e) {
					System.out.println(e.getMessage());
				}
				
				int computer = (int)((Math.random()*100)%3+1);
				
				String computer1 = null;
					
				if(computer == 1) {
					computer1 ="가위";
				}
				else if(computer == 2) {
					computer1 ="바위";
				}
				if(computer == 3) {
					computer1 ="보";
				}
				switch(me) {
				case 1 :{
					System.out.println("사용자: 가위, 컴퓨터: " + computer1);
					rsepJudge(me,computer);
					i++;
				}
					break;
				case 2:{
					System.out.println("사용자 : 바위, 컴퓨터: "+ computer1);
					rsepJudge(me,computer);
					i++;
				}
					break;
				case 3:{
					System.out.println("사용자 : 보, 컴퓨터: " + computer1);
					rsepJudge(me,computer);
					i++;
				}
					break;
					}				
				
				if( i > 5) {  
					System.out.printf("5번의 게임이 끝났습니다. 게임을 계속 하시겠습니까? "
							+ "재시작(1), 종료(0) : ");
					try {
					judge= judgeEnd();
					}
					catch(InputMismatchException e) {
						e.printStackTrace();
						System.exit(0);
					}
					if(judge == false) {
						System.out.println("게임종료");
						return;
					}
					else {
						System.out.println("게임재시작");
						i = 1;
					}
				}
			}
			}
		}
}

