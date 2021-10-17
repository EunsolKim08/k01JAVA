package ex06array;

import java.util.Scanner;

public class practice
{

	public static void main(String[] args)
	{
		
			Scanner scanner= new Scanner(System.in);
			System.out.printf("학생수를 입력하세요? ");
			
			 
			 int numberOfStudent = scanner.nextInt();
			 int[][] jumsuArr = new int[numberOfStudent][5]; // 총점과 평균을 뒤에 이차원 배열에 넣어줌
			 for(int i = 0; i< numberOfStudent;i++){           //배열은 0부터지만, 그 이외의 명시적인 시작은 1부터임
			System.out.println("["+(i+1)+"번째 학생의 점수 입력]"); 
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
			 }
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
			 
			
			
			
		

	}


