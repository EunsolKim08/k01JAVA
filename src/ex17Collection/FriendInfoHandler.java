package ex17Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
 해당 프로그램에서 기능을 담당하는 클래스를 핸들러 혹은 
 매니저 클래스라고 한다.
 */
public class FriendInfoHandler {
	ArrayList<Friend> lists;
	//ArrayList<Student> list = new ArrayList<Student>();
	//생성자
	public FriendInfoHandler(int num) {
	lists = new ArrayList<Friend>(); // 나중에 여기 수정~~~
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
		
		if(choice ==1) { //고딩친구 입력 후 추가
			System.out.print("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			//고딩친구 객체를 생성과 동시에 add한다.
			lists.add(high);
		}
		else if(choice == 2) { //대딩친구 입력 후 추가
			System.out.print("전공: "); iMajor = scan.nextLine();
			//대딩친구 객체를 생성과 동시에 add한다.
			lists.add(new UnivFriend(iName,iPhone,iAddr, iMajor));
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	} //end of addFreinds
	/*
	 일반 for문을 통해 컬렉션에 접근한다. 이때에는 인덱스를 사용하므로
	 get()메서드를 활용한다. 컬렉션에 저장된 객체의 갯수는 size()메서드를
	 통해 알 수 있다.
	 */
	public void showAllData() { //전체정보출력용 메서드
		for(int i=0; i<lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체 정보가 출력되었습니다==");
	}
	/*
	 개선된 for문을 이용한다. 인덱스를 사용할 필요가 없으므로 코드는
	 훨씬 더 간결해진다. 컬렉션에 저장된 객체의 갯수만큼 알아서 반복한다.
	 */
	public void showSimpleData() { //간략정보출력용 메서드
		for(Friend fr: lists) {
			fr.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다==");
	}
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		
		/*
		 이터레이터 사용방법
		 1. 컬렉션의 참조변수를 기반으로 이터레이터 객체를 생선한다.
		 2. hasNext()로 출력할 요소가 있는지 검사한다.
		 3. true를 반환하면 next()로 반환한다.
		 단, while문 내에서 next()를 두번 호출하면 다다음 요소가
		 반환되므로 주의해야 한다.
		 */
		Iterator<Friend> itr = lists.iterator();
		while(itr.hasNext()) {	
			Friend fr = itr.next();
			if(searchName.compareTo(fr.name)==0) {
				fr.showAllData();
			}	
			else {
				System.out.println("**귀하가 찾는 정보가 없습니다**");
			}
		}
	}
		
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
	
		for(Friend fr: lists) {
			//삭제할 이름이 있는지 검색
			if(deleteName.compareTo(fr.name)==0) {
				lists.remove(fr);
				deleteIndex = 1; //단순히 삭제여부를 확인하기 위해 변경.
				break;
			}
		}
		if(deleteIndex== -1) {
			//검색된 데이터가 없어 삭제되지 않았자면 -1을 유지한다.
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			System.out.println("==데이터가 삭제되었습니다==");
		}
	}
}
