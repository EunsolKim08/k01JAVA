package ex11static;

class NoSingleTone{
	int instVar;
	public NoSingleTone() {
		
	}
}
class SingleTone{
	int shareVar;
	/*
	 JVM에 의해 생성되어 프로그램이 시작될때 정적변수는
	 미리 메서드 영역에 생성되어 사용할 준비를 마치게된다.
	 */
	private static SingleTone single = new SingleTone();
	private SingleTone() {
		/*
		 private이기때문에 new로 외부에서 객체 생성 불가
		 */
	}
	//SingelTone의 객체를 반환한다는 뜻.
	/*
	 정적메서드로 선언된 getInstance()메서드에서 해당 객체를
	 외부로 반환한다.
	 */
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar = %d", shareVar));
	}
}
public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		/*
		 일반적인 방식의 객체생성이므로 객체를 생성할때마다
		 새로운 참조값(주소값)을 할당받는 인스턴스가 된다.
		 */
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar =100;
		System.out.println("nst1= "+ nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar =200;
		System.out.println("nst2= "+ nst2);
		
		/*
		SingleTone st1 = new SingleTone();
		*/
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		/*두개의 객체가 생성된것처럼 보이지만, 하나의 객체 getInstance만 생성된거라
		하나의 객체에 뒤집어쓴것처럼 보인다.
		*/
		System.out.println(String.format("st2의 주소: %s", st2));
		System.out.println(String.format("st3의 주소: %s", st3));
		System.out.println(String.format("st2의 shareVar: %d", st2.shareVar));
		System.out.println(String.format("st3의 shareVar: %d", st3.shareVar));
	}

}
