package ex05method;

import java.util.Scanner;

/*
시나리오] 인원수를 매개변수로 전달받아 인원수 만큼 나이를
입력받아 그 나이의 합을 반환하는 메소드를작성하시오
*/

public class E05MethodType04_1 {

	public static void main(String[] args) {
		
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합은? " +sumOfAge);

	}
	static int getTotalAge(int personCnt) {
		Scanner scanner = new Scanner(System.in);
		
		int sumAge=0;
		
		for(int i = 1; i<=personCnt; i++) {
			System.out.print(i + "번째 사람의 나이: ");
			int age = scanner.nextInt();
			sumAge += age;
		}
		return sumAge;
		//나이의 값을 반환한다
	}
}
