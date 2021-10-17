package ex07string;

public class E01StringBasic
{
	public static void main(String[] args) {
		
		/*
		 기본자료형의 경우 비교연산자(==)를 통해 값에 대한 비교를 한다.
		 */
		int num1=10, num2=20;
		String numResult = (num1==num2)? //삼항연산자 복습하기
				"데이터가 같다" : "데이터가다르다";
		System.out.println("비교결과: " + numResult);
		
		/*
		 String클래스의 객체생성방법1
		 	:new를 이용한다. new를 사용하면 동일한 문자열
		 	이더라도 항상 새로운 메모리를 생성한다.
		 */
		String str1 = new String("Hello Java");
		String str2 = new String("Hello Java");
		/*
		 str1, str2는 String 객체의 참조값을 가지고 있으므로
		 아래의 비교는 단순한 참조값(주소값)비교를 하게된다.
		 2개의 객체가 생성되므로 참조주소는 다르다는 결과를 출력한다.
		 */
		/*
		 결과가 같다고 나와야할꺼지만,
		 Heap에 만들어진 주소값이 다르기때문에 참조주소가 다르다고
		 나온다.
		 따라서 String 객체에 있는 문자열을 비교하기 위해서는 equal문
		 을 이용해야함.
		 */
		if(str1==str2) { 
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		/*
		 equals메서드
		 : Object클래스로부터 상속받은 메서드로 실제 저장된 문자열을
		 비교하도록 만들어진 메서드이다. 즉 객체에 저장된 실제
		 문자열에 대한 비교가 이루어진다.
		 */
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}else {
			System.out.println("두 문자열은 다르다");
		}
		/*
		 String클래스의 객체생성 방법2
		 : "더블쿼테이션"을 사용한다. 이 경우 내용이 동일하다면 동일한
		 주소를 이용하게된다. 즉 새로운 객체를 생성하지 않는다.
		 따라서 주로 String 객체는 이와같이 생성한다.
		 */
		String str3 = "KOSMO";
		String str4 = "KOSMO";
		
		System.out.println("equals()메소드로 문자열비교: "+ str3.equals(str4));
	
		if(str3 == str4) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
	}
}
