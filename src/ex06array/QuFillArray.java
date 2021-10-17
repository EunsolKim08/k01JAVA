package ex06array;

import java.util.Scanner;

public class QuFillArray
{
	/*
	 길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
		그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] numArr1 = new int[10];
		int[] numArr2 = new int[10];
		int a =0, b=9; // int indexStart = 0, indexEnd = numArr2.length-1;
		
		for(int i = 0; i<numArr1.length;i++) {
			System.out.printf((i+1)+"번 째 정수를 입력하세요: ");
			numArr1[i] = scanner.nextInt();
		}
		System.out.println("");
		
		System.out.println("순서대로 입력된 결과");
		for(int i = 0; i<numArr1.length;i++) {
			System.out.printf("%d ",numArr1[i]);
		}
		System.out.println("\n");
		
		for(int i = 0; i<numArr1.length;i++) {
			if(numArr1[i] %2 == 0) {
				numArr2[a] = numArr1[i];
				a++;
			}
			else {
				numArr2[b] = numArr1[i];
				b--;
			}
		}
		/*
		 if(inputNum%2==0){
		 	arr2[indexEnd--] = inputNum;    =>나는 그냥 numArr2[indexEnd--] = numArr1[i];인듯
		 else{
		 	arr2[indeStart++] = inputNum;
		 	}
		 }
		 */
		/*
		 만약 인덱스를 전위 증가 혹은 감소시키게 되면
		 변수의 값이 면저 변하므로 잘못된 결과가 나온다. 해당 인덱스에
		 먼저 값을 변경시켜야 하므로 후위증가 하여야 한다.
		 */
		System.out.println("홀수/짝수 구분 입력결과");
		for(int j = 0; j<numArr1.length;j++) {
			System.out.printf("%d ",numArr2[j]);
		}
		System.out.println("\n");	
	}

}
