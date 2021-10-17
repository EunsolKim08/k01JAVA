package ex05method;

/*
 메서드 오버로딩(Method Overloading)
 : 동일한 이름의 메서드를 두개이상 정의하는 것을 말한다.
 - 매개변수의 갯수가 다르거나 자료형이 다를 때 성립한다.
 -반환타입만 다른것은 허용하지 않는다.
 -컴파일러는 메서드 호출시 전달되는 파라미터(인자)를 통해
 호출할 메서드를 구분한다.
 */
public class E07Overloading
{

	static void person(int juminNum, int miNum) 
	{
		System.out.println("군필자이시군요");
		System.out.println("주민번호: " + juminNum);
		System.out.println("군번" + miNum);
	}
	static void person(int juminNum)
	{
		//매개변수가 2개인 메서드 호출
		System.out.println("미필자이시거나 여성이시군요");
		//매개변수가 1개인 메서드 호출(여성)
		System.out.println("주민번호" + juminNum);
	}
	/*
	static int person(int juminNum)
	{
		System.out.println("미필자이시거나 여성이시군요");
		System.out.println("주민번호" + juminNum);
		return 1;
	}
	*/
	public static void main(String[] args)
	{
		person(123456, 7890123);
		System.out.println("===============================");
		person(987654);
	}

}
