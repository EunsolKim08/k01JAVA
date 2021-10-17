package ex08class;
/*
 추상화: 현실세계의 사물을 클래스로 형상화 하는 것을 추상화라고 한다.
 	Person클래스는 "사람"의 일반적인 사항을 추상화 하고 있다.
 */

class Person{
	//큰 Person 지역의 변수 멤버변수 이기 때문에 메소드 안에서 쓸 수 있다.
	/*
	 멤버변수: 클래스에ㅓㅅ 주로 데이터(속성)을 표현한다.
	 */
	String name = "정우성";
	int age  = 47;
	String gender = "남자";
	String job = "영화 배우";
	
	//static void가 아니어도됨. class가 main클래스가 아닌 Person클래스 소속이기 때문.
	/*
	 멤버 메서드: 클래스에서 객체의 동작(행위)를 표현한다.
	 클래스외부에서 호출할때는 객체의 참조변수를 통해서 호출한다.
	 
	 멤버 변수는 멤버메서드 내에서 즉시사용 가능하다.
	 */
	void eat() {
		System.out.printf("%s가(이) 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가(이) 잠자고 있다\n", age, name);
	}
}
public class E01PersonMain
{

	public static void main(String[] args)
	{
		/*
		 Person 클래스를 통해 객체(인스턴스)를 생성한다.
		 생성시 할당된 주소값을 반환한다.
		 */
		Person person = new Person(); // Person클래스 소속의 person객체
		
		//객체의 참조변수를 통해 멤버메서드를 호출할 수 있다.
		person.eat();
		person.sleep();
		
		//객체 생성 후 참조변수에 저장하지 않고 즉시 멤버메서드를 호출 할 수 있다.
		new Person().eat();
		new Person().sleep();
	}

}
