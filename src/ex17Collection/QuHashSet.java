package ex17Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
/*
 컬렉션 set에 저장된 객체를 이름으로 검색하자. 
 해당 정보가 있으면 해당 어벤져스의 정보를 출력하고 없으면 
 "해당 영웅은 없어요ㅜㅜ" 라는 메시지 출력해야 한다. 검색 부분은 Iterator를 
 통해 구현하도록 한다.set계열의 컬렉션은 기본적으로 중복저장을 허용하지 않는다. 
 그러나 아래와 같이 새롭게 정의한 클래스에 대해서는 equals(), hashCode() 
 메소드를 적절히 오버라이딩 처리해야 중복을 제거할 수 있다. 
 메소드 오버라이딩을 통해 hero4 는 입력되지 않도록 Avengers 클래스를 업데이트 하시오.

 */

class Avengers {
	String name;
	String heroName;
	String weapon;
	
	/*
	 @Override
	 public int hashCode(){
	 	//각 멤버변수의 hashCode 값을 얻어온다. 반환타입은 int형이다.
	 	int nameHCode = this.name.hashCode();
	 	int hereHCode = this.heroName.hashCode();
	 	int weaponHCode = this.wapon.hashCode();
	 	System.out.println("hasCode()호출됨" + nameHCode);
	 	
	 	//멤버변수가 2개 이상이라면 고유한 주소값을 더해서 반환하면 된다.
	 	return nameHCode +hCode+waponHCode;
	 }
	 public boolean equals(){
	 	System.out.println("equals() 호출됨");
	 	
	 	Avengers avengers = (Avengers)obj;
	 	//각각의 멤버변수ㅏ 가진 값에 대한 비교를 진행한다.
	 	if(this.name.equals(avenger.name) 
	 		&& this.heroName.equals(avenger.heroName)
	 		&& this.weqpon.equals(avenger.weapon)){
	 		return true;
	 	}
	 	else{
	 		return false;
	 	}
	 }
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avengers other = (Avengers) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
}

public class QuHashSet {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();
		Scanner sc = new Scanner(System.in);

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		//이름으로 검색하기 - 이터레이터 활용.
		System.out.print("검색할이름을 입력하세욤: ");
		String name = sc.nextLine();
		Iterator<Avengers> itr = set.iterator(); // 알고싶은 클래스의 참조변수
		/*
		 while(itr.hasNext()){
		 Avengers avn = itr. next(); // => 두번 패쓰하지 않도록 넣어주는 거ㅣ
		 	//검색할 내용과 이터레이터를 통해 비교하는 이름을 비고
		 	 if(searchname.equals(avn){
		 	 	System.out.println(avn);
		 	 }
		 }
		 */
		
		while(itr.hasNext()) {
			Avengers avg = itr.next();
			
			if(avg.name.equals(name)) {
				System.out.println(avg.name);
				System.out.println("요청하신정보를 찾았습니다.");
				break;	
			}
			else if(!(itr.hasNext())) //만약 끝날때까지 없다면! 그런데 그냥 else했을때는 스티븐로져스만 무한반복함 ㅋㅋ
				System.out.println("해당 영웅은 없어요ㅜㅜ");

			}
		
		
	}
}
