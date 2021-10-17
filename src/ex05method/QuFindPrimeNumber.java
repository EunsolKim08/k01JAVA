package ex05method;

public class QuFindPrimeNumber
{
	/*
	 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 
	 false를 반환하는 메소드를 정의하고, 
	 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.

		isPrimeNumber()

	 */

	public static void main(String[] args)
	{
		for(int i = 2; i<=100; i++) {
			 if((isPrimeNumber(i) == true)) {
				System.out.printf("%d ", i);
			}; 
		}

	}

	static boolean isPrimeNumber(int num) {
		//정수가 7일때 소수인지 판단하는 로직(2~6까지 나눠보면됨)
		boolean judge = true;
		// 만약 1과 자신을 제외한 숫자로 나누어 떨어지면 
		//소수가 아닌 것으로 판단한다.
		
		/*정수가 n일때는 n-1까지 나눠보면 됨.
		 for(int i = 2; i<=(n-1);i++){
		 	if( n% i == 0) {
		 		return false;
		 	}
		 }
		 */
		for(int j = 2; j<=100; j++) {	
			if(num>=j) {           //
				if(num != j) {	
					if((num % j == 0)) {
						judge= false;
					}
				}
			}
			else break;
		}
		//위의 반복문을 벗어나면 소수로 판단한다.
		return judge;
	}
}
