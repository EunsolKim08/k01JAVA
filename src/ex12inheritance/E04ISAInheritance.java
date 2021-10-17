package ex12inheritance;
/*
 Is-A 관계
 : X is a Y =>X는 Y의 일종이다로 상속적인 문법으로 표현가능
 - 노트북은 컴퓨터의 일종이다.
 -휴대폰은 전화기의 일종이다.
 이와같이 Is-A 관계가 성립하는 개체를 상속으로 표현하기에
 적합하다.
 */
//컴퓨터: 기본적인 컴퓨팅 환경을 제공하여 입력된 내용을 계산하다.
class Computer{
	//소유주를 표현한 멤버변수
	String owner;
	
	//public Computer() {}
	/*
	 생성자를 개발자가 추가하면 디폴트 생성자를 생성되지 않는다.
	 */
	public Computer(String name) {
		owner = name;
	}
	/*
	 private 접근지정자로 선언된 멤버메서드는 외부클래스 혹은 상속받은
	 클래스에서 접근이 불가능하므로, public으로 선언된 메서드를 통해
	 간접 호출해야 한다.
	 상속관계라면 protected로 선언된 메서드로 호출할수도 있다.
	 */
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() {
		keyboardTouch();
		calculate();
	}
}
/*
 컴퓨터를 상속한 노트북 컴퓨터
 : 컴퓨터가 가지고 있는 기본기능에 휴대이용 부분을 확장하여
 정의한다. 휴대이용을 위해 배터리 멤버변수가 추가된다.
 */
class NotebookComputer extends Computer{
	//자식클래스에서 확장한 변수(배터리 표현)
	int battary;
	
	/*
	 부모생성자 호출을 위해 사용하는 super()는 생략이 가능하지만
	 앞에 다른문장이 먼저오면 오류가 발생되므로 주의해야한다.
	 여기서 부모의인자생성자를 호출하고있다.
	 */
	public NotebookComputer(String name, int initCharge) {
		/*
		 여기서 아래 super문장을 삭제하면 에러가 발생한다.
		 부모클래스에서 인자생성자를 정의하였으므로 디폴트 생성자는 만들어지지
		 않기 때문이다.
		 */
		super(name);
		battary = initCharge;
	}
	//배터리 충전을 표현한 메서드
	public void charging() {
		battary += 5;
	}
	//휴대하면서 컴퓨팅을 하는 것을 표현한 메서드
	public void movingCal() {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.print("이동하면서");
		
	//private으로 선언된 멤버메서드이므로 직접 호출할 수 없다.
	//	keyboardTouch();//에러발생
	//	calculate();//에러발생
		
		calculateFunc();
		battary -=1;
	}
}
/*
 테블릿 노트북 : 컴퓨터의 기본인 계산기능, 휴대이용 기능,
 여기에 펜으로 드로잉 할 수 있는 기능까지 추가된 컴퓨터.
 */
class TabletNotebook extends NotebookComputer{
	//
	String registPencil;
	//생성자
	public TabletNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	//테블릿 사용을 위해 배터리양 체크 및 등록된 펜인지 확인
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		/*
		 A.compareTo(B):문자열  A와 B를 비교하여 0이 반환되면 같은 문자열로 판단하고,
		 -1이나 1이 반환되면 서로 다른 문자열로 판단하는 String클래스 메서드.
		 */
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
		return;
		}
		movingCal();
		System.out.println("스크린에 펜으로 그림을 그리다.");
		battary -=1;
	}
}
public class E04ISAInheritance {

	public static void main(String[] args) {
		
		NotebookComputer noteBook = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");

		System.out.println("==노트북컴퓨터사용==");
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		
		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234"); //정상사용
		System.out.println("==XYZ-9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876"); //사용불가
	}

}
