package Quiz;

import java.util.Scanner;

/*
 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
 1.난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
 2.사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
 3. 승부를 판단하여 출력한다.
 4. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
 5.숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
 6.게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
 7.0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */
public class QuRockPaperScissors {
	
public static boolean judgeEnd() {
	Scanner scanner = new Scanner(System.in);
	int i = 1;
	while(true) {
		int con = scanner.nextInt();
		if(con == 0) {
			return false;
		}
		else if(con == 1)
			return true;
		else {
			//return하면 함수가 끝나는데, con이 0 or 1이 아닌 경우 return 값이 없어 끝남
			System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요..");
		}
	}
}
public static void rsepJudge(int me, int computer) {
	/*
	 승부판단
	 switch(user-com){
	 case 0:
	 	System.out.println("비겼습니다."); break;
	 case 1: case-2:
	 	System.out.println("이겼습니다."); break;
	 case 2: case =1:
	 	System.out.println("졌습니다"); break;
	 }
	 */
	
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
	//Random radom = new Rnadom();
	int i = 1;
	boolean judge = true;
	
		while(judge = true){
		while(i<=5) {
			System.out.printf("무엇을 내겠습니까?(1:가위, 2:바위, 3:보) : ");
			int me = scanner.nextInt();
			//int com = random.nextInt(10000)%3 + 1;
			//int gameCount;
			int computer = (int)((Math.random()*100)%3+1);
			/*
			 if(!(user<1 || user>3){
			  if(com ==1 )~
			 	gameCount++;
			 }else{
			 System.out.println("가위바위보 할 줄 모르세요?"
				+ "제대로 내세요^^;");
			 }
			 if(gameCount>=5){
			 }
			 */
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
			default: {
				System.out.println("가위바위보 할 줄 모르세요?"
				+ "제대로 내세요^^;");
				break;
				}				
			}
			if( i > 5) {  // 여기를 if(i==5)로 하면 4번뜨는 오류발생. i++이기때문
				System.out.printf("5번의 게임이 끝났습니다. 게임을 계속 하시겠습니까? "
						+ "재시작(1), 종료(0) : ");
				judge= judgeEnd();
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
