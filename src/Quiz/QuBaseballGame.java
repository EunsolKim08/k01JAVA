package Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 1.중복되지 않는 3개의 정수를 생성한다.(1~9)
 2.사용자는 3개의 숫자를 입력한다. O
 3.생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다. O
 4.숫자와 숫자의 위치까지 일치하면 strike 로 판정한다. O
 5. 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다. O
 6. 숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
 7. 3 strike 가 되면 게임은 종료된다. O
 8. 시도한 횟수를 표시한다.  O
 9. 계속할지 종료할지 여부를 물어보고 다음 진행을 한다 O
 */

 
public class QuBaseballGame {
	
	public static boolean judgeConinue() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("게임을 계속하시겠습니까? 계속(1) 종료(1 이외의 숫자)");
		int answer = sc.nextInt();
		
		if(answer == 1) {
			return true;
		}
		else {
			System.out.println("===게임이 종료됩니다===");
			return false;
			}
	}
	
	public static void randomComputer(int[] com, int num) {
		Random random = new Random();
	
		for(int i = 0; i <num; i ++) {
			com[i] = random.nextInt(9)+1 ;
			for(int j = 0; j<i;j++) {
				if(com[i] ==com[j]) {
					i--;
				}
			}
	    }
		/*for(int i = 0; i <num ;i++)
		System.out.println("컴퓨터가 생성한 "+(i+1)+"번째 숫자"+ com[i]); //랜덤 생성 확인용
		*/
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[3];
	    int[] user = new int[3];	    
	    String answer;
	    int cnt = 0;
	    boolean judge = true;
	    
	   while(judge == true) {
		   System.out.println((++cnt)+"번째 게임입니다.");
		   int strike = 0, ball = 0, out = 0;   
	    System.out.println("컴퓨터가 (1~9)까지 3개의 랜덤수를 생성합니다. ");
	    randomComputer(com,3);
	    
	    System.out.println("사용자는 숫자를 입력하세요.");
	    for(int i = 0; i <3; i++) {
	    	System.out.printf((i+1)+"번째 숫자 입력 : ");
	    	user[i] = sc.nextInt();
	    	//System.out.println("사용자가 입력한 "+ (i+1)+ "번째 숫자"+ user[i]); // 사용자 입력 확인용
	    }
	    
	    for(int i = 0; i<3 ; i++) {
	    	for(int j = 0; j<3; j++) {
	    		if(com[i] == user[j]) {
	    			if( i == j) 
	    				strike++;    			
	    			else 
	    				ball++;
	    		}
	    	}
	    }
	  
	    if(strike == 0 && ball ==0) {
	    	out++;
	    	System.out.println("아웃입니다.");
	    }
	    
	    System.out.println("스트라이크 숫자: " + strike);
	    System.out.println("볼 숫자: " + ball);
	    System.out.println("아웃 숫자: " + out);
	    
	    if(strike == 3) {
	    	System.out.println("***3스트라이크로 게임이 종료됩니다***");
	    	break;
	    }    
	   judge = judgeConinue();
	   }    	
	}
}
