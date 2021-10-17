package ex04ControlStatement;

public class E06BreakContinue {

	public static void main(String[] args) {
		/*
		  반복문 내에서 break, continue 문을 사용할때는 반드시
		  조건문과 같이 사용해야 한다. 그렇지 않으면
		  Unreachable code 에러가 발생한다.
		 */

		int i = 0;
		while(true) {
			i++;
			System.out.printf("[i가 %d일때\n]", i);
			
			System.out.println("continue이전 출력문");
			if(i%2 == 0) continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
			if(i%3 == 0) break;
			System.out.println("break이후 출력문");
		}
		/*
		 중첩된 반복문 안에서 break문을 만나면 "가장 가까운 반복문 하나"만
		 탈출한다.
		 */
		for(int x=1; x<=5;x++) {
			System.out.println("X=" + x);
			
			for(int y=1; y<=5; y++){
			System.out.println("y=" + y);
			
			if(y==3)
				break;
			}		
		}
	}

}
