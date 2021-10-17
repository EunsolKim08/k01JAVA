package ex12inheritance;

import java.util.Scanner;
/*
 해당 프로그램에서 기능을 담당하는 클래스를 핸들러 혹은 
 매니저 클래스라고 한다.
 */
public class FriendInfoHandler {
	
	//멤버변수
	//친구의 정보(객체)를 저장할 부모타입의 객체배열
	private Friend[] myFriends;
	//실제 저장된 연락처의 개수
	private int numOfFriends;
	
	//생성자
	public FriendInfoHandler(int num) {
		//num의 크기의 객체배열 생성
		myFriends = new Friend[num];
		//최초 실행시 저장된 객체가 없으므로 0으로 초기화
		numOfFriends = 0;
	}//새로운 친구 연락처 추가
	public void addFriend(int choice) {
		//choice가 1이면 고딩, 2면 대딩친구 추가
		//정보 입력을 위한 객체생성
		Scanner scan = new Scanner(System.in);
		
		String iName, iPhone, iAddr, iNickname, iMajor;
		//연락처의 공통사항
		System.out.print("이름: "); iName= scan.nextLine();
		System.out.print("전화번호: "); iPhone= scan.nextLine();
		System.out.print("주소: "); iAddr= scan.nextLine();
		
		/*
		 1. 친구정보를 입력받은 후
		 2. 객체배열의 0번방에 객체를 저장하고
		 3. numOfFriends를 1증가시킨다. 후위증가이므로 이렇게 처리된다.
		 */
		if(choice ==1) { //고딩친구 입력 후 추가
			System.out.print("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice == 2) { //대딩친구 입력 후 추가
			System.out.print("전공: "); iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName,iPhone,iAddr, iMajor);
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	} //end of addFreinds
	/*
	 친구의 정보를 출력하기 위한 멤버메서드
	 1. 친구정보를 추가할 때 high 또는 Unic객체가 배열에 저장된다.
	 2. 입력시 모든 객체는 Friends로 자동 형변환되어 저장된다.
	 3. 정보 출력시 배열에 입력된 객체수만큼 반복하면서 각요소를 통해
	 멤버메서드를 호출한다.
	 4. 이때 오버라이딩된 메서드를 통해 항상 해당 객체의 정보를 출력할 수 있다.
	 참조변수의 타입에 영향을 받지 않고 항상 오버라이딩된 최하위의 메소드가 호출되기
	 때문이다.
	 */
	
	public void showAllData() { //전체정보출력용 메서드
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체 정보가 출력되었습니다==");
	}
	public void showSimpleData() { //간략정보출력용 메서드
		for(int i = 0; i< numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다==");
	}
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		boolean isFind = false;
		for(int i=0; i<numOfFriends ;i++) {
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllData();
				isFind = true;
				System.out.println("**귀하가 요청하는 정보를 찾앗습니다.**");
			}
		}
		if(isFind == false)
			System.out.println("**귀하가 찾는 정보가 없습니다**");
	}
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		//저장된 데이터만큼 반복
		for(int i=0; i<numOfFriends;i++) {
			//삭제할 이름이 있는지 검색
			if(deleteName.compareTo(myFriends[i].name)==0) {
				//객체를 삭제하기 위해 null값으로 변경한다.
				myFriends[i] = null;
				//삭제된 요소의 index를 저장한다.
				deleteIndex = i;
				//전체카운트를 1차감한다.
				numOfFriends--;
				//하나의 객체를 삭제했다면 즉시 for문 탈툴
				break;
			}
		}
		if(deleteIndex== -1) {
			//검색된 데이터가 없어 삭제되지 않았자면 -1을 유지한다.
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			/*
			 객체 배열에서 검색된 요소를 삭제한 후 입력된 위치의 바로 뒤
			 요소를 앞으로 하나씩 이동시킨다.
			 numOfFriends는 앞에서 1차감되므로 마지막요소는 무시된다.
			 */
			for(int i = deleteIndex; i<numOfFriends;i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다==");
		}
	}
}
