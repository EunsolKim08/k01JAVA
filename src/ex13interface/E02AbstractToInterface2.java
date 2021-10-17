package ex13interface;
/*
 추상클래스를 인터페이스로 변경하기
 abstract class =>interface
 메서드인 경우 public abstract 제거
 멤버변수인 경우 public static final 제거
 
 */
interface IPersonalNumberStroage{
	 void addPersonalInfo(String juminNum, String name);
	 String searchPersonalInfo(String juminNum);
}

class PersonInfoVO{
	private String name;
	private String juminum;
	/*
	 DTO에서 VO로 명칭만 변경
	 */
	public PersonInfoVO(String name, String juminum) {
		super();
		this.name = name;
		this.juminum = juminum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJuminum() {
		return juminum;
	}
	public void setJuminum(String juminum) {
		this.juminum = juminum;
	}
}
/*
 클래스가 클래스를 상속할 때 => extends
 클래스가 인터페이스를 상속할 때 =>implements
 드물지만 인터페이스가 인터페이스를 상속할 때 => extends
 
 extends는 '상속', implements는 '구현'이라 표현한다.
 */
class PersonalNumberStorageImpl implements IPersonalNumberStroage{
	PersonInfoDTO[] personalArr;; // 정보저장용 객체배열
	int numOfPerInfo;//입력정보 카운트용 변수
	//생성자
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonInfoDTO[arrSize];
		numOfPerInfo = 0;	
	}
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonInfoDTO(name, juminNum);
		numOfPerInfo++;
	}
	/*
	 주민번호를 인자로 객체배열을 검색한 후 정보를 반환한다.
	 */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i = 0; i<numOfPerInfo;i++) {
			/*
			 멤버변수를 private으로 선언했으므로 외부에서는 접근할 수 없다.
			 이럴 때 getter메서드를 통해 접근하여 값을 얻어올 수 잇다.
			 */
			if(juminNum.compareTo(personalArr[i].getJuminum())==0) {
				return personalArr[i].getName();
			}
		}
		return null; //검색결과가 없는 경우 null 반환
	}
}
public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		//10명의 정보를 저장할 수 있는 객체배열 생성.
		PersonalNumberStorageImpl storage = new PersonalNumberStorageImpl(10);
		//정보 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		//정보 검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}

}
