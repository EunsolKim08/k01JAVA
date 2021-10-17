package ex17Collection;
/*
 사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 
 알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.

 */
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	
	String name;
	int age;
	String stNum;
	
	public Student(String name, int age, String stNum) {
		this.name = name;
		this.age = age;
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println("이름: "+name+", 나이: "+age+ ", 학번: "+ stNum);
	}
}
public class QuArrayList {
	
	public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>(); // Student 타입이라서 삭제하려면  Student 참조변수를 삭제해야 하는건가
	
		Scanner sc = new Scanner(System.in);
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		
		System.out.printf("검색할 이름을 입력하세요: ");
		String sn= sc.nextLine();
		//컬렉션의 인덱스는 항상 0부터 시작이므로 초기값은 -1로 해주는게 좋다.
		int index = -1;
		/*
		 for(Student st: list){
		 	//멤버변수 name은 private 멤버이므로 getter를 통해 접근
		 	if(sn.equals(st.getName())){
		 	index = list.indexOf(st);
		 	}
		 }
		 */
		for(Student st: list) {
			if(st.getName().equals(sn)) {
				index = list.indexOf(st);
				System.out.println("삭제된 객체정보입니다.");
				st.showInfo();
				list.remove(index);
				break;
			}
		}
		/*
		 if index == -1){
		 	System.out.println("검색결과가 업습니다.");
		 }
		 else{
		 	list.remove(index).showInfo();
		 }
		 */
		if(index == -1) {
			System.out.println("찾는정보가 없습니다.");
		}
	
		
		/*
		  컬렉션에 저장된 객체를 통해 삭제하면 삭제된 객체자체를 반환하므로
		  멤버메서드를 바로 호출할 수 있다.
		  */
		/*
		 System.out.println("삭제 후 전체정보 출력");
		 for(Student st: list){
		 //참조변수를 그대로 print()해야하는 경우라면 toString()메서드를 적절히 오버라이딩 해야한다.
		 	System.out.println(st.getInfo());
		 }
		 */
		
		System.out.println("[ 삭제 후 정보출력 ]");
		for(Student st: list) {
			st.showInfo();
		}
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력

		//4.전체정보 출력
	}


}
