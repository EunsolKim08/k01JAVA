package ex06array;

public class E05TwoDimArray01
{	/*
	아래와 같이 2차원 배열을 초기화하면 세로 3 가로4인 배열이
 	생성된다. 초기화할 요소가 없는 부분은 null, 빈값이 된다.
 	스페이스와 같은 공백문자 혹은 0과는 다르다는 것에 주의하자
 	*/

	public static void main(String[] args)
	{
		int [][] arr = {
			{1,2},    //1은 (0,0) 2는 (0,1)
			{3,4,5}, //3은(1,0) 4는 (1,1) 5는 (1,2)
			{6,7,8,9}  //6은(2,0) 7은(2,1) 8은(2,2) 9는(3,2) 
		};//3 *4의 2차원 배열발생
		
		System.out.println("배열의 세로크기: " + arr.length);
		System.out.println("배열명이 가진 값 출력(arr)" + arr); // 주소값 출력
		
		//세로행의크기만큼 반복한다.
		for(int i = 0; i<arr.length;i++) {
			/*
			 각 행의 가로크기는 초기화된 상태에 따라 다를 수있다.
			 0행은 2, 1행은 3, 2행은 4의 크기를 갖는다.
			 초기화가 안된 부분들은 null값이 차지한다.
			 */
		System.out.printf("%d행의크기: %d\n",i,arr[i].length);
		}
		System.out.println("배열출력하기");
		System.out.println("arr[0][1]= "+ arr[0][1]);
		//System.out.println("arr[0][3]= "+ arr[0][3]);
	// 위의코드 에러발생=> NULL이기 때문
		/*
		 ArrayIndexOutofBoundsException 예외가 발생된다.
		 즉, 배열의 index를 초과했다는 뜻이다.
		 */
	}

}
