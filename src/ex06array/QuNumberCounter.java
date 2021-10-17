package ex06array;

public class QuNumberCounter
{
	/*
	 다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 
	 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 
	 counter 배열에 순서대로 저장하시오.
	 */
	public static void main(String[] args)
	{
		//배열의 선언시 크기만 지정되는 경우 0으로 초기화된다.
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];   // 기본적으로 정의 안하면 0이 들어가게됨.
		
		//i번째 인덱스 요소가 만약 1이라면 i번째 요소를 1 증가시킨다.
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == 1) {
				counter[0] ++;
			}
			else if(answer[i] == 2) {
				counter[1] ++;
			}
			else if (answer[i] == 3) {
				counter[2] ++;
			}
			else if(answer[i] == 4){
				counter[3] ++;
			}
		}
		
		
			System.out.println();
		//couter 배열 출력
		for(int j =0; j<counter.length; j++) {
			System.out.printf("counter["+j+"] => %d ", counter[j]);
			System.out.println();
		}

		

	}

}
