package ex06array;

import java.util.Scanner;

public class QuSungJuk
{

	/*
	 1] 학생수를 사용자로부터 입력받는다.
		-Scanner클래스 사용
	2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
	3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
		-Scanner클래스 사용
	4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
	5] 이 문제는 2차원 배열을 활용하는 문제이다.

		 */
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.printf("학생수를 입력하세요? ");
		int num = scanner.nextInt();
		int[][] student = new int[num][3];
		int[] sum = new int[num];
		double[] avr= new double[num];
		System.out.println("학생수: " + num);
		
		/*
		 입력받은 학생수만큼 반복
		 학생의 점수와 총점, 평균을 입력할 2차원 배열 선언
		 
		 int numberOfStudent = scanner.nextInt();
		 int[][] jumsuArr = new int[numberOfStudent][5]; // 총점과 평균을 뒤에 이차원 배열에 넣어줌
		 for(int i = 0; i< numberOfStudent;i++){           //배열은 0부터지만, 그 이외의 명시적인 시작은 1부터임
		 System.out.print("국어점수 입력?: ");
		 int kor = scanner.nextInt();
		 System.out.print("영어점수 입력?: ");
		 int eng = scanner.nextInt();
		 System.out.print("수학점수 입력?: ");
		 int math = scanner.nextInt();
		 
		 //배열에 입력한다. 명시적으로 흘러가지를 보기 위해 kor,eng,math를 쓴 후 집어 넣은 것임.
		 jumsuArr[i][0] = kor;
		 jumsuArr[i][1] = eng;
		 jumsuArr[i][2] = math;
		 
		 //총점과 평균을 구한다.
		  int sum=0;
		 for(int i = 0; i<numberOfStudent ;i++){		 //학생수를 의미
			for(int j =0; j<3;j++){	  //과목(국영수)를 의미
				//i번째 학생의 국, 영, 수 점수의 총점을 구함
				sum+= jumsuArr[i][j];
			}
			jumsuArr[i][3] = sum; // 총점을 배열에 입력
			jumsuArr[i][4] = sum/3; // 평균값을 배열에 입력
		 }
		 
		 //결과 출력
		  
		  System.out.println("==============================");
			System.out.println("NO KOR ENG MAT TOT AVG");
			System.out.println("==============================");
		  for(int i = 0; i<numberOfStudent ;i++){		 //학생수를 의미
				for(int j =0; j<5;j++){	       //과목, 총점, 평균까지 출력
		  			System.out.printf("%d ", jumsuArr[i][j]);
		  		}
		 		System.out.println();
			}
		}	
		 */
		
		for(int i = 0; i<student.length;i++) {		
			System.out.println("["+(i+1)+"번째 학생의 점수 입력]");
			
			System.out.print("국어점수 입력?: ");
			student[i][0] = scanner.nextInt();
			sum[i] +=student[i][0];
			System.out.print("수학점수 입력?: ");
			student[i][1] = scanner.nextInt();
			sum[i] +=student[i][1];
			System.out.print("영어점수 입력?: ");
			student[i][2] = scanner.nextInt();	
			sum[i] +=student[i][2];
			avr[i] = sum[i]/(3.0);
		}
		System.out.println("==============================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("==============================");
		for(int i =0; i<student.length;i++) {
			System.out.printf("%-2d %-2d %-2d %-2d %-2.2f\n", (i+1),
					student[i][0],student[i][1], student[i][2],avr[i]);
		}
		
		System.out.println("==============================");
		
	
	
	}

}
