package ex17Collection;

import java.util.Scanner;
/*
 친구를 포함한 최상위 클래스로 해당 프로그램에서는
 friend클래스로 객체생성은 하지 않을 것이다.
 상속의 목적으로만 정의된 클래스이다.
 */

class Friend{
	String name; //이름
	String phone; //전화번호
	String addr; //주소
	
	//생성자
	public Friend(String name, String phone, String addr) {
		this.name= name;
		this.phone= phone;
		this.addr = addr;
	}
	//멤버변수 전체정보 출력용 멤버메서드
	public void showAllData() {
	System.out.println("이름: " +name);
	System.out.println("전화번호: " +phone);
	System.out.println("주소: " +addr);
	}
	/*
	 간략 정보를 출력하는 용도의 멤버메서드로 실행부가 없는 상태로 정의한다.
	 해당 프로그램에서는 오버라이딩의 목적으로만 사용된다.
	 */
	public void showBasicInfo() {}
}

//고딩친구
class HighFriend extends Friend{
	//확장한 멤버변수
	String nickname; //별명
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		//부모클래스의 생성자 호출
		super(name,phone,addr);
		//자신의 멤버변수 초기화
		this.nickname = nickname;
	}
	/*
	 고딩친구의 전체정보를 출력하기 위해 부모에서 정의된 메서드를 super를
	 통해 호출하고, 자식에서 확장한 변수를 별도의 print문을 통해 출력한다.
	 */
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명: " +nickname);
	}
	/*
	 자식에서 오버라이딩하여 재정의한 메서드로 고딩친구의
	 간략한 정보를 출력한다.
	 */
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명: " +nickname);
		System.out.println("전번: " + phone);
	}
}
//대딩친구
class UnivFriend extends Friend{
	String major; //자식쪽에서 확장한 멤버변수인 전공.
	public UnivFriend(String name, String phone, String addr, String major) {
	super(name,phone,addr);
	this.major = major;
	}
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: " + major);
	}
	
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("이름: " +name);
		System.out.println("전화번호: " + phone);
	}
}
public class E06MyFriendInfoBook {

	public static void menuShow() {
		System.out.println("###메뉴를 입력하세요 ###");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>> ");
	}
	public static void main(String[] args) {
	
		//기능을 담당하는 핸들러 클래스의 객체 생성
		//초기값으로 100명의 정보를 저장할 수 있는 Friend타입의 객체배열 생성
		FriendInfoHandler handler = new FriendInfoHandler(100);
		Scanner scanner = new Scanner(System.in);
		/*
		 무한루프 조건으로 특정 입력에만 종료할 수 있는 
		 구조를 만들어준다.
		 */
		while(true) {
			menuShow();
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;//break문을 만나면 switch문을 탈출한다.
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break; 
			case 5:
				//System.out.println("검색");
				handler.searchInfo();
				break; 
			case 6:
				//System.out.println("삭제");
				handler.deleteInfo();
				break; 
			case 7:
				System.out.println("프로그램종료");
				return; // main에서의 종료이므로 프로그램 자체의 종료로 이어진다.
			} //switch 끝
		}//while 끝
	}// main끝
} //class끝
